public class Pedido {
    
    public void procesarPedido(double precioUnidad, int cantidad) {
        double totalCompra = precioUnidad * cantidad;
                                                                         // Cambios de refactorización en la rama de "Desarrollo"
        totalCompra = aplicarDescuento(totalCompra);
        
        System.out.println("El precio final del pedido es: " + totalCompra);
    }

    private double aplicarDescuento(double total) {
        if (total > 100) {
            return total * 0.9; // Se aplica un 10% de descuento
        }
        return total;
    }
}
