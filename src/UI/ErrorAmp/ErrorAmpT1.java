package UI.ErrorAmp;

import UI.ComboBox.ComboItem;
import javax.swing.DefaultComboBoxModel;
import Convert.Measurement;
import java.awt.Image;
import javax.swing.ImageIcon;

public class ErrorAmpT1 extends javax.swing.JDialog {

    float RZoomBP = 1;

    public ErrorAmpT1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCircuit = new javax.swing.JLabel();
        PanelInput = new javax.swing.JPanel();
        SpinnerSF = new javax.swing.JSpinner();
        ComboSFUnit = new javax.swing.JComboBox<>();
        LabelCrossOver = new javax.swing.JLabel();
        ComboCrossOver = new javax.swing.JComboBox<>();
        LabelR1 = new javax.swing.JLabel();
        SpinnerR1 = new javax.swing.JSpinner();
        ComboR1Unit = new javax.swing.JComboBox<>();
        LabelSF = new javax.swing.JLabel();
        ScrollPaneBP = new javax.swing.JScrollPane();
        LabelBP = new javax.swing.JLabel();
        PanelOutput = new javax.swing.JPanel();
        BNCalculator = new javax.swing.JButton();
        LabelC1 = new javax.swing.JLabel();
        LabelC1Output = new javax.swing.JLabel();
        LabelZoomBP = new javax.swing.JLabel();
        BNZoomInBP = new javax.swing.JButton();
        BNZoomOutBP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ErrorAmpType1");
        setResizable(false);

        LabelCircuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ErrorAmp/error_amp_01.png"))); // NOI18N

        PanelInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SpinnerSF.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        ComboSFUnit.setModel(new DefaultComboBoxModel(new ComboItem[] {new ComboItem("k","1000"), new ComboItem("M","1000000")}));

        LabelCrossOver.setText("CrossOver Frequency:");

        ComboCrossOver.setModel(new javax.swing.DefaultComboBoxModel(new Integer[] { 5, 10}));
        ComboCrossOver.setToolTipText("");

        LabelR1.setText("R1:");

        SpinnerR1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(999.0f), Float.valueOf(0.01f)));

        ComboR1Unit.setModel(new DefaultComboBoxModel(new ComboItem[] {new ComboItem( "-","1"),new ComboItem("k","1000"), new ComboItem("M","1000000")}));

        LabelSF.setText("Switching Frequency:");

        javax.swing.GroupLayout PanelInputLayout = new javax.swing.GroupLayout(PanelInput);
        PanelInput.setLayout(PanelInputLayout);
        PanelInputLayout.setHorizontalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSF)
                    .addComponent(LabelCrossOver)
                    .addComponent(LabelR1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addComponent(SpinnerSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboSFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ComboCrossOver, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelInputLayout.createSequentialGroup()
                        .addComponent(SpinnerR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboR1Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelInputLayout.setVerticalGroup(
            PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSF)
                    .addComponent(SpinnerSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCrossOver)
                    .addComponent(ComboCrossOver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelR1)
                    .addComponent(ComboR1Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        LabelBP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ErrorAmp/bode_plot_error_amp_01.png"))); // NOI18N
        ScrollPaneBP.setViewportView(LabelBP);

        PanelOutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BNCalculator.setText("Calculator");
        BNCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNCalculatorActionPerformed(evt);
            }
        });

        LabelC1.setText("C1:");

        LabelC1Output.setText("-");

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

        javax.swing.GroupLayout PanelOutputLayout = new javax.swing.GroupLayout(PanelOutput);
        PanelOutput.setLayout(PanelOutputLayout);
        PanelOutputLayout.setHorizontalGroup(
            PanelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BNCalculator)
                    .addGroup(PanelOutputLayout.createSequentialGroup()
                        .addComponent(LabelC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelC1Output))
                    .addGroup(PanelOutputLayout.createSequentialGroup()
                        .addComponent(LabelZoomBP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BNZoomInBP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BNZoomOutBP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelOutputLayout.setVerticalGroup(
            PanelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelC1)
                    .addComponent(LabelC1Output))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BNCalculator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                    .addComponent(LabelCircuit)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneBP, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPaneBP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelCircuit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNCalculatorActionPerformed
        Measurement m = new Measurement();
        double swfeq = Double.valueOf(SpinnerSF.getValue().toString()) * Double.valueOf(((ComboItem) ComboSFUnit.getSelectedItem()).value);
        double crossover = swfeq / Double.valueOf(ComboCrossOver.getSelectedItem().toString());
        double r = Double.valueOf(SpinnerR1.getValue().toString()) * Double.valueOf(((ComboItem) ComboR1Unit.getSelectedItem()).value);
        double c = 1 / (2 * Math.PI * crossover * r);
        LabelC1Output.setText(m.Convert(c) + "f");
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
        ImageIcon myImage = new ImageIcon(getClass().getResource("/UI/ErrorAmp/bode_plot_error_amp_01.png"));
        int w = (int) (myImage.getIconWidth() * RZoomBP);
        int h = (int) (myImage.getIconHeight() * RZoomBP);
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
    private javax.swing.JComboBox<Integer> ComboCrossOver;
    private javax.swing.JComboBox<ComboItem> ComboR1Unit;
    private javax.swing.JComboBox<ComboItem> ComboSFUnit;
    private javax.swing.JLabel LabelBP;
    private javax.swing.JLabel LabelC1;
    private javax.swing.JLabel LabelC1Output;
    private javax.swing.JLabel LabelCircuit;
    private javax.swing.JLabel LabelCrossOver;
    private javax.swing.JLabel LabelR1;
    private javax.swing.JLabel LabelSF;
    private javax.swing.JLabel LabelZoomBP;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JPanel PanelOutput;
    private javax.swing.JScrollPane ScrollPaneBP;
    private javax.swing.JSpinner SpinnerR1;
    private javax.swing.JSpinner SpinnerSF;
    // End of variables declaration//GEN-END:variables
}
