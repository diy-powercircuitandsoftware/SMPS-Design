package UI.ErrorAmp;

import Convert.Measurement;
import UI.ComboBox.ComboItem;
import javax.swing.DefaultComboBoxModel;

public class ErrorAmpT2 extends javax.swing.JDialog {
    
    public ErrorAmpT2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelIcon = new javax.swing.JLabel();
        LabelSF = new javax.swing.JLabel();
        SpinnerSF = new javax.swing.JSpinner();
        ComboSFUnit = new javax.swing.JComboBox<>();
        LabelVCC = new javax.swing.JLabel();
        SpinnerVCC = new javax.swing.JSpinner();
        LabelVSaw = new javax.swing.JLabel();
        SpinnerVSaw = new javax.swing.JSpinner();
        LabelLO = new javax.swing.JLabel();
        LabelCO = new javax.swing.JLabel();
        SpinnerLO = new javax.swing.JSpinner();
        ComboLOUnit = new javax.swing.JComboBox<>();
        SpinnerCO = new javax.swing.JSpinner();
        ComboCOUnit = new javax.swing.JComboBox<>();
        LabelCESR = new javax.swing.JLabel();
        SpinnerCESR = new javax.swing.JSpinner();
        Label1RF = new javax.swing.JLabel();
        SpinnerRF = new javax.swing.JSpinner();
        ComboRFUnit = new javax.swing.JComboBox<>();
        ScrollPaneOutput = new javax.swing.JScrollPane();
        TextAreaOutput = new javax.swing.JTextArea();
        BNCalculator = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ErrorAmpType2");

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ErrorAmp/error_amp_02.png"))); // NOI18N

        LabelSF.setText("Switching Frequency:");

        SpinnerSF.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        ComboSFUnit.setModel(new DefaultComboBoxModel(new ComboItem[] {new ComboItem("k","1000"), new ComboItem("M","1000000")}));

        LabelVCC.setText("VCC:");

        SpinnerVCC.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        LabelVSaw.setText("VSawtooth(Max):");

        SpinnerVSaw.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        LabelLO.setText("L(Output):");

        LabelCO.setText("C(Output):");

        SpinnerLO.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        ComboLOUnit.setModel(new DefaultComboBoxModel(new ComboItem[] {new ComboItem("-","1"), new ComboItem("m","0.001"),new ComboItem("u","0.000001")}));

