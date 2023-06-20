/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.softwaredevelopment.level.up_library.RatingMenu;

/**
 *
 * @author dylan
 */
public class RatingMenu extends javax.swing.JPanel {

    /**
     * Creates new form RatingMenu
     */
    public RatingMenu() {
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

        btnRatingToggle = new javax.swing.JButton();
        pnlRating = new javax.swing.JPanel();
        pnlRating.setVisible(false);
        cbx0Stars = new javax.swing.JCheckBox();
        cbx1Star = new javax.swing.JCheckBox();
        cbx2Stars = new javax.swing.JCheckBox();
        cbx3Stars = new javax.swing.JCheckBox();
        cbx4Stars = new javax.swing.JCheckBox();
        cbx5Stars = new javax.swing.JCheckBox();

        btnRatingToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collapsed.png"))); // NOI18N
        btnRatingToggle.setText("Rating");
        btnRatingToggle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRatingToggle.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRatingToggle.setIconTextGap(56);
        btnRatingToggle.setMinimumSize(new java.awt.Dimension(190, 29));
        btnRatingToggle.setPreferredSize(new java.awt.Dimension(190, 23));
        btnRatingToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRatingToggleActionPerformed(evt);
            }
        });

        pnlRating.setBackground(new java.awt.Color(255, 0, 0));

        cbx0Stars.setText("None");

        cbx1Star.setText("1 Star");

        cbx2Stars.setText("2 Stars");

        cbx3Stars.setText("3 Stars");

        cbx4Stars.setText("4 Stars");

        cbx5Stars.setText("5 Stars");

        javax.swing.GroupLayout pnlRatingLayout = new javax.swing.GroupLayout(pnlRating);
        pnlRating.setLayout(pnlRatingLayout);
        pnlRatingLayout.setHorizontalGroup(
            pnlRatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRatingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx0Stars)
                    .addComponent(cbx1Star)
                    .addComponent(cbx2Stars)
                    .addComponent(cbx3Stars)
                    .addComponent(cbx4Stars)
                    .addComponent(cbx5Stars))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRatingLayout.setVerticalGroup(
            pnlRatingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRatingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbx0Stars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx1Star)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx2Stars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx3Stars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx4Stars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx5Stars)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRatingToggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRatingToggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRatingToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRatingToggleActionPerformed
        pnlRating.setVisible(!pnlRating.isVisible());
    }//GEN-LAST:event_btnRatingToggleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRatingToggle;
    private javax.swing.JCheckBox cbx0Stars;
    private javax.swing.JCheckBox cbx1Star;
    private javax.swing.JCheckBox cbx2Stars;
    private javax.swing.JCheckBox cbx3Stars;
    private javax.swing.JCheckBox cbx4Stars;
    private javax.swing.JCheckBox cbx5Stars;
    private javax.swing.JPanel pnlRating;
    // End of variables declaration//GEN-END:variables
}