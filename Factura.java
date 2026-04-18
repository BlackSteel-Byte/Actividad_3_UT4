public class Factura {
    private String nombreCliente;
    private double precioUnidad;
    private int cantidadProductos;

    public Factura(String nombreCliente, double precioUnidad, int cantidadProductos) {
        this.nombreCliente = nombreCliente;
        this.precioUnidad = precioUnidad;
        this.cantidadProductos = cantidadProductos;
    }

    // Lógica de calculo separada
    public double calcularPrecioFinal() {
        double subtotal = precioUnidad * cantidadProductos;
        return aplicarDescuento(subtotal);
    }

    // Patrón: Extract Method (Extracción de método para el descuento)
    private double aplicarDescuento(double total) {
        if (cantidadProductos > 10) {
            return total * 0.9; // Aplicamos el 10% de descuento
        }
        return total;
    }

    // Lógica de presentación separada
    public void mostrarResumen() {
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cantidad: " + cantidadProductos);
        System.out.println("Precio por unidad: " + precioUnidad);
        System.out.println("Total a pagar: " + calcularPrecioFinal());
    }

    public static void main(String[] args) {
        Factura facturaJuan = new Factura("Brayan", 15.0, 12);
        facturaJuan.mostrarResumen();
    }
}