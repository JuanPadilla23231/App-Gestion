RESUMEN EJECUTIVO.
a.	Descripción- Doña Luisa se dedica a la venta por catálogo de diversos artículos, destacándose principalmente en la venta de calzado, aunque también ofrece productos como ropa, perfumes, entre otros. Los productos provienen del catálogo de la tienda Price Shoes. Su principal mercado está compuesto por sus vecinos y personas conocidas.
Los clientes revisan los catálogos o acceden directamente a la página web de la tienda para seleccionar los productos que desean comprar. Luego, comparten sus elecciones con Doña Luisa, quien realiza la compra en la tienda física y posteriormente se encarga de entregar los productos a los clientes.
En cuanto a los métodos de pago, Doña Luisa ofrece opciones de pago al contado y pagos diferidos semanales. Actualmente, la gestión de sus finanzas se realiza manualmente, utilizando únicamente una libreta.
Es por este motivo que decidí desarrollar este proyecto: para sistematizar las finanzas y las ventas de Doña Luisa mediante una aplicación web.
 b. Problema identificado-  El principal problema identificado en este proyecto es la falta de una adecuada gestión y organización en los siguientes aspectos: 
•	Administración de pagos: No se lleva un control efectivo de los pagos realizados por los clientes.
•	Registro de clientes: No existe un sistema organizado para almacenar información de los clientes.
•	Control financiero: No se tiene claridad sobre el dinero invertido ni sobre las ganancias esperadas.
•	Seguimiento de pagos: Los clientes no tienen visibilidad de los pagos realizados ni de los pendientes para completar sus compras.
•	Confianza en el registro: La libreta utilizada actualmente carece de orden y estructura, lo que genera desconfianza en algunos clientes.
c. Solución-  Propuesta de aplicación web basada en Java EE una aplicación web que ofrezca las siguientes funcionalidades:
1.	Gestión de clientes:
o	Registro de información clave, como nombre, teléfono, dirección y un apartado de comentarios para notas relevantes.
2.	Roles de usuario:
o	Cliente:
	Podrá visualizar sus pagos realizados y los pendientes.
	Tendrá la opción de solicitar un pedido ingresando el ID del producto deseado. Sin embargo, el pedido solo procederá tras ser aprobado por el vendedor.
o	Vendedor:
	Tendrá privilegios de administrador, incluyendo la gestión de finanzas y control total de los pedidos.
3.	Registro de pedidos:
o	El vendedor registrará cada pedido, incluyendo:
	Producto vendido (ID del producto).
	Precio para el vendedor.
	Precio para el cliente.
	Cliente que adquiere el producto.
	Comentarios adicionales sobre el pedido.
o	Aceptación de Pedidos Solicitados por el Cliente:
	Si el cliente levanta un pedido desde su perfil, el vendedor deberá revisar y aceptar el pedido antes de procesarlo.
	El pedido incluirá:
        * ID del producto solicitado.
        * Nombre del cliente solicitante.
        * Fecha de la solicitud.
	Una vez aceptado ,por ultimo el vendedor carga el precio de vendedor y precio a cliente y el pedido se registrará automáticamente como aprobado y pasará al historial de ventas del cliente.
4.	Reportes financieros:
o	El vendedor podrá generar reportes detallados que muestren:
	Inversiones realizadas.
	Ganancias obtenidas.
5.	Control de pagos:
o	Al iniciar sesión, el vendedor podrá:
	Visualizar a los clientes con pagos pendientes.
	 Cuando el cliente realiza un pago, el vendedor debe registrar la transacción en el sistema, el registro incluirá: 
                              *Identificación del cliente.
                              *Monto del pago realizado.
                              *Fecha y hora del pago.
                              *Estado del saldo restante
	Consultar el historial de clientes que ya han liquidado sus deudas.

6.	Transparencia para el cliente:
o	Los clientes podrán verificar que sus pagos han sido correctamente registrados.
o	Se les notificará si están al día o en atraso, con una advertencia de cargos adicionales por días vencidos.

Estas son las herramientas que se utilizan para poder trabajar con la app:
*Java Versio 17
*Apache Tomcat Version 9.0.96
*Spring Tools 4
*Oracle Corporation. MySQL Version 8.0.40
<br>
<a href="https://github.com/JuanPadilla23231/App-Gestion/wiki/Requerimientos:">Requerimientos</a>
<br>
<a href="https://github.com/JuanPadilla23231/App-Gestion/wiki/Instalaci%C3%B3n">Instalacion</a>
<br>
<a href="https://github.com/JuanPadilla23231/App-Gestion/wiki/Configuraci%C3%B3n">Configuracion</a>
<br>
<a href="https://github.com/JuanPadilla23231/App-Gestion/wiki/Uso">Configuracion</a>

