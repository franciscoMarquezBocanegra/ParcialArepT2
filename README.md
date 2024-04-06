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

###

## Pruebas


Nota: Dado que el proyecto se construyó para ser corrido remotamente este no funciona en local

![image](https://github.com/SantiagoBayona/Parcial-02-AREP/assets/64861204/e6589c7a-d412-4e44-80e2-b7ebc48bc323)

### En remoto

Al ingresar a la dirección

```
http://ec2-54-226-221-104.compute-1.amazonaws.com:4568
```

Vemos que el recurso carga

![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/093391ec-8539-40f4-aba1-f7e23e8f17e1)


## Clase que resuelve el problema 

![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/fea2b4f4-b24d-45ab-b839-d36692129a32)

![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/bee4c841-aef0-436f-ae9b-23190da61160)

![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/b9729f99-4039-48d9-a07c-04280102e603)



## Ejemplos de funcionamiento
```
http://ec2-54-226-221-104.compute-1.amazonaws.com:4568/linearsearch?list=10,20,13,40,60&value=13
```
![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/c76c3a6f-5c25-442e-a90f-ad60d2f1195a)

```
http://ec2-54-226-221-104.compute-1.amazonaws.com:4568/linearsearch?list=10,20,13,40,60&value=99
```
![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/f0e13708-91fb-4134-82ad-fce3484020fb)


```
http://ec2-54-226-221-104.compute-1.amazonaws.com:4568/binarysearch?list=10,20,13,40,60&value=13
```
![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/e11b9235-f8d0-4565-9179-5060f1894db0)




### Video

https://youtu.be/06jwTNKWbX4?feature=shared


### Video mejorado

https://youtu.be/xSBempligjE


### Autor Francisco Marquez
