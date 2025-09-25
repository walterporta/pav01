package imitador;

import imitador.controlador.ImitadorControlador;
import imitador.modelo.ImitadorModelo;
import imitador.vista.ImitadorVistaN;

public class Main {
    public static void main(String[] args) {
        ImitadorModelo modelo = new ImitadorModelo();
        ImitadorVistaN vista = new ImitadorVistaN();
        new ImitadorControlador(modelo, vista);
        vista.setVisible(true);
    }
}


