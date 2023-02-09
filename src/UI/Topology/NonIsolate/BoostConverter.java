package UI.Topology.NonIsolate;

import Convert.Measurement;
import UI.ComboBox.ComboItem;
import UI.ComboBox.ComboSI;

public class BoostConverter extends javax.swing.JDialog {

    public BoostConverter(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelIcon = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        LabelVCC = new javax.swing.JLabel();
        SpinnerVCC = new javax.swing.JSpinner();
        LabelVOut = new javax.swing.JLabel();
        SpinnerVOut = new javax.swing.JSpinner();
        LabelSF = new javax.swing.JLabel();
        SpinnerSF = new javax.swing.JSpinner();
        ComboSFUnit = new javax.swing.JComboBox<>();
        LabelVRipple = new javax.swing.JLabel();
        SpinnerVRipple = new javax.swing.JSpinner();
        BNCalculator = new javax.swing.JButton();
        SpinnerIO = new javax.swing.JSpinner();
        ComboIOUnit = new javax.swing.JComboBox<>();
        LabelIO = new javax.swing.JLabel();
        LabelRSW = new javax.swing.JLabel();
        SpinnerRSW = new javax.swing.JSpinner();
        ComboRSWUnit = new javax.swing.JComboBox<>();
        ScrollPaneOutput = new javax.swing.JScrollPane();
        TextAreaOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buck Converter");
        setResizable(false);

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Topology/NonIsolate/boost_converter.png"))); // NOI18N

        PanelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelVCC.setText("VCC:");

        SpinnerVCC.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        LabelVOut.setText("VOut(VD):");

        SpinnerVOut.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.7f), Float.valueOf(0.7f), Float.valueOf(999.0f), Float.valueOf(1.0f)));

        LabelSF.setText("Switching Frequency:");

        SpinnerSF.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        ComboSFUnit.setModel(ComboSI.Frequency());

        LabelVRipple.setText("VRipple(%):");

        SpinnerVRipple.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(100.0f), Float.valueOf(1.0f)));

        BNCalculator.setText("Calculator");
        BNCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNCalculatorActionPerformed(evt);
            }
        });

        SpinnerIO.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        ComboIOUnit.setModel(ComboSI.LowResistor());

        LabelIO.setText("IOut(VD):");

        LabelRSW.setText("RSW:");

        SpinnerRSW.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        ComboRSWUnit.setModel(ComboSI.LowResistor());

        javax.swing.GroupLayout PanelInputLayout = new javax.swing.GroupLayout(PanelInput);
        PanelInput.setLayout(PanelInputLayout);
        PanelInputLayout.setHorizontalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelVCC)
                            .addComponent(LabelVOut))
                        .addGap(64, 64, 64)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SpinnerVOut)
                            .addComponent(SpinnerVCC)))
                    .addComponent(BNCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelSF)
                            .addComponent(LabelVRipple)
                            .addComponent(LabelIO)
                            .addComponent(LabelRSW))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addComponent(SpinnerRSW)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboRSWUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addComponent(SpinnerIO, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboIOUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelInputLayout.createSequentialGroup()
                                .addComponent(SpinnerSF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboSFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SpinnerVRipple))))
                .addContainerGap())
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVCC)
                    .addComponent(SpinnerVCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVOut)
                    .addComponent(SpinnerVOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVRipple)
                    .addComponent(SpinnerVRipple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIO)
                    .addComponent(ComboIOUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSF)
                    .addComponent(SpinnerSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRSW)
                    .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SpinnerRSW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboRSWUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BNCalculator)
                .addContainerGap())
        );

        TextAreaOutput.setEditable(false);
        TextAreaOutput.setColumns(20);
        TextAreaOutput.setRows(5);
        TextAreaOutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ScrollPaneOutput.setViewportView(TextAreaOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScrollPaneOutput)
                    .addComponent(LabelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNCalculatorActionPerformed
        Measurement m = new Measurement();
        double vcc = Double.valueOf(SpinnerVCC.getValue().toString());
        double vout = Double.valueOf(SpinnerVOut.getValue().toString());
        double vripple = Double.valueOf(SpinnerVRipple.getValue().toString());
        double swfeq = Double.valueOf(SpinnerSF.getValue().toString()) * Double.valueOf(((ComboItem) ComboSFUnit.getSelectedItem()).value);
        double io = Double.valueOf(SpinnerIO.getValue().toString()) * Double.valueOf(((ComboItem) ComboIOUnit.getSelectedItem()).value);
        double rds = Double.valueOf(SpinnerRSW.getValue().toString()) * Double.valueOf(((ComboItem) ComboRSWUnit.getSelectedItem()).value);

        double lripple = 0.1;
        double d = vout / vcc;
        double invdvout = (1 - d) * vout;
        double twoswfeq = 2 * swfeq;
        double l = invdvout / (twoswfeq * (io * lripple));

        double ilmax = io + (invdvout / (twoswfeq * l));
        double deltail = invdvout / (swfeq * l);
        double c = ((1 - d)) / (8 * l * (vripple / 100) * Math.pow(swfeq, 2));
        double swi = io * d;

        double vcmax = vout + (vout * (vripple / 100) * 0.5);
        double swloss = d * (rds * Math.pow(io, 2));

        double di = io * (1 - d);
        double dloss = (1 - d) * (rds * Math.pow(io, 2));
        TextAreaOutput.setText("");
        TextAreaOutput.append("L1=" + m.Convert(l) + "H\n");
        TextAreaOutput.append("L1=" + m.Convert(ilmax) + "A\n");
        TextAreaOutput.append("Delta L1=" + m.Convert(deltail) + "A\n");
        TextAreaOutput.append("C2=" + m.Convert(c) + "F\n");
        TextAreaOutput.append("C2=" + m.Convert(vcmax) + "V\n");
        TextAreaOutput.append("Minimum SW1 Voltage=" + String.valueOf(vcc) + "V\n");
        TextAreaOutput.append("Minimum SW1 Current=" + m.Convert(swi) + "A\n");
        TextAreaOutput.append("Minimum SW Loss=" + m.Convert(swloss) + "W\n");
        TextAreaOutput.append("Minimum D1 Voltage=" + String.valueOf(vcc) + "V\n");
        TextAreaOutput.append("Minimum D1 Current=" + m.Convert(di) + "A\n");
        TextAreaOutput.append("Minimum D1 Loss=" + m.Convert(dloss) + "W\n");

    }//GEN-LAST:event_BNCalculatorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNCalculator;
    private javax.swing.JComboBox<ComboItem> ComboIOUnit;
    private javax.swing.JComboBox<ComboItem> ComboRSWUnit;
    private javax.swing.JComboBox<ComboItem> ComboSFUnit;
    private javax.swing.JLabel LabelIO;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelRSW;
    private javax.swing.JLabel LabelSF;
    private javax.swing.JLabel LabelVCC;
    private javax.swing.JLabel LabelVOut;
    private javax.swing.JLabel LabelVRipple;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JScrollPane ScrollPaneOutput;
    private javax.swing.JSpinner SpinnerIO;
    private javax.swing.JSpinner SpinnerRSW;
    private javax.swing.JSpinner SpinnerSF;
    private javax.swing.JSpinner SpinnerVCC;
    private javax.swing.JSpinner SpinnerVOut;
    private javax.swing.JSpinner SpinnerVRipple;
    private javax.swing.JTextArea TextAreaOutput;
    // End of variables declaration//GEN-END:variables
}
