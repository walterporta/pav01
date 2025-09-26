
package tp01.controlador;


import tp01.modelo.ImitadorModelo;
import tp01.vista.ImitadorVistaN;

public class ImitadorControlador {
    private ImitadorModelo modelo;
    private ImitadorVistaN vista;

    public ImitadorControlador(ImitadorModelo modelo, ImitadorVistaN vista) {
        this.modelo = modelo;
        this.vista = vista;
        iniciarEventos();
    }

    private void iniciarEventos() {
        vista.getTxtOriginal().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                String texto = vista.getTxtOriginal().getText();
                modelo.setTexto(texto);
                vista.getTxtEspejo().setText(texto);
            }
        });

        vista.getRb1Original().addActionListener(e -> {
            vista.getRb1Espejo().setSelected(vista.getRb1Original().isSelected());
        });
        vista.getRb2Original().addActionListener(e -> {
            vista.getRb2Espejo().setSelected(vista.getRb2Original().isSelected());
        });
        vista.getRb3Original().addActionListener(e -> {
            vista.getRb3Espejo().setSelected(vista.getRb3Original().isSelected());
        });

        vista.getChk1Original().addActionListener(e ->
            vista.getChk1Espejo().setSelected(vista.getChk1Original().isSelected()));
        vista.getChk2Original().addActionListener(e ->
            vista.getChk2Espejo().setSelected(vista.getChk2Original().isSelected()));
        vista.getChk3Original().addActionListener(e ->
            vista.getChk3Espejo().setSelected(vista.getChk3Original().isSelected()));

        vista.getComboOriginal().addActionListener(e ->
            vista.getComboEspejo().setSelectedIndex(vista.getComboOriginal().getSelectedIndex()));

        vista.getSpinnerOriginal().addChangeListener(e ->
            vista.getSpinnerEspejo().setValue(vista.getSpinnerOriginal().getValue()));
    }
}