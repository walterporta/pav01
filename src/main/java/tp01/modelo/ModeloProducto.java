package tp01.modelo;
/**
 * Modelo básico para Producto - Versión simplificada para facultad
 * @author TuNombre
 */
public class ModeloProducto {
    
    private String nombre;
    private String descripcion;
    private double precio;
    
    // Constructor
    public ModeloProducto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    // Constructor vacío
    public ModeloProducto() {
        this("", "", 0.0);
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    // Método para mostrar en la lista
    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
    
    // Método para guardar en archivo (formato simple)
    public String toFileString() {
        return nombre + "|" + descripcion + "|" + precio;
    }
    
    // Método para cargar desde archivo
    public static ModeloProducto fromFileString(String linea) {
        String[] partes = linea.split("\\|");
        if (partes.length == 3) {
            try {
                return new ModeloProducto(
                    partes[0], 
                    partes[1], 
                    Double.parseDouble(partes[2])
                );
            } catch (NumberFormatException e) {
                return null;
            }
        }
        return null;
    }
}
