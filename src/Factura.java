public class Factura {
    // Variables de instancia
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        setCantidad(cantidad);
        setPrecioPorArticulo(precioPorArticulo);
    }

    // Métodos set y get para numeroPieza
    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    // Métodos set y get para descripcionPieza
    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    // Métodos set y get para cantidad (con validación)
    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    // Métodos set y get para precioPorArticulo (con validación)
    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // Método para calcular el monto de la factura
    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}