 
package UI.ErrorAmp;
 
import UI.ComboBox.ComboItem;
import javax.swing.DefaultComboBoxModel;

public class ErrorAmpT2LC extends javax.swing.JDialog {

    
    public ErrorAmpT2LC(java.awt.Frame parent, boolean modal) {
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
        SpinnerLO1 = new javax.swing.JSpinner();
        ComboLOUnit1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ErrorAmp/error_amp_02.png"))); // NOI18N

        LabelSF.setText("Switching Frequency:");

        SpinnerSF.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        ComboSFUnit.setModel(new DefaultComboBoxModel(new ComboItem[] {new ComboItem(1000, "k"), new ComboItem(1000000, "M")}));

        LabelVCC.setText("VCC:");

        SpinnerVCC.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        LabelVSaw.setText("VSawtooth(Max):");

        SpinnerVSaw.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        LabelLO.setText("L(Output):");

        LabelCO.setText("C(Output):");

        SpinnerLO.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));

        ComboLOUnit.setModel(new DefaultComboBoxModel(new ComboItem[] {new ComboItem(1, "-"), new ComboItem(1000, "m"),new ComboItem(1000000, "u")}));

        SpinnerLO1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(10000.0f), Float.valueOf(1.0f)));

        ComboLOUnit1.setModel(new DefaultComboBoxModel(new ComboItem[] {new ComboItem(1, "-"), new ComboItem(1000000, "u")}));

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
                            .addComponent(LabelVCC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SpinnerLO)
                                    .addComponent(SpinnerLO1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboLOUnit1, 0, 100, Short.MAX_VALUE)
                                    .addComponent(ComboLOUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(SpinnerVCC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SpinnerSF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboSFUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SpinnerVSaw, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(LabelCO))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(SpinnerLO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboLOUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(LabelIcon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<ComboItem> ComboLOUnit;
    private javax.swing.JComboBox<ComboItem> ComboLOUnit1;
    private javax.swing.JComboBox<ComboItem> ComboSFUnit;
    private javax.swing.JLabel LabelCO;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelLO;
    private javax.swing.JLabel LabelSF;
    private javax.swing.JLabel LabelVCC;
    private javax.swing.JLabel LabelVSaw;
    private javax.swing.JSpinner SpinnerLO;
    private javax.swing.JSpinner SpinnerLO1;
    private javax.swing.JSpinner SpinnerSF;
    private javax.swing.JSpinner SpinnerVCC;
    private javax.swing.JSpinner SpinnerVSaw;
    // End of variables declaration//GEN-END:variables
}
