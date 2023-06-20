/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.softwaredevelopment.level.up_library.StatusMenu;

/**
 *
 * @author dylan
 */
public class StatusMenu extends javax.swing.JPanel {

    /**
     * Creates new form StatusMenu
     */
    public StatusMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStatusToggle = new javax.swing.JButton();
        pnlStatus = new javax.swing.JPanel();
        pnlStatus.setVisible(false);
        cbxNP = new javax.swing.JCheckBox();
        cbxFG = new javax.swing.JCheckBox();
        cbxAB = new javax.swing.JCheckBox();
        cbxIP = new javax.swing.JCheckBox();
        cbxFS = new javax.swing.JCheckBox();

        btnStatusToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collapsed.png"))); // NOI18N
        btnStatusToggle.setText("Status");
        btnStatusToggle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnStatusToggle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnStatusToggle.setIconTextGap(56);
        btnStatusToggle.setMaximumSize(new java.awt.Dimension(128, 30));
        btnStatusToggle.setMinimumSize(new java.awt.Dimension(190, 29));
        btnStatusToggle.setPreferredSize(new java.awt.Dimension(190, 29));
        btnStatusToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusToggleActionPerformed(evt);
            }
        });

        pnlStatus.setBackground(new java.awt.Color(255, 0, 0));

        cbxNP.setText("NP");
        cbxNP.setToolTipText("");

        cbxFG.setText("FG");

        cbxAB.setText("AB");

        cbxIP.setText("IP");

        cbxFS.setText("FS");

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStatusLayout.createSequentialGroup()
                        .addComponent(cbxNP)
                        .addGap(56, 56, 56)
                        .addComponent(cbxIP))
                    .addGroup(pnlStatusLayout.createSequentialGroup()
                        .addComponent(cbxAB)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlStatusLayout.createSequentialGroup()
                        .addComponent(cbxFG)
                        .addGap(57, 57, 57)
                        .addComponent(cbxFS)))
                .addContainerGap())
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxNP)
                    .addComponent(cbxIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFG)
                    .addComponent(cbxFS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxAB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStatusToggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStatusToggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatusToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusToggleActionPerformed
        pnlStatus.setVisible(!pnlStatus.isVisible());
    }//GEN-LAST:event_btnStatusToggleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStatusToggle;
    private javax.swing.JCheckBox cbxAB;
    private javax.swing.JCheckBox cbxFG;
    private javax.swing.JCheckBox cbxFS;
    private javax.swing.JCheckBox cbxIP;
    private javax.swing.JCheckBox cbxNP;
    private javax.swing.JPanel pnlStatus;
    // End of variables declaration//GEN-END:variables
}
