package UI.Opamp.Amplifier;

import Convert.Measurement;
import UI.ComboBox.ComboItem;
import UI.ComboBox.ComboSI;

public class NonInvertAmp extends javax.swing.JDialog {

    public NonInvertAmp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelIcon = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        LabelVIN = new javax.swing.JLabel();
        LabelR1 = new javax.swing.JLabel();
        BNCalculator = new javax.swing.JButton();
        SpinnerR2 = new javax.swing.JSpinner();
        ComboR2Unit = new javax.swing.JComboBox<>();
        LabelR2 = new javax.swing.JLabel();
        LabelVOUT = new javax.swing.JLabel();
        SpinnerVIN = new javax.swing.JSpinner();
        ComboVINUnit = new javax.swing.JComboBox<>();
        SpinnerR1 = new javax.swing.JSpinner();
        ComboR1Unit = new javax.swing.JComboBox<>();
        LabelVOUTValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Non Inverting Amplifier");

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Opamp/Amplifier/NonInvertAmp.png"))); // NOI18N

        PanelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelVIN.setText("VIN:");

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

        SpinnerVIN.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.001f), Float.valueOf(0.001f), Float.valueOf(999.0f), Float.valueOf(0.001f)));

        ComboVINUnit.setModel(ComboSI.Voltage());

        SpinnerR1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(1.0f)));

        ComboR1Unit.setModel(ComboSI.Resistor());

        LabelVOUTValue.setText("-");

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
                            .addComponent(LabelR1)
                            .addComponent(LabelVOUT)
                            .addComponent(LabelR2)
                            .addComponent(LabelVIN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SpinnerR2)
                                    .addComponent(SpinnerR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(SpinnerVIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelInputLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(ComboVINUnit, 0, 90, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboR1Unit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboR2Unit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addComponent(LabelVOUTValue)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelVIN)
                    .addComponent(ComboVINUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelR1)
                    .addComponent(ComboR1Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelR2)
                    .addComponent(SpinnerR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboR2Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVOUT)
                    .addComponent(LabelVOUTValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BNCalculator)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIcon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNCalculatorActionPerformed
        Measurement m = new Measurement();
        double vin = Double.valueOf(SpinnerVIN.getValue().toString()) * Double.valueOf(((ComboItem) ComboVINUnit.getSelectedItem()).value);
        double r1 = Double.valueOf(SpinnerR1.getValue().toString()) * Double.valueOf(((ComboItem) ComboR1Unit.getSelectedItem()).value);
        double r2 = Double.valueOf(SpinnerR2.getValue().toString()) * Double.valueOf(((ComboItem) ComboR2Unit.getSelectedItem()).value);
        double out = (1 + (r2 / r1)) * vin;
        LabelVOUTValue.setText(m.Convert(out));

    }//GEN-LAST:event_BNCalculatorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNCalculator;
    private javax.swing.JComboBox<ComboItem> ComboR1Unit;
    private javax.swing.JComboBox<ComboItem> ComboR2Unit;
    private javax.swing.JComboBox<ComboItem> ComboVINUnit;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelR1;
    private javax.swing.JLabel LabelR2;
    private javax.swing.JLabel LabelVIN;
    private javax.swing.JLabel LabelVOUT;
    private javax.swing.JLabel LabelVOUTValue;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JSpinner SpinnerR1;
    private javax.swing.JSpinner SpinnerR2;
    private javax.swing.JSpinner SpinnerVIN;
    // End of variables declaration//GEN-END:variables
}
