public class PruebaArticulo {
    public static void main(String[] args) {
        Articulo[] arrayArticulo = new Articulo[3];
        arrayArticulo[0] = new Articulo("T001", "Teclado Logitech K860");
        arrayArticulo[1] = new Articulo("T002", "Mouse inalámbrico Razer");
        arrayArticulo[2] = new Articulo("T003", "Auriculares Sony WH-1000XM4");

        
        arrayArticulo[0].setPrecioCompra(100);
        arrayArticulo[0].setPrecioVenta(150);
        arrayArticulo[0].setStock(20);

        arrayArticulo[1].setPrecioCompra(50);
        arrayArticulo[1].setPrecioVenta(80);
        arrayArticulo[1].setStock(15);

        arrayArticulo[2].setPrecioCompra(250);
        arrayArticulo[2].setPrecioVenta(350);
        arrayArticulo[2].setStock(10);

        
        for (Articulo articulo : arrayArticulo) {
            articulo.mostrarArticulo();
            System.out.println("--------------------");
        }
    }
}
