public class PruebaFactura {
    public static void main(String[] args) {
        // Creación de una factura de prueba con valores válidos
        Factura factura = new Factura("1234", "Martillo", 2, 15.50);

        System.out.println("Factura de ferreteria");
        System.out.println("Numero de pieza: " + factura.getNumeroPieza());
        System.out.println("Descripcion: " + factura.getDescripcionPieza());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por articulo: $" + String.format("%.2f", factura.getPrecioPorArticulo()));
        System.out.println("Monto de la factura: $" + String.format("%.2f", factura.obtenerMontoFactura()));

        System.out.println();

        // Prueba de valores no positivos (validación)
        factura.setCantidad(-2);
        factura.setPrecioPorArticulo(-5.0);

        System.out.println("Despues de asignar valores no positivos:");
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por articulo: $" + String.format("%.2f", factura.getPrecioPorArticulo()));
        System.out.println("Monto de la factura: $" + String.format("%.2f", factura.obtenerMontoFactura()));
    }
}