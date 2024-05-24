package tarea6ed;

/**
 * Clase para gestionar descuentos en productos.
 */
public class Tarea6EDClase {

    /**
     * Aplica un descuento al precio de un producto basado en la cantidad de productos comprados.
     *
     * @param precioProducto El precio unitario del producto.
     * @param numero_Productos La cantidad de productos comprados.
     */
    public void aplicarDescuento(double precioProducto, int numero_Productos) {
        double Total;
        if (numero_Productos > 3) {
            precioProducto -= 5;
        }
        if (numero_Productos != 0) {
            Total = precioProducto * 0.8;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        } else {
            Total = precioProducto * cte;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");

        }
    }

    /**
     * Constante que representa el porcentaje de descuento para más de 3 productos.
     */
    public static final double cte = 0.95;
}
