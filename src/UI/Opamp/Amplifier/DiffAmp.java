package UI.Opamp.Amplifier;

import Convert.Measurement;
import UI.ComboBox.ComboItem;
import UI.ComboBox.ComboSI;

public class DiffAmp extends javax.swing.JDialog {

    public DiffAmp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelIcon = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        LabelV1 = new javax.swing.JLabel();
        LabelR1 = new javax.swing.JLabel();
        BNCalculator = new javax.swing.JButton();
        SpinnerR2 = new javax.swing.JSpinner();
        ComboR2Unit = new javax.swing.JComboBox<>();
        LabelR2 = new javax.swing.JLabel();
        LabelVOUT = new javax.swing.JLabel();
        SpinnerV1 = new javax.swing.JSpinner();
        ComboV1Unit = new javax.swing.JComboBox<>();
        SpinnerR1 = new javax.swing.JSpinner();
        ComboR1Unit = new javax.swing.JComboBox<>();
        LabelVOUTValue = new javax.swing.JLabel();
        LabelR3 = new javax.swing.JLabel();
        SpinnerR3 = new javax.swing.JSpinner();
        LabelR4 = new javax.swing.JLabel();
        SpinnerR4 = new javax.swing.JSpinner();
        ComboR3Unit = new javax.swing.JComboBox<>();
        ComboR4Unit = new javax.swing.JComboBox<>();
        LabelV2 = new javax.swing.JLabel();
        SpinnerV2 = new javax.swing.JSpinner();
        ComboV2Unit = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Non Inverting Amplifier");

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Opamp/Amplifier/DiffAmp.png"))); // NOI18N

        PanelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelV1.setText("V1:");

        LabelR1.setText("R1:");

        BNCalculator.setText("Calculator");
        BNCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNCalculatorActionPerformed(evt);
            }
        });

        SpinnerR2.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        ComboR2Unit.setModel(ComboSI.Resistor());

        LabelR2.setText("R2:");

        LabelVOUT.setText("VOUT:");

        SpinnerV1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.001f), Float.valueOf(-999.0f), Float.valueOf(999.0f), Float.valueOf(0.001f)));

        ComboV1Unit.setModel(ComboSI.Voltage());

        SpinnerR1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(1.0f)));

        ComboR1Unit.setModel(ComboSI.Resistor());

        LabelVOUTValue.setText("-");

        LabelR3.setText("R3:");

        SpinnerR3.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        LabelR4.setText("R4:");

        SpinnerR4.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        ComboR3Unit.setModel(ComboSI.Resistor());

        ComboR4Unit.setModel(ComboSI.Resistor());

        LabelV2.setText("V2:");

        SpinnerV2.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.001f), Float.valueOf(-999.0f), Float.valueOf(999.0f), Float.valueOf(0.001f)));

        ComboV2Unit.setModel(ComboSI.Voltage());

        javax.swing.GroupLayout PanelInputLayout = new javax.swing.GroupLayout(PanelInput);
        PanelInput.setLayout(PanelInputLayout);
        PanelInputLayout.setHorizontalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BNCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelV1)
                            .addComponent(LabelV2)
                            .addComponent(LabelR1)
                            .addComponent(LabelR2)
                            .addComponent(LabelR3))
                        .addGap(23, 23, 23)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SpinnerV1)
                                    .addComponent(SpinnerR1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SpinnerV2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboV2Unit, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboV1Unit, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboR1Unit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpinnerR2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SpinnerR3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboR2Unit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboR3Unit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addComponent(LabelR4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SpinnerR4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addComponent(LabelVOUT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelVOUTValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboR4Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelV1)
                    .addComponent(ComboV1Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelV2)
                    .addComponent(SpinnerV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboV2Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelR1)
                    .addComponent(SpinnerR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboR1Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SpinnerR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelR2))
                    .addComponent(ComboR2Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelR3)
                    .addComponent(SpinnerR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboR3Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelR4)
                    .addComponent(SpinnerR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboR4Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVOUT)
                    .addComponent(LabelVOUTValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BNCalculator)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNCalculatorActionPerformed
        Measurement m = new Measurement();
        double v1 = Double.valueOf(SpinnerV1.getValue().toString()) * Double.valueOf(((ComboItem) ComboV1Unit.getSelectedItem()).value);
        double v2 = Double.valueOf(SpinnerV2.getValue().toString()) * Double.valueOf(((ComboItem) ComboV2Unit.getSelectedItem()).value);
        double r1 = Double.valueOf(SpinnerR1.getValue().toString()) * Double.valueOf(((ComboItem) ComboR1Unit.getSelectedItem()).value);
        double r2 = Double.valueOf(SpinnerR2.getValue().toString()) * Double.valueOf(((ComboItem) ComboR2Unit.getSelectedItem()).value);
        double r3 = Double.valueOf(SpinnerR3.getValue().toString()) * Double.valueOf(((ComboItem) ComboR3Unit.getSelectedItem()).value);
        double r4 = Double.valueOf(SpinnerR4.getValue().toString()) * Double.valueOf(((ComboItem) ComboR4Unit.getSelectedItem()).value);
        double va=  v1 * (r2 / (r2 + r1)) * ((r3 + r4) / r3);
        double vb = v2 * (r4 / r3);
        double out = va-vb;

        LabelVOUTValue.setText(m.Convert(out));
    }//GEN-LAST:event_BNCalculatorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNCalculator;
    private javax.swing.JComboBox<ComboItem> ComboR1Unit;
    private javax.swing.JComboBox<ComboItem> ComboR2Unit;
    private javax.swing.JComboBox<ComboItem> ComboR3Unit;
    private javax.swing.JComboBox<ComboItem> ComboR4Unit;
    private javax.swing.JComboBox<ComboItem> ComboV1Unit;
    private javax.swing.JComboBox<ComboItem> ComboV2Unit;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelR1;
    private javax.swing.JLabel LabelR2;
    private javax.swing.JLabel LabelR3;
    private javax.swing.JLabel LabelR4;
    private javax.swing.JLabel LabelV1;
    private javax.swing.JLabel LabelV2;
    private javax.swing.JLabel LabelVOUT;
    private javax.swing.JLabel LabelVOUTValue;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JSpinner SpinnerR1;
    private javax.swing.JSpinner SpinnerR2;
    private javax.swing.JSpinner SpinnerR3;
    private javax.swing.JSpinner SpinnerR4;
    private javax.swing.JSpinner SpinnerV1;
    private javax.swing.JSpinner SpinnerV2;
    // End of variables declaration//GEN-END:variables
}
