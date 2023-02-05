package UI.Feedback.Current.Resistor;

import Convert.Measurement;
import UI.ComboBox.ComboItem;
import UI.ComboBox.ComboSI;

public class CurrentHighSideResistor extends javax.swing.JDialog {

    public CurrentHighSideResistor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelIcon = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        LabelShunt = new javax.swing.JLabel();
        BNCalculator = new javax.swing.JButton();
        SpinnerVout = new javax.swing.JSpinner();
        ComboVoutUnit = new javax.swing.JComboBox<>();
        LabelVout = new javax.swing.JLabel();
        SpinnerVShunt = new javax.swing.JSpinner();
        ComboVShuntUnit = new javax.swing.JComboBox<>();
        LabelRBValue = new javax.swing.JLabel();
        LabelRA = new javax.swing.JLabel();
        SpinnerRA = new javax.swing.JSpinner();
        ComboRAUnit = new javax.swing.JComboBox<>();
        LabelRB = new javax.swing.JLabel();
        LabelRS = new javax.swing.JLabel();
        LabelRSValue = new javax.swing.JLabel();
        LabelPRS = new javax.swing.JLabel();
        LabelPRSValue = new javax.swing.JLabel();
        LabelCurrent = new javax.swing.JLabel();
        ComboCurrentUnit = new javax.swing.JComboBox<>();
        SpinnerCurrent = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("High Side Curent Amplifier");
        setResizable(false);

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Feedback/Current/Resistor/HighSide.png"))); // NOI18N

        PanelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        SpinnerVShunt.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.001f), Float.valueOf(0.001f), Float.valueOf(999.0f), Float.valueOf(0.001f)));

        ComboVShuntUnit.setModel(ComboSI.Voltage());

        LabelRBValue.setText("-");

        LabelRA.setText("RA:");

        SpinnerRA.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        ComboRAUnit.setModel(ComboSI.Resistor());

        LabelRB.setText("RB:");

        LabelRS.setText("RS:");

        LabelRSValue.setText("-");

        LabelPRS.setText("PRS");

        LabelPRSValue.setText("-");

        LabelCurrent.setText("Current:");

        ComboCurrentUnit.setModel(ComboSI.Voltage());

        SpinnerCurrent.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.001f), Float.valueOf(0.001f), Float.valueOf(999.0f), Float.valueOf(0.001f)));

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
                            .addComponent(LabelRA)
                            .addComponent(LabelRB)
                            .addComponent(LabelRS)
                            .addComponent(LabelPRS)
                            .addComponent(LabelCurrent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(SpinnerVout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                        .addComponent(SpinnerVShunt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(SpinnerRA))
                                    .addComponent(SpinnerCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ComboVShuntUnit, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                                    .addComponent(ComboVoutUnit, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboRAUnit, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboCurrentUnit, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(LabelPRSValue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRSValue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRBValue, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCurrent)
                    .addComponent(ComboCurrentUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(SpinnerRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboRAUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRB)
                    .addComponent(LabelRBValue))
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
        double ra = Double.valueOf(SpinnerRA.getValue().toString()) * Double.valueOf(((ComboItem) ComboRAUnit.getSelectedItem()).value);
        double gain = (vout / vshunt);
        double rb = gain * ra;

        LabelRBValue.setText(m.Convert(rb));
        LabelRSValue.setText(m.Convert(rshunt));
        LabelPRSValue.setText(m.Convert(pd));

    }//GEN-LAST:event_BNCalculatorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNCalculator;
    private javax.swing.JComboBox<ComboItem> ComboCurrentUnit;
    private javax.swing.JComboBox<ComboItem> ComboRAUnit;
    private javax.swing.JComboBox<ComboItem> ComboVShuntUnit;
    private javax.swing.JComboBox<ComboItem> ComboVoutUnit;
    private javax.swing.JLabel LabelCurrent;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelPRS;
    private javax.swing.JLabel LabelPRSValue;
    private javax.swing.JLabel LabelRA;
    private javax.swing.JLabel LabelRB;
    private javax.swing.JLabel LabelRBValue;
    private javax.swing.JLabel LabelRS;
    private javax.swing.JLabel LabelRSValue;
    private javax.swing.JLabel LabelShunt;
    private javax.swing.JLabel LabelVout;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JSpinner SpinnerCurrent;
    private javax.swing.JSpinner SpinnerRA;
    private javax.swing.JSpinner SpinnerVShunt;
    private javax.swing.JSpinner SpinnerVout;
    // End of variables declaration//GEN-END:variables
}
