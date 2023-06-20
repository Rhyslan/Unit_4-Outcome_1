/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.softwaredevelopment.level.up_library.YearMenu;

import javax.swing.ImageIcon;

/**
 *
 * @author dylan
 */
public class YearMenu extends javax.swing.JPanel {

    /**
     * Creates new form YearMenu
     */
    public YearMenu() {
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

        pnlYear = new javax.swing.JPanel();
        pnlYear.setVisible(false);
        cbxG = new javax.swing.JCheckBox();
        cbxPG = new javax.swing.JCheckBox();
        cbxM = new javax.swing.JCheckBox();
        cbxMA15 = new javax.swing.JCheckBox();
        cbxR18 = new javax.swing.JCheckBox();
        btnYearToggle = new javax.swing.JButton();

        pnlYear.setBackground(new java.awt.Color(255, 0, 0));
        pnlYear.setMinimumSize(new java.awt.Dimension(190, 84));

        cbxG.setText("G");

        cbxPG.setText("PG");

        cbxM.setText("M");

        cbxMA15.setText("MA15+");

        cbxR18.setText("R18+");

        javax.swing.GroupLayout pnlYearLayout = new javax.swing.GroupLayout(pnlYear);
        pnlYear.setLayout(pnlYearLayout);
        pnlYearLayout.setHorizontalGroup(
            pnlYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlYearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxR18)
                    .addGroup(pnlYearLayout.createSequentialGroup()
                        .addGroup(pnlYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxM)
                            .addComponent(cbxG))
                        .addGap(51, 51, 51)
                        .addGroup(pnlYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPG)
                            .addComponent(cbxMA15))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pnlYearLayout.setVerticalGroup(
            pnlYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlYearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxG)
                    .addComponent(cbxPG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxM)
                    .addComponent(cbxMA15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxR18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnYearToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collapsed.png"))); // NOI18N
        btnYearToggle.setText("Year");
        btnYearToggle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnYearToggle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnYearToggle.setIconTextGap(59);
        btnYearToggle.setMinimumSize(new java.awt.Dimension(148, 30));
        btnYearToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearToggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnYearToggle, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(pnlYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnYearToggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnYearToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearToggleActionPerformed
        pnlYear.setVisible(!pnlYear.isVisible());
        if (pnlYear.isVisible()) btnYearToggle.setIcon(icnExpandedIcon);
        else btnYearToggle.setIcon(icnCollapsedIcon);
    }//GEN-LAST:event_btnYearToggleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnYearToggle;
    private javax.swing.JCheckBox cbxG;
    private javax.swing.JCheckBox cbxM;
    private javax.swing.JCheckBox cbxMA15;
    private javax.swing.JCheckBox cbxPG;
    private javax.swing.JCheckBox cbxR18;
    private javax.swing.JPanel pnlYear;
    // End of variables declaration//GEN-END:variables
}
