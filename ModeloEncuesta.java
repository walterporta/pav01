package miniencuesta;

/**
 *
 * @author Grupo31
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

public class ModeloEncuesta {

    private String sistemaOperativo;
    private List<String> especialidades;
    private int horas;

// Setters
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public int getHoras() {
        return horas;
    }

public boolean guardarEnArchivo() {
    try (FileWriter fw = new FileWriter("encuesta_resultados.txt", true); 
         PrintWriter pw = new PrintWriter(fw)) {

        pw.println("--- Nueva entrada ---");
        pw.println("Sistema Operativo: " + sistemaOperativo);

        String especialidadesTexto = this.especialidades.isEmpty() 
            ? "Ninguna" 
            : String.join(", ", this.especialidades);
        pw.println("Especialidad(es): " + especialidadesTexto);

        pw.println("Horas en el ordenador: " + horas);
        pw.println();
        return true;
    } catch (IOException e) {
        System.err.println("Error al guardar el archivo: " + e.getMessage());
        return false;
    }
}

}
