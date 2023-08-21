import java.util.ArrayList;
import java.util.List;

class Tienda {
    private List<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void mostrarProductos() { //primera opcion
        for (Producto producto : productos) {
            System.out.println(producto.toString());
            System.out.println("----------------------");
        }
    }

    public List<Producto> buscarProducto(String clave) { //segunda opcion
        List<Producto> resultados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getNombre().toLowerCase().contains(clave.toLowerCase()) ||
                    producto.getCategoria().toLowerCase().contains(clave.toLowerCase())) {
                resultados.add(producto);
            }
        }
        return resultados;
    }

    public void agregarProducto(Producto producto) { //tercera opcion
        productos.add(producto);
        System.out.println("Producto agregado con exito.");
    }

    public void modificarProducto(String nombre, String nuevaDescripcion, double nuevoPrecio, int nuevoStock) { //cuarta opcion
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.modificarInformacion(nuevaDescripcion, nuevoPrecio, nuevoStock);
                System.out.println("Producto modificado con exito.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void eliminarProducto(String nombre) { //quinta opcion
        productos.removeIf(producto -> producto.getNombre().equalsIgnoreCase(nombre));
    }

    public void realizarCompra(String nombre, int cantidad) { //sexta opcion
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.actualizarStock(cantidad);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
}

