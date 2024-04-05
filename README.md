# ParcialArepT2

### Instalación

1. Clonar el repositorio

```
https://github.com/franciscoMarquezBocanegra/ParcialArepT2
```

2. Dentro del directorio del proyecto lo construimos e instalamos

```
mvn package
```

```
mvn clean install
```

## Ejecución

### En local

1. Corremos el servidor

```
java -cp "target/classes;target/dependency/*" org.example.SparkWebServer
```

```
java -cp "target/classes;target/dependency/*" org.example.Proxy
```

### En la instancia ec2

Ejecutamos las clases con los comandos

```
java -cp "./bin/classes:./bin/dependency/*" org.example.SparkWebServer
```

```
java -cp "./bin/classes:./bin/dependency/*" org.example.Proxy
```



