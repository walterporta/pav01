package miniencuesta;

/**
 *
 * @author gustavo
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorEncuesta implements ActionListener {

    private ModeloEncuesta modelo;
    private VistaEncuesta vista;
    private ModeloEstadisticas estadisticas;
    private VistaEstadisticas vistaStats;

    public ControladorEncuesta(ModeloEncuesta modelo, VistaEncuesta vista, ModeloEstadisticas estadisticas, VistaEstadisticas vistaStats) {
        this.modelo = modelo;
        this.vista = vista;
        this.estadisticas = estadisticas;
       // this.vistaStats = vistaStats;

        //para que escuche los eventos del boton generar
        this.vista.addGenerarListener(this);
        // para que escuche los eventos de Estadísticas
        this.vista.addVerEstadisticasListener(this);
    }

    //metodo que se ejecuta al pulsar Generar
    @Override
    public void actionPerformed(ActionEvent e) {

        // ===== ACCIÓN SI SE PRESIONA EL BOTÓN "GENERAR" =====
        if (e.getSource() == vista.getBtnGenerar()) {

            // 1. Obtengo los datos de la vista
            String os = vista.getSistemaOperativoSeleccionado();
            String especialidad = vista.getEspecialidadSeleccionada();
            int horas = vista.getHorasSeleccionadas();

            // 2. Verifico que se haya seleccionado una opción en cada grupo
            if (os == null || especialidad == null) {
                JOptionPane.showMessageDialog(vista, "Por favor, seleccione una opción para cada campo.", "Datos incompletos", JOptionPane.WARNING_MESSAGE);
                return; // Detiene la ejecución si faltan datos
            }

            // 3. Actualizo el modelo con los datos de la vista
            modelo.setSistemaOperativo(os);
            modelo.setEspecialidad(especialidad);
            modelo.setHoras(horas);

            // 4. Guardo los datos y actualizo las estadísticas si todo va bien
            if (modelo.guardarEnArchivo()) {
              //  JOptionPane.showMessageDialog(vista, "Datos guardados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                this.estadisticas.registrarEncuesta(this.modelo);
                vista.limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(vista, "Hubo un error al guardar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // ===== ACCIÓN SI SE PRESIONA EL BOTÓN "VER ESTADÍSTICAS" =====
        if (e.getSource() == vista.getBtnVerEstadisticas()) {
    // 1. Comprueba si la ventana NO ha sido creada (si la variable es null)
    if (this.vistaStats == null) {
        // Si no existe, la crea AHORA y la guarda en la variable
        this.vistaStats = new VistaEstadisticas(this.estadisticas);
    }
    
    // 2. Antes de mostrarla, se asegura de que los datos estén actualizados
    this.vistaStats.actualizarDatos();
    
    // 3. La hace visible (ya sea la recién creada o la que ya existía)
    this.vistaStats.setVisible(true);
}
    }
}
