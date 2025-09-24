package miniencuesta;

/**
 *
 * @author Grupo31
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class ModeloEncuesta {

    private String sistemaOperativo;
    private String especialidad;
    private int horas;

// Setters
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getHoras() {
        return horas;
    }

    public boolean guardarEnArchivo() {
        try (FileWriter fw = new FileWriter("encuesta_resultados.txt", true); PrintWriter pw = new PrintWriter(fw)) {
            pw.println("--- Nueva entrada ---");
            pw.println("Sistema Operativo: " + sistemaOperativo);
            pw.println("Especialidad: " + especialidad);
            pw.println("Horas en el ordenador: " + horas);
            pw.println(); // salto de linea
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
            return false;

        }
    }

}
