# ParcialArepT2

### Prerequisitos

Para este parcial se requirio de : 


Maven: Apache Maven es una herramienta que maneja el ciclo de vida del programa.



Git: Es un sistema de control de versiones distribuido (VCS).



Java 18: Java es un lenguaje de programación de propósito general orientado a objetos, portátil y muy versátil.

AWS Academy: Academia de AWS que ofrece cursos y recursos de aprendizaje que nos permiten a nosotros los estudiantes desarrollar diferentes habilidades relacionadas con la nube de AWS.


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

![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/cde38ccd-dd15-41b0-ab9a-847832322178)



### En remoto

Al ingresar a la dirección

```
http://ec2-54-226-221-104.compute-1.amazonaws.com:4568
```

Vemos que el recurso carga

![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/b12f3611-f387-489d-8f9d-7e28a9d1775a)


## Clases que resuelven el problema 


![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/bee4c841-aef0-436f-ae9b-23190da61160)

![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/b9729f99-4039-48d9-a07c-04280102e603)



## Ejemplos de funcionamiento
```
http://ec2-54-226-221-104.compute-1.amazonaws.com:4568/
```
## Linear search - Lista: 10,20,13,40 valor:13

![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/7a8a4047-86a0-431f-b26a-81dbffbd6e3b)

## Linear search - Lista: 10,20,13,40 valor:99

![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/68f36697-d2a8-4eff-bb3a-564fc771c96f)

## Binary search - Lista: 10,20,13,40 valor:13
![image](https://github.com/franciscoMarquezBocanegra/ParcialArepT2/assets/98216991/716e937a-f4b4-476a-9937-ff8c029ae7c5)


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




### Video día del parcial

https://youtu.be/06jwTNKWbX4?feature=shared


### Video mejorado

https://youtu.be/7u7PE5M-0-A


## Construido con

* [Maven](https://maven.apache.org/): Apache Maven es una herramienta que estandariza la configuración del ciclo de vida del proyecto.
* [Git](https://rometools.github.io/rome/):  Es un sistema de control de versiones distribuido (VCS).
* [Java 17](https://www.java.com/es/): Lenguaje de programación de propósito general con enfoque a el paradigma de orientado a objetos, y con un fuerte tipado de variables.
* [AWS](https://awsacademy.instructure.com/) : Academia de AWS que ofrece cursos y recursos de aprendizaje que nos permiten a nosotros los estudiantes desarrollar diferentes habilidades relacionadas con la nube de AWS.

### Autor 
Francisco Marquez
