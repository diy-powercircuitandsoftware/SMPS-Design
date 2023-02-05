package UI.App;

public class FrameMain extends javax.swing.JFrame {

    public FrameMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenuBar = new javax.swing.JMenuBar();
        MenuTopology = new javax.swing.JMenu();
        MenuIsolate = new javax.swing.JMenu();
        MenuNonIsolate = new javax.swing.JMenu();
        MenuItemBuckConverter = new javax.swing.JMenuItem();
        MenuFeedback = new javax.swing.JMenu();
        MenuCurrent = new javax.swing.JMenu();
        MenuCurrentResistor = new javax.swing.JMenu();
        MenuItemHighSideResistor = new javax.swing.JMenuItem();
        MenuItemLowSideResistor = new javax.swing.JMenuItem();
        MenuErrorAmp = new javax.swing.JMenu();
        MenuItemErrorAmpT1 = new javax.swing.JMenuItem();
        MenuItemErrorAmpT2 = new javax.swing.JMenuItem();
        ErrorAmpT3 = new javax.swing.JMenu();
        MenuItemErrorAmpT3A = new javax.swing.JMenuItem();
        MenuItemErrorAmpT3B = new javax.swing.JMenuItem();
        MenuOpamp = new javax.swing.JMenu();
        MenuAmp = new javax.swing.JMenu();
        MenuItemNonInvertAmp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");

        MenuTopology.setText("Topology");

        MenuIsolate.setText("Isolate");
        MenuTopology.add(MenuIsolate);

        MenuNonIsolate.setText("NonIsolate");

        MenuItemBuckConverter.setText("BuckConverter");
        MenuItemBuckConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemBuckConverterActionPerformed(evt);
            }
        });
        MenuNonIsolate.add(MenuItemBuckConverter);

        MenuTopology.add(MenuNonIsolate);

        MainMenuBar.add(MenuTopology);

        MenuFeedback.setText("Feedback");

        MenuCurrent.setText("Current");

        MenuCurrentResistor.setText("Resistor");

        MenuItemHighSideResistor.setText("High Side");
        MenuItemHighSideResistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemHighSideResistorActionPerformed(evt);
            }
        });
        MenuCurrentResistor.add(MenuItemHighSideResistor);

        MenuItemLowSideResistor.setText("Low Side");
        MenuItemLowSideResistor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLowSideResistorActionPerformed(evt);
            }
        });
        MenuCurrentResistor.add(MenuItemLowSideResistor);

        MenuCurrent.add(MenuCurrentResistor);

        MenuFeedback.add(MenuCurrent);

        MenuErrorAmp.setText("Error Amplifier ");

        MenuItemErrorAmpT1.setText("Type1");
        MenuItemErrorAmpT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemErrorAmpT1ActionPerformed(evt);
            }
        });
        MenuErrorAmp.add(MenuItemErrorAmpT1);

        MenuItemErrorAmpT2.setText("Type2");
        MenuItemErrorAmpT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemErrorAmpT2ActionPerformed(evt);
            }
        });
        MenuErrorAmp.add(MenuItemErrorAmpT2);

        ErrorAmpT3.setText("Type3");

        MenuItemErrorAmpT3A.setText("A");
        MenuItemErrorAmpT3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemErrorAmpT3AActionPerformed(evt);
            }
        });
        ErrorAmpT3.add(MenuItemErrorAmpT3A);

        MenuItemErrorAmpT3B.setText("B");
        ErrorAmpT3.add(MenuItemErrorAmpT3B);

        MenuErrorAmp.add(ErrorAmpT3);

        MenuFeedback.add(MenuErrorAmp);

        MainMenuBar.add(MenuFeedback);

        MenuOpamp.setText("Opamp");

        MenuAmp.setText("Amplifier ");

        MenuItemNonInvertAmp.setText("Non Inverting Amplifier");
        MenuItemNonInvertAmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNonInvertAmpActionPerformed(evt);
            }
        });
        MenuAmp.add(MenuItemNonInvertAmp);

        MenuOpamp.add(MenuAmp);

        MainMenuBar.add(MenuOpamp);

        setJMenuBar(MainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemErrorAmpT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemErrorAmpT1ActionPerformed
        new UI.Feedback.ErrorAmplifier.ErrorAmpT1(this, true).setVisible(true);
    }//GEN-LAST:event_MenuItemErrorAmpT1ActionPerformed

    private void MenuItemBuckConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBuckConverterActionPerformed
        new UI.Topology.NonIsolate.BuckConverter(this, true).setVisible(true);
    }//GEN-LAST:event_MenuItemBuckConverterActionPerformed

    private void MenuItemErrorAmpT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemErrorAmpT2ActionPerformed
        new UI.Feedback.ErrorAmplifier.ErrorAmpT2(this, true).setVisible(true);
    }//GEN-LAST:event_MenuItemErrorAmpT2ActionPerformed

    private void MenuItemErrorAmpT3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemErrorAmpT3AActionPerformed
        new UI.Feedback.ErrorAmplifier.ErrorAmpT3A(this, true).setVisible(true);
    }//GEN-LAST:event_MenuItemErrorAmpT3AActionPerformed

    private void MenuItemNonInvertAmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNonInvertAmpActionPerformed
        //  new NonInvertAmp(this, true).setVisible(true);
    }//GEN-LAST:event_MenuItemNonInvertAmpActionPerformed

    private void MenuItemLowSideResistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLowSideResistorActionPerformed
        new UI.Feedback.Current.Resistor.CurrentLowSideResistor(this, true).setVisible(true);
    }//GEN-LAST:event_MenuItemLowSideResistorActionPerformed

    private void MenuItemHighSideResistorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemHighSideResistorActionPerformed
          new UI.Feedback.Current.Resistor.CurrentHighSideResistor(this, true).setVisible(true);
    }//GEN-LAST:event_MenuItemHighSideResistorActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new FrameMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ErrorAmpT3;
    private javax.swing.JMenuBar MainMenuBar;
    private javax.swing.JMenu MenuAmp;
    private javax.swing.JMenu MenuCurrent;
    private javax.swing.JMenu MenuCurrentResistor;
    private javax.swing.JMenu MenuErrorAmp;
    private javax.swing.JMenu MenuFeedback;
    private javax.swing.JMenu MenuIsolate;
    private javax.swing.JMenuItem MenuItemBuckConverter;
    private javax.swing.JMenuItem MenuItemErrorAmpT1;
    private javax.swing.JMenuItem MenuItemErrorAmpT2;
    private javax.swing.JMenuItem MenuItemErrorAmpT3A;
    private javax.swing.JMenuItem MenuItemErrorAmpT3B;
    private javax.swing.JMenuItem MenuItemHighSideResistor;
    private javax.swing.JMenuItem MenuItemLowSideResistor;
    private javax.swing.JMenuItem MenuItemNonInvertAmp;
    private javax.swing.JMenu MenuNonIsolate;
    private javax.swing.JMenu MenuOpamp;
    private javax.swing.JMenu MenuTopology;
    // End of variables declaration//GEN-END:variables
}
