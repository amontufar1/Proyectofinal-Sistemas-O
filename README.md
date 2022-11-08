# Proyectofinal-Sistemas-O
simular un gestor de memoria
## Especificaciones del programa 
____________________________
Este proyecto consta del uso de memoria virtual y tabla de páginas. Cuando un proceso creado no tenga el espacio suficiente en
memoria física deberá utilizar memoria virtual, es decir a disco por lo que también es necesario
implementar una tabla de páginas y cuando un proceso finalice su ejecución se cargarán las páginas que
estén en disco

### Manual de Usuario 
____________________________
En esta pantalla el Usuario debe de digitar El tamaño de la memoria principal, seguido de la memoria secunadaria y el tamaño de paginas
Se encuentra predeterminado pero el usuario puede cambiarlo si el quisiera 
[![Captura-de-pantalla-1.jpg](https://i.postimg.cc/wvw3N3N1/Captura-de-pantalla-1.jpg)](https://postimg.cc/tZVXQq2b)
Luego el usuario presiona el boton de instalar 


Luego el usuario podra crear un nuevo proceso con el nombre y el tamaño del proceso 
[![Captura-de-pantalla2.jpg](https://i.postimg.cc/j5ftx5XV/Captura-de-pantalla2.jpg)](https://postimg.cc/62BDzBgz)


Para en la siguiente ventana ver la lista de procesos donde esta el ID del proceso, El Nombre, el tamaño, la pagina 
El estado, paginas en memoria y paginas almacenadas 
[![Captura-de-pantalla3.jpg](https://i.postimg.cc/WbTFyLNp/Captura-de-pantalla3.jpg)](https://postimg.cc/DmpwWN4R)



En esta ventana el Usuario podra ver los procesos creados en la memoria principal con el numero de macro, el ID del proceso,El nombre del Proceso
y el numero de la pagina    
[![Captura-de-pantalla-4.jpg](https://i.postimg.cc/sf0q6y97/Captura-de-pantalla-4.jpg)](https://postimg.cc/pyzsrwSL)


De haberse llenado la memoria los procesos iran directo a la memoria secundaria en donde el usuario podra ver el numero de almacenamiento el ID del proceso,
el nombre del proceso y el numero de pagina 
[![Captura-de-pantalla-5.jpg](https://i.postimg.cc/XNRqMMnB/Captura-de-pantalla-5.jpg)](https://postimg.cc/mhSBM5zT)

En el espacio donde el usuario podra ver la lista de botones tambien tendra el acceso a 5 botones los cuales le permitiran cambiar el estado del proceso 
Los cuales son:
1. Suspender /listo
2. Suspender/ bloquear
3. Eliminar
4. Listo
5. bloquear
[![Captura-de-pantalla-6.jpg](https://i.postimg.cc/4dztKpbs/Captura-de-pantalla-6.jpg)](https://postimg.cc/0MyrFMBB)

  Tambien el usuario podra ver el cuadro de las estadisticas en donde podra ver un resumen de de la cantidad de memoria,la memoria disponible,la memoria en uso
  la cantidad de procesos,macros  de pagina , el tamaño de la pagina,el tamaño de la memoria secundario y por ultimo la cantidad de memoria secundaria disponible 
  [![captura-7.jpg](https://i.postimg.cc/tCy30vdk/captura-7.jpg)](https://postimg.cc/bdCDkTBS)
