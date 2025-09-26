package tp01.controlador;

import tp01.vista.VistaProductos;
import tp01.modelo.ModeloProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Controlador básico para la lista de productos - Versión simplificada
 * @author TuNombre
 */
public class ControladorProductos implements ActionListener {
    
    private VistaProductos vista;
    private List<ModeloProducto> productos;
    private String archivoActual;
    
    public ControladorProductos(VistaProductos vista) {
        this.vista = vista;
        this.productos = new ArrayList<>();
        this.archivoActual = null;
        
        // Configurar listeners
        this.vista.addSeleccionarListener(this);
        this.vista.addImportarListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Botón Seleccionar Archivo
        if (e.getSource() == vista.getBtnSeleccionarArchivo()) {
            vista.seleccionarArchivo();
        }
        
        // Botón Importar Datos
        else if (e.getSource() == vista.getBtnImportarDatos()) {
            importarDatos();
        }
    }
    
    private void importarDatos() {
        try {
            String rutaArchivo = vista.getRutaArchivo();
            if (rutaArchivo == null || rutaArchivo.trim().isEmpty()) {
                JOptionPane.showMessageDialog(vista, 
                    "Por favor seleccione un archivo primero", 
                    "Archivo no seleccionado", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            productos.clear();
            vista.limpiarTabla();
            
            try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    linea = linea.trim();
                    if (!linea.isEmpty()) {
                        ModeloProducto producto = ModeloProducto.fromFileString(linea);
                        if (producto != null) {
                            productos.add(producto);
                            vista.agregarProducto(producto.getNombre(), producto.getDescripcion(), producto.getPrecio());
                        }
                    }
                }
            }
            
            archivoActual = rutaArchivo;
            
            JOptionPane.showMessageDialog(vista, 
                "Se cargaron " + productos.size() + " productos", 
                "Carga exitosa", 
                JOptionPane.INFORMATION_MESSAGE);
                
        } catch (IOException e) {
            JOptionPane.showMessageDialog(vista, 
                "Error al cargar el archivo: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void guardarArchivo() {
        if (archivoActual == null) {
            System.out.println("No hay archivo cargado para guardar");
            return;
        }
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivoActual))) {
            DefaultTableModel modelo = vista.getModelo();
            for (int i = 0; i < modelo.getRowCount(); i++) {
                String nombre = (String) modelo.getValueAt(i, 0);
                String descripcion = (String) modelo.getValueAt(i, 1);
                Object precioObj = modelo.getValueAt(i, 2);
                String precio = precioObj.toString();
                
                writer.println(nombre + "|" + descripcion + "|" + precio);
            }
            
            System.out.println("Archivo actualizado automáticamente");
                
        } catch (IOException e) {
            JOptionPane.showMessageDialog(vista, 
                "Error al actualizar el archivo: " + e.getMessage(), 
                "Error de guardado", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
