public class Producto {

    private String codigoBarras, nombre, seccion;
    private double precio;

    public Producto(String codigoBarras, String nombre, String seccion, double precio) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.seccion = seccion;
        this.precio = precio;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", precio=" + precio + ", seccion="
                + seccion + "]";
    }

}
