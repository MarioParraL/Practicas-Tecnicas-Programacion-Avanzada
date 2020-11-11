# PracticasTecnicasProgra.
Nombre: Mario Parra

En la práctica 1 he realizado dos clases.

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


He realizado una nueva clase llamada ReservaCliente que almacena los datos del cliente que hecho la reserva

He realizado los tests correspondientes de las clases: Hotel, Restaurante y ReservaCliente.
