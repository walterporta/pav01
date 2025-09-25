package miniencuesta;

/**
 *
 * @author grupo31
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.List;

public class ControladorEncuesta implements ActionListener {

    private ModeloEncuesta modelo;
    private VistaEncuesta vista;
    private ModeloEstadisticas estadisticas;
    private VistaEstadisticas vistaStats;

    public ControladorEncuesta(ModeloEncuesta modelo, VistaEncuesta vista, ModeloEstadisticas estadisticas, VistaEstadisticas vistaStats) {
        this.modelo = modelo;
        this.vista = vista;
        this.estadisticas = estadisticas;

        this.vista.addGenerarListener(this);

        this.vista.addVerEstadisticasListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getBtnGenerar()) {

            String os = vista.getSistemaOperativoSeleccionado();
            List<String> especialidades = vista.getEspecialidadesSeleccionadas();
            int horas = vista.getHorasSeleccionadas();

            if (os == null) {
                JOptionPane.showMessageDialog(vista, "Por favor, seleccione una opción de Sistema Operativo.", "Datos incompletos", JOptionPane.WARNING_MESSAGE);
                return;
            }

            modelo.setSistemaOperativo(os);
            modelo.setEspecialidades(especialidades);
            modelo.setHoras(horas);

            if (modelo.guardarEnArchivo()) {

                this.estadisticas.registrarEncuesta(this.modelo);
                vista.limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(vista, "Hubo un error al guardar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == vista.getBtnVerEstadisticas()) {

            if (this.vistaStats == null) {
                this.vistaStats = new VistaEstadisticas(this.estadisticas);
            }

            this.vistaStats.actualizarDatos();

            this.vistaStats.setVisible(true);
        }
    }
}
