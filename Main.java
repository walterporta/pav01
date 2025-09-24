package miniencuesta;

/**
 *
 * @author gustavo
 */
public class Main {

    public static void main(String[] args) {

        ModeloEncuesta modelo = new ModeloEncuesta();
        VistaEncuesta vista = new VistaEncuesta();
        ModeloEstadisticas estadisticas = new ModeloEstadisticas();
        VistaEstadisticas vistaEstadisticas = new VistaEstadisticas(estadisticas);
        
        ControladorEncuesta controlador = new ControladorEncuesta(modelo, vista, estadisticas, vistaEstadisticas);

        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
