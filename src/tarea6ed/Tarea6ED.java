package tarea6ed;

/**
 * Clase principal para probar la aplicación de descuentos.
 */
public class Tarea6ED {

    /**
     * Método principal para probar la aplicación de descuentos.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Tarea6EDClase miCarrito = extraccionMetodo();
        miCarrito.aplicarDescuento(100, 5);
    }

    /**
     * Crea una instancia de Tarea6EDClase.
     *
     * @return Una instancia de Tarea6EDClase.
     */
    public static Tarea6EDClase extraccionMetodo() {
        Tarea6EDClase miCarrito = new Tarea6EDClase();
        return miCarrito;
    }
}