        SpinnerCO.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(10000.0f), Float.valueOf(1.0f)));

        ComboCOUnit.setModel(new DefaultComboBoxModel(new ComboItem[] {new ComboItem("-","1"), new ComboItem("m","0.001"),new ComboItem("u","0.000001")}));

        LabelCESR.setText("C ESR(Output):");

        SpinnerCESR.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.01f), Float.valueOf(0.01f), Float.valueOf(10.0f), Float.valueOf(0.01f)));

        Label1RF.setText("R Feedback(RF):");

        SpinnerRF.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        ComboRFUnit.setModel(new DefaultComboBoxModel(new ComboItem[] {new ComboItem( "-","1"),new ComboItem("k","1000"), new ComboItem("M","1000000")}));

        TextAreaOutput.setEditable(false);
        TextAreaOutput.setColumns(20);
        TextAreaOutput.setRows(5);
        ScrollPaneOutput.setViewportView(TextAreaOutput);

        BNCalculator.setText("Calculator");
        BNCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNCalculatorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelSF)
                            .addComponent(LabelLO)
                            .addComponent(LabelVSaw)
                            .addComponent(LabelVCC)
                            .addComponent(LabelCO)
                            .addComponent(LabelCESR)
                            .addComponent(Label1RF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SpinnerRF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboRFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SpinnerVCC)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SpinnerSF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboSFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SpinnerVSaw)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SpinnerLO)
                                    .addComponent(SpinnerCO))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboCOUnit, 0, 100, Short.MAX_VALUE)
                                    .addComponent(ComboLOUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(SpinnerCESR)))
                    .addComponent(ScrollPaneOutput)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BNCalculator)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelIcon)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelVCC)
                            .addComponent(SpinnerVCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelVSaw)
                            .addComponent(SpinnerVSaw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelSF)
                            .addComponent(SpinnerSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboSFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelLO)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SpinnerLO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboLOUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCO)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SpinnerCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboCOUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCESR)
                            .addComponent(SpinnerCESR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpinnerRF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboRFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label1RF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPaneOutput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BNCalculator)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNCalculatorActionPerformed
        Measurement m = new Measurement();
        double vcc = Double.valueOf(SpinnerVCC.getValue().toString());
        double vsawtooth = Double.valueOf(SpinnerVSaw.getValue().toString());
        double swfeq = Double.valueOf(SpinnerSF.getValue().toString()) * Double.valueOf(((ComboItem) ComboSFUnit.getSelectedItem()).value);
        double lo = Double.valueOf(SpinnerLO.getValue().toString()) * (Double.valueOf(((ComboItem) ComboLOUnit.getSelectedItem()).value));
        double co = Double.valueOf(SpinnerCO.getValue().toString()) * (Double.valueOf(((ComboItem) ComboCOUnit.getSelectedItem()).value));
        double cesr = Double.valueOf(SpinnerCESR.getValue().toString());
        double rfeedback = Double.valueOf(SpinnerRF.getValue().toString()) * (Double.valueOf(((ComboItem) ComboRFUnit.getSelectedItem()).value));
        double flc = 1 / (2 * Math.PI * Math.sqrt(lo * co));
        double fesr = 1 / (2 * Math.PI * cesr * co);
        double fo = swfeq / 10;
        double fzero = 0.75 * flc;
        double fpole = swfeq / 2;
        double r1 = (rfeedback * fesr * vsawtooth * fo) / (vcc * Math.pow(flc, 2));
        double c1 = 1 / (2 * Math.PI * r1 * fzero);
        double c2 = 1 / (2 * Math.PI * r1 * fpole);
        TextAreaOutput.setText("");
        TextAreaOutput.append("CrossOver=" + m.Convert(fo) + "hz\n");
        TextAreaOutput.append("Pole=" + m.Convert(fpole) + "hz\n");
        TextAreaOutput.append("Low Pass LC=" + m.Convert(flc) + "hz\n");
        TextAreaOutput.append("Low Pass ESR=" + m.Convert(fesr) + "hz\n");
        TextAreaOutput.append("Zero=" + m.Convert(fzero) + "hz\n");
        TextAreaOutput.append("R1=" + m.Convert(r1) + "ohm\n");
        TextAreaOutput.append("C1=" + m.Convert(c1) + "f\n");
        TextAreaOutput.append("C2=" + m.Convert(c2) + "f\n");
        TextAreaOutput.append("flc<<fesr<<fo<<fpole=" + String.valueOf((flc < fesr) && (fesr < fo) && (fo < fpole)));
        
    }//GEN-LAST:event_BNCalculatorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNCalculator;
    private javax.swing.JComboBox<ComboItem> ComboCOUnit;
    private javax.swing.JComboBox<ComboItem> ComboLOUnit;
    private javax.swing.JComboBox<ComboItem> ComboRFUnit;
    private javax.swing.JComboBox<ComboItem> ComboSFUnit;
    private javax.swing.JLabel Label1RF;
    private javax.swing.JLabel LabelCESR;
    private javax.swing.JLabel LabelCO;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelLO;
    private javax.swing.JLabel LabelSF;
    private javax.swing.JLabel LabelVCC;
    private javax.swing.JLabel LabelVSaw;
    private javax.swing.JScrollPane ScrollPaneOutput;
    private javax.swing.JSpinner SpinnerCESR;
    private javax.swing.JSpinner SpinnerCO;
    private javax.swing.JSpinner SpinnerLO;
    private javax.swing.JSpinner SpinnerRF;
    private javax.swing.JSpinner SpinnerSF;
    private javax.swing.JSpinner SpinnerVCC;
    private javax.swing.JSpinner SpinnerVSaw;
    private javax.swing.JTextArea TextAreaOutput;
    // End of variables declaration//GEN-END:variables
}
