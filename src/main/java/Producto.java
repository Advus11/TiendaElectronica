class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;

    public Producto(String nombre, String descripcion, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }
//getters y setters
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }

    public void actualizarStock(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock disponible.");
        }
    }

    public void modificarInformacion(String nuevaDescripcion, double nuevoPrecio, int nuevoStock) {
        this.descripcion = nuevaDescripcion;
        this.precio = nuevoPrecio;
        this.stock = nuevoStock;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDescripcion: " + descripcion +
                "\nPrecio: " + precio + "\nStock: " + stock + "\nCategoria: " + categoria;
    }
}
