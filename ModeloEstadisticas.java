package miniencuesta;

import java.util.List;


public class ModeloEstadisticas {

    private int contadorWindows = 0;
    private int contadorLinux = 0;
    private int contadorMac = 0;
    private int contadorProgramacion = 0;
    private int contadorDiseno = 0;
    private int contadorAdmin = 0;

    //para calcular el promedio de horas
    private double totalHoras = 0;
    private int totalEncuestas = 0;

    /**
     * método que recibe los datos de una encuesta, guardada y actualiza todos los contadores.
     */
    public void registrarEncuesta(ModeloEncuesta encuesta) {
        totalEncuestas++;

        // Sumamos las horas para el promedio
        totalHoras += encuesta.getHoras(); // Necesitarás añadir un getter para las horas en ModeloEncuesta

        switch (encuesta.getSistemaOperativo()) { // Y un getter para el SO
            case "Windows":
                contadorWindows++;
                break;
            case "Linux":
                contadorLinux++;
                break;
            case "Mac":
                contadorMac++;
                break;
        }

    List<String> especialidades = encuesta.getEspecialidades();
    for (String esp : especialidades) {
        switch (esp) {
            case "Programacion":
                contadorProgramacion++;
                break;
            case "Diseno Grafico":
                contadorDiseno++;
                break;
            case "Administracion":
                contadorAdmin++;
                break;
        }
    }
    }

    // --- Métodos "Getter" para que el nuevo formulario pueda leer los datos ---

    public int getContadorWindows() {
        return contadorWindows;
    }
    public int getContadorLinux() {
        return contadorLinux;
    }
    public int getContadorMac() {
        return contadorMac;
    }
    public int getContadorProgramacion() {
        return contadorProgramacion;
    }
    public int getContadorDiseno() {
        return contadorDiseno;
    }
    public int getContadorAdmin() {
        return contadorAdmin;
    }
    
    public double getPromedioHoras() {
        // Evitamos la división por cero si aún no hay encuestas
        if (totalEncuestas == 0) {
            return 0;
        }
        return totalHoras / totalEncuestas;
    }

    public int getTotalEncuestas() {
        return totalEncuestas;
    }
     public double getPorcentajeWindows() {
        // Si el total es 0, el porcentaje es 0 para evitar errores de división.
        if (getTotalEncuestas() == 0) return 0.0;
        return ((double) getContadorWindows() / getTotalEncuestas()) * 100.0;
    }
     
    public double getPorcentajeLinux() {
        if (getTotalEncuestas() == 0) return 0.0;
        return ((double) getContadorLinux() / getTotalEncuestas()) * 100.0;
    }
    
    public double getPorcentajeMac() {
        if (getTotalEncuestas() == 0) return 0.0;
        return ((double) getContadorMac() / getTotalEncuestas()) * 100.0;
    }
    
    public double getPorcentajeProgramacion() {
        if (getTotalEncuestas() == 0) return 0.0;
        return ((double) getContadorProgramacion() / getTotalEncuestas()) * 100.0;
    }
    
    public double getPorcentajeDiseno() {
        if (getTotalEncuestas() == 0) return 0.0;
        return ((double) getContadorDiseno() / getTotalEncuestas()) * 100.0;
    }
    
    public double getPorcentajeAdmin() {
        if (getTotalEncuestas() == 0) return 0.0;
        return ((double) getContadorAdmin() / getTotalEncuestas()) * 100.0;
    }
    
}