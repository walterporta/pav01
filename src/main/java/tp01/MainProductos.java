package tp01;
import tp01.controlador.ControladorProductos;
import tp01.vista.VistaProductos;

public class MainProductos {
    
    public static void main(String[] args) {

        VistaProductos vista = new VistaProductos();
        ControladorProductos controlador = new ControladorProductos(vista);
        vista.setControlador(controlador);
        vista.setVisible(true);
    }
}
