public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura1 = new Factura("P-101", "Martillo de uña de 16 oz", 4, 15.50);

        System.out.println("=== DATOS DE LA FACTURA 1 ===");
        System.out.println("Número de pieza: " + factura1.getNumeroPieza());
        System.out.println("Descripción: " + factura1.getDescripcionPieza());
        System.out.println("Cantidad: " + factura1.getCantidad());
        System.out.println("Precio por artículo: $" + factura1.getPrecioPorArticulo());
        System.out.println("Monto total de la factura: $" + factura1.obtenerMontoFactura());

        System.out.println("\n------------------------------------\n");

        Factura factura2 = new Factura("P-202", "Cinta métrica de 5m", -5, -8.75);

        System.out.println("=== DATOS DE LA FACTURA 2 (Con validaciones) ===");
        System.out.println("Número de pieza: " + factura2.getNumeroPieza());
        System.out.println("Descripción: " + factura2.getDescripcionPieza());
        System.out.println("Cantidad (debe ser 0): " + factura2.getCantidad());
        System.out.println("Precio por artículo (debe ser 0.0): $" + factura2.getPrecioPorArticulo());
        System.out.println("Monto total de la factura: $" + factura2.obtenerMontoFactura());
    }
}