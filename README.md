# PracticasTecnicasProgra.
Nombre: Mario Parra

## En la práctica 1 he realizado dos clases.

La clase principal llamada Hotel que tiene estos atributos: nombre, dirección, fax, teléfono, día de inauguración, mes de inauguración, año de inauguración, nº de estrellas, nº de habitaciones y precio por noche.
El método calculaAntiguedad() nos dice cuántos años lleva el hotel dando servicio. Esta función toma como parámetros el día, mes y año de la inauguración y devuelve el los años que lleva prestando servicio.
Con el método calculaPrecioDiscapacitado() podemos saber en cada hotel el precio rebajado que tiene una persona con discapacidad.
El método getDatos() del hotel nos sirve para sacar por pantalla los datos del mismo.
El método añadirHotel() añade los datos de los hoteles que quiera la persona que mete datos por pantalla.

Por otro lado tenemos la clase Restaurante, que hereda de Hotel.
Esta clase hereda los atributos en común de la clase Hotel(nombre, dirección, fax y teléfono) y además tiene sus propios atributos como son: nº de camareros, nº de cocineros, precio del menú, nº de mesas, nº de comensales en la ultima semana y el aforo máximo.
Con el método calculaCuenta() podemos obtener el dinero gastado por los comensales del hotel en la última semana.
Igualmente que en la clase hotel tenemos un método añadirRestaurante().

En la clase Main he realizado dos vectores almacenan los hoteles y restaurante.
Además he hecho un menú (switch-case) con diferentes opciones que permite añadir hoteles y restaurantes e imprimirlos por pantalla.

## Práctica 2.

He realizado una nueva clase llamada ReservaCliente que almacena los datos del cliente que hecho la reserva.

He realizado los tests correspondientes de las clases: Hotel, Restaurante y ReservaCliente.

Mejora del main.

Diagrama de clases.

## Práctica 3.

Utilización de la Clase Local Date (main).

Implementación del diagrama de clases.

He generado un método con la clase math, en concreto "round". Quiere decir que devuelve el numero entero más cercano. En mi programa se encuentra en el método: public static double calculaPrecioDeportista(double precioPorNoche) de la clase Hotel.

He añadido el operador condicional "?:" al método: public double getPrecioPorNoche() de la clase Hotel.

He generado una Interfaz llamada IHotel.

He realizado la mejora del main añadiendo las reservas del cliente.

## Prática 4

Uso de tipos genéricos en clases e interfaces.

Nueva interfaz: GenericosTipo donde se definen los métodos de la clase Habitación.

Dos nuevas clases: Tipos y Habitacion. Esta última hereda de tipos.

En cuanto a lectura/escritura en fichero, al tener un dispositivo Mac me es tedioso. Necesito entenderlo.

## Diagrama de clases :


![DiagramaClases](/DiagramaClases.png)
