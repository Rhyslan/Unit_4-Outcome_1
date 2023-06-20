/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.softwaredevelopment.level.up_library.MACLMenu;

import javax.swing.ImageIcon;

/**
 *
 * @author dylan
 */
public class MACLMenu extends javax.swing.JPanel {

    /**
     * Creates new form MACLMenu
     */
    public MACLMenu() {
        initComponents();
    }
    
    /**
     * My Variables and Methods
     */
    public static ImageIcon icnCollapsedIcon = new ImageIcon("C:\\Users\\dylan\\School\\Year_12\\Software_Development\\Unit 4\\Level-Up_Library\\Level-Up_Library\\src\\main\\resources\\Collapsed.png");
    public static ImageIcon icnExpandedIcon = new ImageIcon("C:\\Users\\dylan\\School\\Year_12\\Software_Development\\Unit 4\\Level-Up_Library\\Level-Up_Library\\src\\main\\resources\\Expanded.png");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMACLToggle = new javax.swing.JButton();
        pnlMACL = new javax.swing.JPanel();
        pnlMACL.setVisible(false);
        lblMin = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        lblMax = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();

        btnMACLToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collapsed.png"))); // NOI18N
        btnMACLToggle.setText("MACL");
        btnMACLToggle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnMACLToggle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnMACLToggle.setIconTextGap(57);
        btnMACLToggle.setMinimumSize(new java.awt.Dimension(190, 23));
        btnMACLToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMACLToggleActionPerformed(evt);
            }
        });

        pnlMACL.setBackground(new java.awt.Color(255, 0, 0));
        pnlMACL.setMinimumSize(new java.awt.Dimension(190, 65));

        lblMin.setText("Min:");

        txtMin.setText("min");

        lblMax.setText("Max:");

        txtMax.setText("max");

        javax.swing.GroupLayout pnlMACLLayout = new javax.swing.GroupLayout(pnlMACL);
        pnlMACL.setLayout(pnlMACLLayout);
        pnlMACLLayout.setHorizontalGroup(
            pnlMACLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMACLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMACLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMACLLayout.createSequentialGroup()
                        .addComponent(lblMax)
                        .addGap(18, 18, 18)
                        .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMACLLayout.createSequentialGroup()
                        .addComponent(lblMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 77, Short.MAX_VALUE))
        );
        pnlMACLLayout.setVerticalGroup(
            pnlMACLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMACLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMACLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMin)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlMACLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMax)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMACL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMACLToggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMACLToggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMACL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMACLToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMACLToggleActionPerformed
        pnlMACL.setVisible(!pnlMACL.isVisible());
        if (pnlMACL.isVisible()) btnMACLToggle.setIcon(icnExpandedIcon);
        else btnMACLToggle.setIcon(icnCollapsedIcon);
    }//GEN-LAST:event_btnMACLToggleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMACLToggle;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JPanel pnlMACL;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    // End of variables declaration//GEN-END:variables
}
