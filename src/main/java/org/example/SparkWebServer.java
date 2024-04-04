package org.example;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

public class SparkWebServer {

    public static void main(String... args){
        port(getPort());
        staticFiles.location("/public");

        // Endpoint para la búsqueda lineal
        get("/linearsearch", (req, res) -> {
            String[] list = req.queryParams("list").split(",");
            int value = Integer.parseInt(req.queryParams("value"));
            int index = linearSearch(list, value);
            return createResponse("linearSearch", req.queryParams("list"), String.valueOf(value), index);
        });

        // Endpoint para la búsqueda binaria
        get("/binarysearch", (req, res) -> {
            String[] list = req.queryParams("list").split(",");
            int value = Integer.parseInt(req.queryParams("value"));
            int index = binarySearch(list, value);
            return createResponse("binarySearch", req.queryParams("list"), String.valueOf(value), index);
        });
    }

    // Implementación de búsqueda lineal
    private static int linearSearch(String[] list, int value) {
        for (int i = 0; i < list.length; i++) {
            if (Integer.parseInt(list[i]) == value) {
                return i;
            }
        }
        return -1;
    }

    // Implementación de búsqueda binaria
    private static int binarySearch(String[] list, int value) {
        int left = 0;
        int right = list.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int midValue = Integer.parseInt(list[mid]);
            if (midValue == value) {
                return mid;
            }
            if (midValue < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Método para crear la respuesta en formato JSON
    private static String createResponse(String operation, String inputList, String value, int index) {
        return "{\n" +
                " \"operation\": \"" + operation + "\",\n" +
                " \"inputlist\": \"" + inputList + "\",\n" +
                " \"value\": \"" + value + "\",\n" +
                " \"output\": " + index + "\n" +
                "}";
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
