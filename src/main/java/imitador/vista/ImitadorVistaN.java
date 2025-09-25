
package imitador.vista;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;


public class ImitadorVistaN extends javax.swing.JFrame {

    public ImitadorVistaN() {
        initComponents();
        setTitle("Imitador");
        setLocationRelativeTo(null);
        setPreferredSize(new java.awt.Dimension(500, 300));
        setSize(350, 500);
        txtEspejo.setEnabled(false);
        rb1Espejo.setEnabled(false);
        rb2Espejo.setEnabled(false);
        rb3Espejo.setEnabled(false);
        chk1Espejo.setEnabled(false);
        chk2Espejo.setEnabled(false);
        chk3Espejo.setEnabled(false);
        comboEspejo.setEnabled(false);
        spinnerEspejo.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContainer = new javax.swing.JPanel();
        panelOriginal = new javax.swing.JPanel();
        txtOriginal = new javax.swing.JTextField();
        rb1Original = new javax.swing.JRadioButton();
        rb2Original = new javax.swing.JRadioButton();
        rb3Original = new javax.swing.JRadioButton();
        chk1Original = new javax.swing.JCheckBox();
        chk2Original = new javax.swing.JCheckBox();
        chk3Original = new javax.swing.JCheckBox();
        comboOriginal = new javax.swing.JComboBox<>();
        spinnerOriginal = new javax.swing.JSpinner();
        panelEspejo = new javax.swing.JPanel();
        txtEspejo = new javax.swing.JTextField();
        rb1Espejo = new javax.swing.JRadioButton();
        rb2Espejo = new javax.swing.JRadioButton();
        rb3Espejo = new javax.swing.JRadioButton();
        chk1Espejo = new javax.swing.JCheckBox();
        chk2Espejo = new javax.swing.JCheckBox();
        chk3Espejo = new javax.swing.JCheckBox();
        comboEspejo = new javax.swing.JComboBox<>();
        spinnerEspejo = new javax.swing.JSpinner();
        separator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelOriginal.setBorder(javax.swing.BorderFactory.createTitledBorder("Original"));

        rb1Original.setText("Opción 1");
        rb2Original.setText("Opción 2");
        rb3Original.setText("Opción 3");

        chk1Original.setText("Opción 4");
        chk2Original.setText("Opción 5");
        chk3Original.setText("Opción 6");

        comboOriginal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3" }));

        javax.swing.GroupLayout panelOriginalLayout = new javax.swing.GroupLayout(panelOriginal);
        panelOriginal.setLayout(panelOriginalLayout);
        panelOriginalLayout.setHorizontalGroup(
            panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOriginalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelOriginalLayout.createSequentialGroup()
                        .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb1Original)
                            .addComponent(rb2Original)
                            .addComponent(rb3Original))
                        .addGap(24, 24, 24)
                        .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk1Original)
                            .addComponent(chk2Original)
                            .addComponent(chk3Original)))
                    .addGroup(panelOriginalLayout.createSequentialGroup()
                        .addComponent(comboOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(spinnerOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelOriginalLayout.setVerticalGroup(
            panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOriginalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1Original)
                    .addComponent(chk1Original))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb2Original)
                    .addComponent(chk2Original))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb3Original)
                    .addComponent(chk3Original))
                .addGap(12, 12, 12)
                .addGroup(panelOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEspejo.setBorder(javax.swing.BorderFactory.createTitledBorder("Espejo"));

        rb1Espejo.setText("Opción 1");
        rb2Espejo.setText("Opción 2");
        rb3Espejo.setText("Opción 3");
        chk1Espejo.setText("Opción 4");
        chk2Espejo.setText("Opción 5");
        chk3Espejo.setText("Opción 6");
        comboEspejo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3" }));

        javax.swing.GroupLayout panelEspejoLayout = new javax.swing.GroupLayout(panelEspejo);
        panelEspejo.setLayout(panelEspejoLayout);
        panelEspejoLayout.setHorizontalGroup(
            panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspejoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEspejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEspejoLayout.createSequentialGroup()
                        .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb1Espejo)
                            .addComponent(rb2Espejo)
                            .addComponent(rb3Espejo))
                        .addGap(24, 24, 24)
                        .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk1Espejo)
                            .addComponent(chk2Espejo)
                            .addComponent(chk3Espejo)))
                    .addGroup(panelEspejoLayout.createSequentialGroup()
                        .addComponent(comboEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(spinnerEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelEspejoLayout.setVerticalGroup(
            panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspejoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb1Espejo)
                    .addComponent(chk1Espejo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb2Espejo)
                    .addComponent(chk2Espejo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb3Espejo)
                    .addComponent(chk3Espejo))
                .addGap(12, 12, 12)
                .addGroup(panelEspejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        separator.setOrientation(javax.swing.SwingConstants.HORIZONTAL);

        javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
        jPanelContainer.setLayout(jPanelContainerLayout);
        jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separator)
                    .addComponent(panelEspejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelEspejo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTxtOriginal() { return txtOriginal; }
    public JTextField getTxtEspejo() { return txtEspejo; }
    public JRadioButton getRb1Original() { return rb1Original; }
    public JRadioButton getRb2Original() { return rb2Original; }
    public JRadioButton getRb3Original() { return rb3Original; }
    public JRadioButton getRb1Espejo() { return rb1Espejo; }
    public JRadioButton getRb2Espejo() { return rb2Espejo; }
    public JRadioButton getRb3Espejo() { return rb3Espejo; }
    public JCheckBox getChk1Original() { return chk1Original; }
    public JCheckBox getChk2Original() { return chk2Original; }
    public JCheckBox getChk3Original() { return chk3Original; }
    public JCheckBox getChk1Espejo() { return chk1Espejo; }
    public JCheckBox getChk2Espejo() { return chk2Espejo; }
    public JCheckBox getChk3Espejo() { return chk3Espejo; }
    public JComboBox<String> getComboOriginal() { return comboOriginal; }
    public JComboBox<String> getComboEspejo() { return comboEspejo; }
    public JSpinner getSpinnerOriginal() { return spinnerOriginal; }
    public JSpinner getSpinnerEspejo() { return spinnerEspejo; }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk1Espejo;
    private javax.swing.JCheckBox chk1Original;
    private javax.swing.JCheckBox chk2Espejo;
    private javax.swing.JCheckBox chk2Original;
    private javax.swing.JCheckBox chk3Espejo;
    private javax.swing.JCheckBox chk3Original;
    private javax.swing.JComboBox<String> comboEspejo;
    private javax.swing.JComboBox<String> comboOriginal;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel panelEspejo;
    private javax.swing.JPanel panelOriginal;
    private javax.swing.JRadioButton rb1Espejo;
    private javax.swing.JRadioButton rb1Original;
    private javax.swing.JRadioButton rb2Espejo;
    private javax.swing.JRadioButton rb2Original;
    private javax.swing.JRadioButton rb3Espejo;
    private javax.swing.JRadioButton rb3Original;
    private javax.swing.JSeparator separator;
    private javax.swing.JSpinner spinnerEspejo;
    private javax.swing.JSpinner spinnerOriginal;
    private javax.swing.JTextField txtEspejo;
    private javax.swing.JTextField txtOriginal;
    // End of variables declaration//GEN-END:variables
}
