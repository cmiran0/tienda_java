import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> stock;

    public Tienda(ArrayList<Producto> stock) {
        this.stock = stock;
    }

    public Tienda() {
        this.stock = new ArrayList<>();
        stock.add(new Producto("producto_a", "Manzana", "1a", 10));
        stock.add(new Producto("producto_b", "Pera", "2a", 15));
        stock.add(new Producto("producto_c", "Tomate", "3a", 8));
        stock.add(new Producto("producto_d", "Piña", "4a", 7));
        stock.add(new Producto("producto_e", "Melon", "5a", 9));
        stock.add(new Producto("producto_f", "Coco", "6a", 11));
    }

    public void addProducto(Producto producto) {
        this.stock.add(producto);
    }

    public void delProducto(String codigoBarras) {

        // int i = 0;

        for (Producto producto : this.stock) {

            // producto.getCodigoBarras().equals(codigoBarras);

            if (producto.getCodigoBarras().equals(codigoBarras)) {
                // System.out.println(i);
                // System.out.println("foo");

                this.stock.remove(producto);

            }
            // System.out.println(codigoBarras);
            // System.out.println(producto.getCodigoBarras());
            // i++;

        }

    }

    public ArrayList<Producto> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Producto> stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Tienda [stock=" + stock + "]";
    }

}
