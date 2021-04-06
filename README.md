# Taller Amazon Gateway y Lambda
En este laboratorio vamos a implementar un servicio en amazon y montarlo en una máquina virtual de estas, con ayuda a Amazon EC2.  
Crearemos una API Gateway para poder acceder desde cualquier red o lugar a nuestro servicio implementado, vamos a implementar con ayuda de Amazon, montar el servicio en S3 e intentar que solo sea accesible desde el API Gateway y no de la máquina EC2.

## Prerequisitos
* Maven
* Git
* Java
* AWS
* CircleCi

## CircleCi  
 [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/Carlos96999/AREP-LAB-7)  

## AWS  


## Instalación
Para usar este programa debe abrir la consola (CMD) ir a la ubicación donde desee guardar el programa y ejecutar este comando:
```
git clone https://github.com/Carlos96999/AREP-LAB-7.git
```

## Ejecución
Entramos a la carpeta creada por el comando anterior y entramos a "AREP-LAB-4" desde la consola de comandos (CMD), ejecutamos estos comandos:
```
* mvn package
* mvn clean compile
```
<img src="https://github.com/Carlos96999/AREP-LAB-7/blob/master/img/ejecucion.PNG?raw=true">  

## Iniciar programa de forma local
Entramos a la carpeta creada del laboratorio "AREP-LAB-5" y ejecutamos el siguiente comando:  
```  
java -cp target/classes edu.escuelaing.arep.App
```  

## Pruebas
Si desea conocer la ejecución de las pruebas, puede ejecutar en consola el comando mvn test (en la misma ubicación donde ejecuto los comandos de la parte de Ejecución).

<img src="https://github.com/Carlos96999/AREP-LAB-7/blob/master/img/pruebas.PNG?raw=true">


## Documentación
Encontrara la documentación sobre el programa en la siguiente ubicación
```
javaDocs
```

<img src="https://github.com/Carlos96999/AREP-LAB-7/blob/master/img/documentacion.PNG?raw=true">

## Desarrollo
Este laboratorio fue construido con las siguiente herramientas:
* [Maven](https://maven.apache.org/)
* [Java](https://www.java.com/es/)
* [GIT](https://git-scm.com/)
* [AWS](https://aws.amazon.com/es/education/awseducate/)

## Licencia
[Licencia **GNU General Public License v3.0**](https://github.com/Carlos96999/AREP-LAB-7/blob/master/LICENSE)

## DERECHOS DE AUTOR

Programa desarrollado por:
[Carlos Andrés Amorocho](https://github.com/Carlos96999)
