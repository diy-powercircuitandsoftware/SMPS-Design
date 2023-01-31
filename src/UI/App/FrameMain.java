package UI.App;

import UI.ErrorAmp.ErrorAmpT1;
import UI.ErrorAmp.ErrorAmpT2LC;
import UI.Topology.NonIsolate.BuckConverter;

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
        MenuErrorAmp = new javax.swing.JMenu();
        MenuItemErrorAmpT1 = new javax.swing.JMenuItem();
        MenuErrorAmpT2 = new javax.swing.JMenu();
        MenuItemErrorAmpT2LC = new javax.swing.JMenuItem();
        MenuItemErrorAmpT2RC = new javax.swing.JMenuItem();

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

        MenuErrorAmp.setText("ErrorAmp");

        MenuItemErrorAmpT1.setText("Type1");
        MenuItemErrorAmpT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemErrorAmpT1ActionPerformed(evt);
            }
        });
        MenuErrorAmp.add(MenuItemErrorAmpT1);

        MenuErrorAmpT2.setText("Type2");

        MenuItemErrorAmpT2LC.setText("VoltageFeedBack");
        MenuItemErrorAmpT2LC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemErrorAmpT2LCActionPerformed(evt);
            }
        });
        MenuErrorAmpT2.add(MenuItemErrorAmpT2LC);

        MenuItemErrorAmpT2RC.setText("CurrentFeedBack");
        MenuErrorAmpT2.add(MenuItemErrorAmpT2RC);

        MenuErrorAmp.add(MenuErrorAmpT2);

        MainMenuBar.add(MenuErrorAmp);

        setJMenuBar(MainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemErrorAmpT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemErrorAmpT1ActionPerformed
        new ErrorAmpT1(this, true).setVisible(true);
    }//GEN-LAST:event_MenuItemErrorAmpT1ActionPerformed

    private void MenuItemErrorAmpT2LCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemErrorAmpT2LCActionPerformed
        new ErrorAmpT2LC(this, true).setVisible(true);
    }//GEN-LAST:event_MenuItemErrorAmpT2LCActionPerformed

    private void MenuItemBuckConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBuckConverterActionPerformed
       new BuckConverter(this, true).setVisible(true);
    }//GEN-LAST:event_MenuItemBuckConverterActionPerformed
    
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
    private javax.swing.JMenuBar MainMenuBar;
    private javax.swing.JMenu MenuErrorAmp;
    private javax.swing.JMenu MenuErrorAmpT2;
    private javax.swing.JMenu MenuIsolate;
    private javax.swing.JMenuItem MenuItemBuckConverter;
    private javax.swing.JMenuItem MenuItemErrorAmpT1;
    private javax.swing.JMenuItem MenuItemErrorAmpT2LC;
    private javax.swing.JMenuItem MenuItemErrorAmpT2RC;
    private javax.swing.JMenu MenuNonIsolate;
    private javax.swing.JMenu MenuTopology;
    // End of variables declaration//GEN-END:variables
}
