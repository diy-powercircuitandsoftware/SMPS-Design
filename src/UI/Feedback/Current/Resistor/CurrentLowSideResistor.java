package UI.Feedback.Current.Resistor;

import Convert.Measurement;
import UI.ComboBox.ComboItem;
import UI.ComboBox.ComboSI;

public class CurrentLowSideResistor extends javax.swing.JDialog {

    public CurrentLowSideResistor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelIcon = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        LabelCurrent = new javax.swing.JLabel();
        LabelShunt = new javax.swing.JLabel();
        BNCalculator = new javax.swing.JButton();
        SpinnerVout = new javax.swing.JSpinner();
        ComboVoutUnit = new javax.swing.JComboBox<>();
        LabelVout = new javax.swing.JLabel();
        SpinnerCurrent = new javax.swing.JSpinner();
        ComboCurrentUnit = new javax.swing.JComboBox<>();
        SpinnerVShunt = new javax.swing.JSpinner();
        ComboVShuntUnit = new javax.swing.JComboBox<>();
        LabelR2Value = new javax.swing.JLabel();
        LabelR1 = new javax.swing.JLabel();
        SpinnerR1 = new javax.swing.JSpinner();
        ComboR1Unit = new javax.swing.JComboBox<>();
        LabelR2 = new javax.swing.JLabel();
        LabelRS = new javax.swing.JLabel();
        LabelRSValue = new javax.swing.JLabel();
        LabelPRS = new javax.swing.JLabel();
        LabelPRSValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Low Side Curent Amplifier");
        setResizable(false);

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Feedback/Current/Resistor/LowSide.png"))); // NOI18N

        PanelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelCurrent.setText("Current:");

        LabelShunt.setText("VShunt:");

        BNCalculator.setText("Calculator");
        BNCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNCalculatorActionPerformed(evt);
            }
        });

        SpinnerVout.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        ComboVoutUnit.setModel(ComboSI.Resistor());

        LabelVout.setText("VOUT:");

        SpinnerCurrent.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.001f), Float.valueOf(0.001f), Float.valueOf(999.0f), Float.valueOf(0.001f)));

        ComboCurrentUnit.setModel(ComboSI.Voltage());

        SpinnerVShunt.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.001f), Float.valueOf(0.001f), Float.valueOf(999.0f), Float.valueOf(0.001f)));

        ComboVShuntUnit.setModel(ComboSI.Voltage());

        LabelR2Value.setText("-");

        LabelR1.setText("R1:");

        SpinnerR1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        ComboR1Unit.setModel(ComboSI.Resistor());

        LabelR2.setText("R2:");

        LabelRS.setText("RS:");

        LabelRSValue.setText("-");

        LabelPRS.setText("PRS");

        LabelPRSValue.setText("-");

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
                            .addComponent(LabelShunt)
                            .addComponent(LabelVout)
                            .addComponent(LabelCurrent)
                            .addComponent(LabelR1)
                            .addComponent(LabelR2)
                            .addComponent(LabelRS)
                            .addComponent(LabelPRS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SpinnerVout, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpinnerVShunt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(SpinnerCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SpinnerR1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ComboVShuntUnit, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                                    .addComponent(ComboVoutUnit, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboR1Unit, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboCurrentUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(LabelPRSValue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRSValue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelR2Value, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCurrent)
                    .addComponent(ComboCurrentUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerVShunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelShunt)
                    .addComponent(ComboVShuntUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVout)
                    .addComponent(SpinnerVout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboVoutUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboR1Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelR1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelR2)
                    .addComponent(LabelR2Value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRS)
                    .addComponent(LabelRSValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPRS)
                    .addComponent(LabelPRSValue))
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
        double current = Double.valueOf(SpinnerCurrent.getValue().toString()) * Double.valueOf(((ComboItem) ComboCurrentUnit.getSelectedItem()).value);
        double vshunt = Double.valueOf(SpinnerVShunt.getValue().toString()) * Double.valueOf(((ComboItem) ComboVShuntUnit.getSelectedItem()).value);
        double rshunt = vshunt / current;
        double pd = vshunt * current;
        double vout = Double.valueOf(SpinnerVout.getValue().toString()) * Double.valueOf(((ComboItem) ComboVoutUnit.getSelectedItem()).value);
        double r1 = Double.valueOf(SpinnerR1.getValue().toString()) * Double.valueOf(((ComboItem) ComboR1Unit.getSelectedItem()).value);
        double invvgain = (vout / vshunt) - 1;
        double r2 = invvgain * r1;

        LabelR2Value.setText(m.Convert(r2));
        LabelRSValue.setText(m.Convert(rshunt));
        LabelPRSValue.setText(m.Convert(pd));

    }//GEN-LAST:event_BNCalculatorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNCalculator;
    private javax.swing.JComboBox<ComboItem> ComboCurrentUnit;
    private javax.swing.JComboBox<ComboItem> ComboR1Unit;
    private javax.swing.JComboBox<ComboItem> ComboVShuntUnit;
    private javax.swing.JComboBox<ComboItem> ComboVoutUnit;
    private javax.swing.JLabel LabelCurrent;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelPRS;
    private javax.swing.JLabel LabelPRSValue;
    private javax.swing.JLabel LabelR1;
    private javax.swing.JLabel LabelR2;
    private javax.swing.JLabel LabelR2Value;
    private javax.swing.JLabel LabelRS;
    private javax.swing.JLabel LabelRSValue;
    private javax.swing.JLabel LabelShunt;
    private javax.swing.JLabel LabelVout;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JSpinner SpinnerCurrent;
    private javax.swing.JSpinner SpinnerR1;
    private javax.swing.JSpinner SpinnerVShunt;
    private javax.swing.JSpinner SpinnerVout;
    // End of variables declaration//GEN-END:variables
}
