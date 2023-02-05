package UI.Feedback.ErrorAmplifier;

import Convert.Measurement;
import UI.ComboBox.ComboItem;
import UI.ComboBox.ComboSI;
import java.awt.Image;
import javax.swing.ImageIcon;

public class ErrorAmpT2 extends javax.swing.JDialog {

    float RZoomBP = 1;

    public ErrorAmpT2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelIcon = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        SpinnerR1 = new javax.swing.JSpinner();
        SpinnerVSaw = new javax.swing.JSpinner();
        ComboRFUnit = new javax.swing.JComboBox<>();
        LabelLO = new javax.swing.JLabel();
        LabelCO = new javax.swing.JLabel();
        SpinnerLO = new javax.swing.JSpinner();
        ComboLOUnit = new javax.swing.JComboBox<>();
        LabelSF = new javax.swing.JLabel();
        SpinnerCO = new javax.swing.JSpinner();
        SpinnerSF = new javax.swing.JSpinner();
        ComboCOUnit = new javax.swing.JComboBox<>();
        ComboSFUnit = new javax.swing.JComboBox<>();
        LabelCESR = new javax.swing.JLabel();
        LabelVCC = new javax.swing.JLabel();
        SpinnerCESR = new javax.swing.JSpinner();
        SpinnerVCC = new javax.swing.JSpinner();
        LabelR1 = new javax.swing.JLabel();
        LabelVSaw = new javax.swing.JLabel();
        ScrollPaneOutput = new javax.swing.JScrollPane();
        TextAreaOutput = new javax.swing.JTextArea();
        ScrollPaneBP = new javax.swing.JScrollPane();
        LabelBP = new javax.swing.JLabel();
        PanelCaculator = new javax.swing.JPanel();
        BNCalculator = new javax.swing.JButton();
        LabelZoomBP = new javax.swing.JLabel();
        BNZoomInBP = new javax.swing.JButton();
        BNZoomOutBP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ErrorAmpType2");
        setResizable(false);

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Feedback/ErrorAmplifier/error_amp_02.png"))); // NOI18N

        PanelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SpinnerR1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        SpinnerVSaw.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.7f), Float.valueOf(0.7f), Float.valueOf(999.0f), Float.valueOf(0.1f)));

        ComboRFUnit.setModel(ComboSI.Resistor());

        LabelLO.setText("L(Output):");

        LabelCO.setText("C(Output):");

        SpinnerLO.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        ComboLOUnit.setModel(ComboSI.Inductor());

        LabelSF.setText("Switching Frequency:");

        SpinnerCO.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(10000.0f), Float.valueOf(1.0f)));

        SpinnerSF.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        ComboCOUnit.setModel(ComboSI.CapacitorPolar());

        ComboSFUnit.setModel(ComboSI.Frequency());

        LabelCESR.setText("C ESR(Output):");

        LabelVCC.setText("VCC:");

        SpinnerCESR.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.01f), Float.valueOf(0.01f), Float.valueOf(10.0f), Float.valueOf(0.01f)));

        SpinnerVCC.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        LabelR1.setText("R1:");

        LabelVSaw.setText("VSawtooth(Max):");

        javax.swing.GroupLayout PanelInputLayout = new javax.swing.GroupLayout(PanelInput);
        PanelInput.setLayout(PanelInputLayout);
        PanelInputLayout.setHorizontalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSF)
                    .addComponent(LabelLO)
                    .addComponent(LabelVSaw)
                    .addComponent(LabelVCC)
                    .addComponent(LabelCO)
                    .addComponent(LabelCESR)
                    .addComponent(LabelR1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addComponent(SpinnerR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboRFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SpinnerVCC)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInputLayout.createSequentialGroup()
                        .addComponent(SpinnerSF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboSFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SpinnerVSaw)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SpinnerLO)
                            .addComponent(SpinnerCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboCOUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboLOUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SpinnerCESR))
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
                    .addComponent(LabelVSaw)
                    .addComponent(SpinnerVSaw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSF)
                    .addComponent(SpinnerSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelLO)
                    .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SpinnerLO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboLOUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCO)
                    .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SpinnerCO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboCOUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCESR)
                    .addComponent(SpinnerCESR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboRFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelR1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TextAreaOutput.setEditable(false);
        TextAreaOutput.setColumns(20);
        TextAreaOutput.setRows(5);
        TextAreaOutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ScrollPaneOutput.setViewportView(TextAreaOutput);

        LabelBP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Feedback/ErrorAmplifier/bode_plot_error_amp_02.png"))); // NOI18N
        ScrollPaneBP.setViewportView(LabelBP);

        PanelCaculator.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BNCalculator.setText("Calculator");
        BNCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNCalculatorActionPerformed(evt);
            }
        });

        LabelZoomBP.setText("Bode Image");

        BNZoomInBP.setText("+");
        BNZoomInBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNZoomInBPActionPerformed(evt);
            }
        });

        BNZoomOutBP.setText("-");
        BNZoomOutBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNZoomOutBPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCaculatorLayout = new javax.swing.GroupLayout(PanelCaculator);
        PanelCaculator.setLayout(PanelCaculatorLayout);
        PanelCaculatorLayout.setHorizontalGroup(
            PanelCaculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCaculatorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCaculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BNCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelCaculatorLayout.createSequentialGroup()
                        .addComponent(LabelZoomBP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BNZoomInBP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BNZoomOutBP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCaculatorLayout.setVerticalGroup(
            PanelCaculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCaculatorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BNCalculator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCaculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelZoomBP)
                    .addComponent(BNZoomInBP)
                    .addComponent(BNZoomOutBP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelCaculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollPaneOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(ScrollPaneBP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ScrollPaneBP, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelCaculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollPaneOutput))
                .addContainerGap())
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
        double rfeedback = Double.valueOf(SpinnerR1.getValue().toString()) * (Double.valueOf(((ComboItem) ComboRFUnit.getSelectedItem()).value));
        double flc = 1 / (2 * Math.PI * Math.sqrt(lo * co));
        double fesr = 1 / (2 * Math.PI * cesr * co);
        double fo = swfeq / 10;
        double fzero = 0.75 * flc;
        double fpole = swfeq / 2;
        double r2 = (rfeedback * fesr * vsawtooth * fo) / (vcc * Math.pow(flc, 2));
        double c1 = 1 / (2 * Math.PI * r2 * fpole);
        double c2 = 1 / (2 * Math.PI * r2 * fzero);
        TextAreaOutput.setText("");
        TextAreaOutput.append("Cross Over(fsw/10)=" + m.Convert(fo) + "hz\n");
        TextAreaOutput.append("Pole(fsw/2)=" + m.Convert(fpole) + "hz\n");
        TextAreaOutput.append("Low Pass LC=" + m.Convert(flc) + "hz\n");
        TextAreaOutput.append("Low Pass ESR=" + m.Convert(fesr) + "hz\n");
        TextAreaOutput.append("Zero(75% Low Pass LC)=" + m.Convert(fzero) + "hz\n");
        TextAreaOutput.append("R1=" + m.Convert(r2) + "ohm\n");
        TextAreaOutput.append("C1=" + m.Convert(c1) + "f\n");
        TextAreaOutput.append("C2=" + m.Convert(c2) + "f\n");
        TextAreaOutput.append("Low Pass LC<<Low Pass ESR<<Zero<<Pole=" + String.valueOf((flc < fesr) && (fesr < fo) && (fo < fpole)));

    }//GEN-LAST:event_BNCalculatorActionPerformed

    private void BNZoomInBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNZoomInBPActionPerformed
        RZoomBP = (float) (RZoomBP + 0.1);
        ZoomBP();
    }//GEN-LAST:event_BNZoomInBPActionPerformed

    private void BNZoomOutBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNZoomOutBPActionPerformed
        RZoomBP = (float) (RZoomBP - 0.1);
        if (RZoomBP <= 0) {
            RZoomBP = (float) 0.1;
        }
        ZoomBP();
    }//GEN-LAST:event_BNZoomOutBPActionPerformed
    private void ZoomBP() {
        ImageIcon myImage = new ImageIcon(getClass().getResource("/UI/Feedback/ErrorAmplifier/bode_plot_error_amp_02.png"));
        int w = (int) (myImage.getIconWidth()* RZoomBP);
        int h = (int) (myImage.getIconHeight()* RZoomBP);
        if (w == 0 || h == 0) {
            return;
        }
        Image img = myImage.getImage();
        Image newImg = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        LabelBP.setIcon(image);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNCalculator;
    private javax.swing.JButton BNZoomInBP;
    private javax.swing.JButton BNZoomOutBP;
    private javax.swing.JComboBox<ComboItem> ComboCOUnit;
    private javax.swing.JComboBox<ComboItem> ComboLOUnit;
    private javax.swing.JComboBox<ComboItem> ComboRFUnit;
    private javax.swing.JComboBox<ComboItem> ComboSFUnit;
    private javax.swing.JLabel LabelBP;
    private javax.swing.JLabel LabelCESR;
    private javax.swing.JLabel LabelCO;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelLO;
    private javax.swing.JLabel LabelR1;
    private javax.swing.JLabel LabelSF;
    private javax.swing.JLabel LabelVCC;
    private javax.swing.JLabel LabelVSaw;
    private javax.swing.JLabel LabelZoomBP;
    private javax.swing.JPanel PanelCaculator;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JScrollPane ScrollPaneBP;
    private javax.swing.JScrollPane ScrollPaneOutput;
    private javax.swing.JSpinner SpinnerCESR;
    private javax.swing.JSpinner SpinnerCO;
    private javax.swing.JSpinner SpinnerLO;
    private javax.swing.JSpinner SpinnerR1;
    private javax.swing.JSpinner SpinnerSF;
    private javax.swing.JSpinner SpinnerVCC;
    private javax.swing.JSpinner SpinnerVSaw;
    private javax.swing.JTextArea TextAreaOutput;
    // End of variables declaration//GEN-END:variables
}
