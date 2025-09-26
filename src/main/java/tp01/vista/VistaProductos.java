package tp01.vista;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import tp01.controlador.ControladorProductos;

/**
 * Vista básica para la lista de productos - Versión simplificada con JTable
 * @author TuNombre
 */
public class VistaProductos extends JFrame {
    
    // Componentes de la interfaz
    private JTextField txtRutaArchivo;
    private JButton btnSeleccionarArchivo;
    private JButton btnImportarDatos;
    private JTable tablaProductos;
    private DefaultTableModel modelo;
    private ControladorProductos controlador;
    
    public VistaProductos() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Lista de Productos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1000, 600));
        setLocationRelativeTo(null);
        
        // Panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        
        // Panel superior para selección de archivo
        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Selección de Archivo"));
        
        // Panel para la primera fila (archivo y botón seleccionar)
        JPanel panelArchivo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblArchivo = new JLabel("Seleccione un archivo txt:");
        txtRutaArchivo = new JTextField(40);
        txtRutaArchivo.setEditable(false);
        
        btnSeleccionarArchivo = new JButton("...");
        
        panelArchivo.add(lblArchivo);
        panelArchivo.add(txtRutaArchivo);
        panelArchivo.add(btnSeleccionarArchivo);
        
        // Panel para el botón de importar
        JPanel panelImportar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnImportarDatos = new JButton("Importar datos de txt");
        btnImportarDatos.setPreferredSize(new Dimension(200, 30));
        
        panelImportar.add(btnImportarDatos);
        
        panelSuperior.add(panelArchivo, BorderLayout.NORTH);
        panelSuperior.add(panelImportar, BorderLayout.SOUTH);
        
        // Tabla de productos
        String[] columnNames = {"Nombre", "Descripción", "Precio"};
        modelo = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Solo la columna de precio (índice 2) es editable
                return column == 2;
            }
        };
        
        tablaProductos = new JTable(modelo);
        
        // Configurar la tabla para que solo el precio sea editable
        tablaProductos.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean stopCellEditing() {
                try {
                    String value = (String) getCellEditorValue();
                    if (value != null && !value.trim().isEmpty()) {
                        Double.parseDouble(value.trim());
                    }
                    return super.stopCellEditing();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(VistaProductos.this, 
                        "El precio debe ser un número válido", 
                        "Error de formato", 
                        JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        });
        
        // Agregar listener para actualizar archivo cuando se edita precio
        modelo.addTableModelListener(e -> {
            if (e.getColumn() == 2 && e.getType() == javax.swing.event.TableModelEvent.UPDATE) {
                actualizarArchivo();
            }
        });
        
        JScrollPane scrollPane = new JScrollPane(tablaProductos);
        
        // Configurar el layout
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);
        
        add(panelPrincipal);
    }
    
    // Métodos para configurar listeners
    public void addSeleccionarListener(ActionListener listener) {
        btnSeleccionarArchivo.addActionListener(listener);
    }
    
    public void addImportarListener(ActionListener listener) {
        btnImportarDatos.addActionListener(listener);
    }
    
    // Métodos para obtener datos
    public String getRutaArchivo() {
        return txtRutaArchivo.getText();
    }
    
    // Métodos para manejar la tabla
    public void limpiarTabla() {
        modelo.setRowCount(0);
    }
    
    public void agregarProducto(String nombre, String descripcion, double precio) {
        modelo.addRow(new Object[]{nombre, descripcion, precio});
    }
    
    public DefaultTableModel getModelo() {
        return modelo;
    }
    
    // Método para seleccionar archivo
    public void seleccionarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de texto", "txt"));
        
        int resultado = fileChooser.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            txtRutaArchivo.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }
    
    // Getters para los botones
    public JButton getBtnSeleccionarArchivo() {
        return btnSeleccionarArchivo;
    }
    
    public JButton getBtnImportarDatos() {
        return btnImportarDatos;
    }
    
    // Método para establecer el controlador
    public void setControlador(ControladorProductos controlador) {
        this.controlador = controlador;
    }
    
    // Método para actualizar archivo cuando se edita precio
    private void actualizarArchivo() {
        if (controlador != null) {
            controlador.guardarArchivo();
        }
    }
}
