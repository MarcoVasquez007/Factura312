public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidadArticulos;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidadArticulos, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        setCantidadArticulos(cantidadArticulos);
        setPrecioPorArticulo(precioPorArticulo);
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        if (cantidadArticulos > 0) {
            this.cantidadArticulos = cantidadArticulos;
        } else {
            this.cantidadArticulos = 0;
        }
    }
    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    public double obtenerMontoFactura() {
        return cantidadArticulos * precioPorArticulo;
    }
}