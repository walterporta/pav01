package tp01;

import tp01.controlador.ImitadorControlador;
import tp01.modelo.ImitadorModelo;
import tp01.vista.ImitadorVistaN;

public class MainImitador {
    public static void main(String[] args) {
        ImitadorModelo modelo = new ImitadorModelo();
        ImitadorVistaN vista = new ImitadorVistaN();
        new ImitadorControlador(modelo, vista);
        vista.setVisible(true);
    }
}


