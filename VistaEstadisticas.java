package miniencuesta;

/**
 *
 * @author gustavo
 */
public class VistaEstadisticas extends javax.swing.JFrame {

    private ModeloEstadisticas modelo;

    /**
     * Constructor de la ventana de estadísticas.
     * @param modelo El objeto que contiene todos los contadores y cálculos.
     */
    public VistaEstadisticas(ModeloEstadisticas modelo) {
        initComponents();
        this.modelo = modelo; 
        actualizarDatos();
        this.setLocationRelativeTo(null);
    }

    /**
     * Este método lee los datos del modelo y actualiza el texto de cada una
     * de las etiquetas (JLabel) en la ventana
     */
    public void actualizarDatos() {
        // --- Sistema Operativo ---
        lblWindowsTotal.setText(String.valueOf(modelo.getContadorWindows()));
        lblLinuxTotal.setText(String.valueOf(modelo.getContadorLinux()));
        lblMacTotal.setText(String.valueOf(modelo.getContadorMac()));

        lblWindowsPorcentaje.setText(String.format("%.1f%%", modelo.getPorcentajeWindows()));
        lblLinuxPorcentaje.setText(String.format("%.1f%%", modelo.getPorcentajeLinux()));
        lblMacPorcentaje.setText(String.format("%.1f%%", modelo.getPorcentajeMac()));

        // --- Especialidad ---
        lblProgramacionTotal.setText(String.valueOf(modelo.getContadorProgramacion()));
        lblDisenoTotal.setText(String.valueOf(modelo.getContadorDiseno()));
        lblAdminTotal.setText(String.valueOf(modelo.getContadorAdmin()));

        lblProgramacionPorcentaje.setText(String.format("%.1f%%", modelo.getPorcentajeProgramacion()));
        lblDisenoPorcentaje.setText(String.format("%.1f%%", modelo.getPorcentajeDiseno()));
        lblAdminPorcentaje.setText(String.format("%.1f%%", modelo.getPorcentajeAdmin()));

        // --- Promedio de Horas ---
        lblPromedioHoras.setText(String.format("%.2f horas", modelo.getPromedioHoras()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblWindowsTotal = new javax.swing.JLabel();
        lblWindowsPorcentaje = new javax.swing.JLabel();
        lblLinuxTotal = new javax.swing.JLabel();
        lblLinuxPorcentaje = new javax.swing.JLabel();
        lblMacTotal = new javax.swing.JLabel();
        lblMacPorcentaje = new javax.swing.JLabel();
        lblProgramacionTotal = new javax.swing.JLabel();
        lblProgramacionPorcentaje = new javax.swing.JLabel();
        lblDisenoTotal = new javax.swing.JLabel();
        lblDisenoPorcentaje = new javax.swing.JLabel();
        lblAdminTotal = new javax.swing.JLabel();
        lblAdminPorcentaje = new javax.swing.JLabel();
        lblPromedioHoras = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadstica de los resultados obtenidos");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(400, 600));
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Operativo");

        jLabel2.setText("Windows");

        jLabel3.setText("Linux");

        jLabel4.setText("Mac");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Especialidad");

        jLabel6.setText("Programacion");

        jLabel7.setText("Diseno Grafico");

        jLabel8.setText("Administracion");

        lblWindowsTotal.setText("jLabel10");

        lblWindowsPorcentaje.setText("jLabel11");

        lblLinuxTotal.setText("jLabel12");

        lblLinuxPorcentaje.setText("jLabel13");

        lblMacTotal.setText("jLabel14");

        lblMacPorcentaje.setText("jLabel15");

        lblProgramacionTotal.setText("jLabel16");

        lblProgramacionPorcentaje.setText("jLabel17");

        lblDisenoTotal.setText("jLabel18");

        lblDisenoPorcentaje.setText("jLabel19");

        lblAdminTotal.setText("jLabel20");

        lblAdminPorcentaje.setText("jLabel21");

        lblPromedioHoras.setText("jLabel9");

        jLabel9.setText("Promedio de horas dedicadas en el ordenador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblWindowsTotal)
                                        .addGap(18, 18, 18)))
                                .addGap(49, 49, 49))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblMacTotal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblLinuxTotal)))
                                .addGap(67, 67, 67)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWindowsPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLinuxPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMacPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblProgramacionPorcentaje))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDisenoTotal)
                                    .addComponent(lblProgramacionTotal)
                                    .addComponent(lblAdminTotal)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdminPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDisenoPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lblPromedioHoras)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblWindowsTotal)
                    .addComponent(lblWindowsPorcentaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblLinuxTotal)
                    .addComponent(lblLinuxPorcentaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblMacTotal)
                    .addComponent(lblMacPorcentaje))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblProgramacionTotal)
                    .addComponent(lblProgramacionPorcentaje))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblDisenoTotal)
                    .addComponent(lblDisenoPorcentaje))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblAdminTotal)
                    .addComponent(lblAdminPorcentaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPromedioHoras)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAdminPorcentaje;
    private javax.swing.JLabel lblAdminTotal;
    private javax.swing.JLabel lblDisenoPorcentaje;
    private javax.swing.JLabel lblDisenoTotal;
    private javax.swing.JLabel lblLinuxPorcentaje;
    private javax.swing.JLabel lblLinuxTotal;
    private javax.swing.JLabel lblMacPorcentaje;
    private javax.swing.JLabel lblMacTotal;
    private javax.swing.JLabel lblProgramacionPorcentaje;
    private javax.swing.JLabel lblProgramacionTotal;
    private javax.swing.JLabel lblPromedioHoras;
    private javax.swing.JLabel lblWindowsPorcentaje;
    private javax.swing.JLabel lblWindowsTotal;
    // End of variables declaration//GEN-END:variables
}
