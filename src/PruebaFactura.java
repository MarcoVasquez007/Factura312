import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de pieza: ");
        String numPieza = entrada.nextLine();

        System.out.print("Ingrese el nombre de la herramienta (descripcion): ");
        String descripcion = entrada.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = entrada.nextInt();

        System.out.print("Ingrese el precio por articulo: ");
        double precio = entrada.nextDouble();

        Factura factura = new Factura(numPieza, descripcion, cantidad, precio);

        System.out.println("\nFactura de ferreteria");
        System.out.println("Numero de pieza: " + factura.getNumeroPieza());
        System.out.println("Descripcion: " + factura.getDescripcionPieza());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por articulo: $" + String.format("%.2f", factura.getPrecioPorArticulo()));
        System.out.println("Monto de la factura: $" + String.format("%.2f", factura.obtenerMontoFactura()));
    }
}