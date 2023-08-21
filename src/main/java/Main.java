import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Producto producto1 = new Producto("Polera", "Polera Nike", 20000, 27, "Ropa");
        Producto producto2 = new Producto("Zapatillas", "Zapatilla Puma", 30000, 20, "Calzado");

        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);

        tienda.mostrarProductos(); // Primera opcion

        System.out.println("Buscando productos por nombre o categoria:");//segunda opcion
        List<Producto> resultadosBusqueda = tienda.buscarProducto("Polera");
        for (Producto producto : resultadosBusqueda) {
            System.out.println(producto.toString());
            System.out.println("----------------------");
        }

        //tercera opcion
        Producto nuevoProducto = new Producto("Pantalon", "Pantalon Adidas", 25000, 15, "Ropa");
        tienda.agregarProducto(nuevoProducto);
        tienda.mostrarProductos();

        //cuarta opcion
        tienda.modificarProducto("Polera", "Polera deportiva", 23900, 30);
        tienda.mostrarProductos();

        //quinta opcion
        tienda.eliminarProducto("Zapatillas");
        tienda.mostrarProductos();

        //sexta opcion
        tienda.realizarCompra("Polera", 7);
        tienda.mostrarProductos();

    }
}