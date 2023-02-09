package UI.Feedback.Current.Filter;

import Convert.Measurement;
import UI.ComboBox.ComboItem;
import UI.ComboBox.ComboSI;

public class DifferentialModeFilter extends javax.swing.JDialog {

    public DifferentialModeFilter(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelIcon = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        SpinnerSF = new javax.swing.JSpinner();
        ComboSFUnit = new javax.swing.JComboBox<>();
        LabelRA = new javax.swing.JLabel();
        SpinnerRA = new javax.swing.JSpinner();
        ComboRAUnit = new javax.swing.JComboBox<>();
        LabelSF = new javax.swing.JLabel();
        LabelC1 = new javax.swing.JLabel();
        LabelC1Output = new javax.swing.JLabel();
        BNCalculator = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Differential Mode Filter");
        setResizable(false);

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Feedback/Current/Filter/DifferentialModeFilter.png"))); // NOI18N

        PanelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SpinnerSF.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        ComboSFUnit.setModel(ComboSI.Frequency());

        LabelRA.setText("RA:");

        SpinnerRA.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        ComboRAUnit.setModel(ComboSI.Resistor());

        LabelSF.setText("Frequency:");

        LabelC1.setText("C1:");

        LabelC1Output.setText("-");

        BNCalculator.setText("Calculator");
        BNCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNCalculatorActionPerformed(evt);
            }
        });

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
                            .addComponent(LabelSF)
                            .addComponent(LabelRA)
                            .addComponent(LabelC1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpinnerRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SpinnerSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboRAUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboSFUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(LabelC1Output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSF)
                    .addComponent(SpinnerSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRA)
                    .addComponent(SpinnerRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboRAUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelC1)
                    .addComponent(LabelC1Output, javax.swing.GroupLayout.Alignment.TRAILING))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelIcon)
                    .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNCalculatorActionPerformed
        Measurement m = new Measurement();
        double swfeq = Double.valueOf(SpinnerSF.getValue().toString()) * Double.valueOf(((ComboItem) ComboSFUnit.getSelectedItem()).value);
        double r = Double.valueOf(SpinnerRA.getValue().toString()) * Double.valueOf(((ComboItem) ComboRAUnit.getSelectedItem()).value);
        double c = 1 / (2 * Math.PI  * swfeq * (2*r));
        LabelC1Output.setText(m.Convert(c) + "f");
    }//GEN-LAST:event_BNCalculatorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNCalculator;
    private javax.swing.JComboBox<ComboItem> ComboRAUnit;
    private javax.swing.JComboBox<ComboItem> ComboSFUnit;
    private javax.swing.JLabel LabelC1;
    private javax.swing.JLabel LabelC1Output;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelRA;
    private javax.swing.JLabel LabelSF;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JSpinner SpinnerRA;
    private javax.swing.JSpinner SpinnerSF;
    // End of variables declaration//GEN-END:variables
}
