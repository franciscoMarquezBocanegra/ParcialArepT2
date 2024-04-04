package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static spark.Spark.*;

public class Proxy {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String[] SERVERS = new String[]{
            "http://ec2-34-228-166-8.compute-1.amazonaws.com:4567",
            "http://ec2-54-224-71-214.compute-1.amazonaws.com:4567"
    };

    private static int currentServer = 0;

    public static void main(String... args) {
        port(getPort());
        staticFiles.location("/public");

        // Endpoint para el proxy
        get("/proxy", (req, res) -> {
            String list = req.queryParams("list");
            String value = req.queryParams("value");
            String type = req.queryParams("type");

            // Validar el tipo de búsqueda
            if (type != null && (type.equals("linearsearch") || type.equals("binarysearch"))) {
                // Enviar la solicitud al tipo de búsqueda correspondiente
                return getURL(type, list, value);
            } else {
                return "Tipo de búsqueda no válido.";
            }
        });
    }

    public static String getURL(String operation, String list, String value) throws IOException {
        int server = currentServer;
        currentServer = (currentServer + 1) % 2;
        return getResponse(SERVERS[server] + "/" + operation + "?list=" + list + "&value=" + value);
    }

    public static String getResponse(String url) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        // Realizar la conexión
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        StringBuffer response = new StringBuffer();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
        return response.toString();
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4568;
    }
}
