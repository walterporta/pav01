package tp01.modelo;

public class ImitadorModelo {
    private String texto;
    private int opcionRadio;
    private boolean[] checks;
    private String combo;
    private int spinner;

    public ImitadorModelo() {
        checks = new boolean[3];
    }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public int getOpcionRadio() { return opcionRadio; }
    public void setOpcionRadio(int opcionRadio) { this.opcionRadio = opcionRadio; }

    public boolean[] getChecks() { return checks; }
    public void setChecks(boolean[] checks) { this.checks = checks; }

    public String getCombo() { return combo; }
    public void setCombo(String combo) { this.combo = combo; }

    public int getSpinner() { return spinner; }
    public void setSpinner(int spinner) { this.spinner = spinner; }
}