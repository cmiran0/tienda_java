import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Tienda fruteria = new Tienda();

        // System.out.println(fruteria.toString());

        for (Producto fruta : fruteria.getStock()) {
            System.out.println(fruta.getNombre());
        }
        System.out.println();

        fruteria.addProducto(new Producto("foxxx", "Perejil", "25", 28));
        for (Producto fruta : fruteria.getStock()) {
            System.out.println(fruta.getNombre());
        }

        System.out.println();

        fruteria.delProducto("foxxx");

        System.out.println();

        for (Producto fruta : fruteria.getStock()) {
            System.out.println(fruta.getNombre());
        }

    }
}
