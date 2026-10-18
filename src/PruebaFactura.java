import javax.swing.JOptionPane;

public class PruebaFactura {
    public static void main(String[] args) {
        String numeroPieza = JOptionPane.showInputDialog("Ingrese el número de la pieza:");
        String descripcionPieza = JOptionPane.showInputDialog("Ingrese la descripción de la pieza:");

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de artículos a comprar:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por artículo:"));

        Factura factura = new Factura(numeroPieza, descripcionPieza, cantidad, precio);
        String reporte = "=== DETALLES DE LA FACTURA ===\n" +
                "Número de pieza: " + factura.getNumeroPieza() + "\n" +
                "Descripción: " + factura.getDescripcionPieza() + "\n" +
                "Cantidad de artículos: " + factura.getCantidadArticulos() + "\n" +
                "Precio por artículo: $" + factura.getPrecioPorArticulo() + "\n" +
                "--------------------------------------------------\n" +
                "Monto total de la factura: $" + factura.obtenerMontoFactura();

        JOptionPane.showMessageDialog(null, reporte, "Resultado de la Factura", JOptionPane.INFORMATION_MESSAGE);