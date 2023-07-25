
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author dylan
 */
public class StarRating extends javax.swing.JPanel {

    /**
     * Creates new form StarRating
     */
    public StarRating() {
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

        pmnContextMenu = new javax.swing.JPopupMenu();
        mniUpdate = new javax.swing.JMenuItem();
        lblFrontSpacer = new javax.swing.JLabel();
        lblStarOne = new javax.swing.JLabel();
        lblStarTwo = new javax.swing.JLabel();
        lblStarThree = new javax.swing.JLabel();
        lblStarFour = new javax.swing.JLabel();
        lblStarFive = new javax.swing.JLabel();

        pmnContextMenu.setName(""); // NOI18N

        mniUpdate.setText("Update");
        mniUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUpdateActionPerformed(evt);
            }
        });
        pmnContextMenu.add(mniUpdate);

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        org.jdesktop.swingx.HorizontalLayout horizontalLayout1 = new org.jdesktop.swingx.HorizontalLayout();
        horizontalLayout1.setGap(5);
        setLayout(horizontalLayout1);
        add(lblFrontSpacer);

        lblStarOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeselectedStar.png"))); // NOI18N
        lblStarOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStarOneMouseClicked(evt);
            }
        });
        add(lblStarOne);

        lblStarTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeselectedStar.png"))); // NOI18N
        lblStarTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStarTwoMouseClicked(evt);
            }
        });
        add(lblStarTwo);

        lblStarThree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeselectedStar.png"))); // NOI18N
        lblStarThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStarThreeMouseClicked(evt);
            }
        });
        add(lblStarThree);

        lblStarFour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeselectedStar.png"))); // NOI18N
        lblStarFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStarFourMouseClicked(evt);
            }
        });
        add(lblStarFour);

        lblStarFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeselectedStar.png"))); // NOI18N
        lblStarFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStarFiveMouseClicked(evt);
            }
        });
        add(lblStarFive);
    }// </editor-fold>//GEN-END:initComponents

    private ImageIcon icnSelectedIcon = new ImageIcon(getClass().getResource("/SelectedStar.png"));
    private ImageIcon icnDeselectedIcon = new ImageIcon(getClass().getResource("/DeselectedStar.png"));
    
    private boolean booIsSelector = false;
    
    public int intSelectedRating = 0;
    
    //<editor-fold defaultstate="collapsed" desc="Click Selection">
    public void selectRatingZero() {
        if (booIsSelector == true) {
            intSelectedRating = 0;
            lblStarOne.setIcon(icnDeselectedIcon);
            lblStarTwo.setIcon(icnDeselectedIcon);
            lblStarThree.setIcon(icnDeselectedIcon);
            lblStarFour.setIcon(icnDeselectedIcon);
            lblStarFive.setIcon(icnDeselectedIcon);
        }
    }
    
    private void lblStarOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStarOneMouseClicked
        if (booIsSelector == true) {
            intSelectedRating = 1;
            lblStarOne.setIcon(icnSelectedIcon);
            lblStarTwo.setIcon(icnDeselectedIcon);
            lblStarThree.setIcon(icnDeselectedIcon);
            lblStarFour.setIcon(icnDeselectedIcon);
            lblStarFive.setIcon(icnDeselectedIcon);
        }
    }//GEN-LAST:event_lblStarOneMouseClicked

    private void lblStarTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStarTwoMouseClicked
        if (booIsSelector == true) {
            intSelectedRating = 2;
            lblStarOne.setIcon(icnSelectedIcon);
            lblStarTwo.setIcon(icnSelectedIcon);
            lblStarThree.setIcon(icnDeselectedIcon);
            lblStarFour.setIcon(icnDeselectedIcon);
            lblStarFive.setIcon(icnDeselectedIcon);
        }
    }//GEN-LAST:event_lblStarTwoMouseClicked

    private void lblStarThreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStarThreeMouseClicked
        if (booIsSelector == true) {
            intSelectedRating = 3;
            lblStarOne.setIcon(icnSelectedIcon);
            lblStarTwo.setIcon(icnSelectedIcon);
            lblStarThree.setIcon(icnSelectedIcon);
            lblStarFour.setIcon(icnDeselectedIcon);
            lblStarFive.setIcon(icnDeselectedIcon);
        }
    }//GEN-LAST:event_lblStarThreeMouseClicked

    private void lblStarFourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStarFourMouseClicked
        if (booIsSelector == true) {
            intSelectedRating = 4;
            lblStarOne.setIcon(icnSelectedIcon);
            lblStarTwo.setIcon(icnSelectedIcon);
            lblStarThree.setIcon(icnSelectedIcon);
            lblStarFour.setIcon(icnSelectedIcon);
            lblStarFive.setIcon(icnDeselectedIcon);
        }
    }//GEN-LAST:event_lblStarFourMouseClicked

    private void lblStarFiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStarFiveMouseClicked
        if (booIsSelector == true) {
            intSelectedRating = 5;
            lblStarOne.setIcon(icnSelectedIcon);
            lblStarTwo.setIcon(icnSelectedIcon);
            lblStarThree.setIcon(icnSelectedIcon);
            lblStarFour.setIcon(icnSelectedIcon);
            lblStarFive.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStarFiveMouseClicked
    //</editor-fold>
    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            pmnContextMenu.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseClicked

    private void mniUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUpdateActionPerformed
        GameDataWindow winUpdateGame = new GameDataWindow();
        winUpdateGame.setTitle("Level-Up Library - Update Game");
        winUpdateGame.setVisible(true);
    }//GEN-LAST:event_mniUpdateActionPerformed
    
    public void setIsSelector(boolean isSelector) {
        this.booIsSelector = isSelector;
    }
    
    public boolean getIsSelector() {
        return booIsSelector;
    }
    
    /**
     *
     * @param intRating
     */
    public void setRating(int intRating) {
        intSelectedRating = intRating;
        switch (intRating){
            case 0 -> {
                lblStarOne.setIcon(icnDeselectedIcon);
                lblStarTwo.setIcon(icnDeselectedIcon);
                lblStarThree.setIcon(icnDeselectedIcon);
                lblStarFour.setIcon(icnDeselectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
            }
            case 1 -> {
                lblStarOne.setIcon(icnSelectedIcon);
                lblStarTwo.setIcon(icnDeselectedIcon);
                lblStarThree.setIcon(icnDeselectedIcon);
                lblStarFour.setIcon(icnDeselectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
            }
            case 2 -> {
                lblStarOne.setIcon(icnSelectedIcon);
                lblStarTwo.setIcon(icnSelectedIcon);
                lblStarThree.setIcon(icnDeselectedIcon);
                lblStarFour.setIcon(icnDeselectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
            }
            case 3 -> {
                lblStarOne.setIcon(icnSelectedIcon);
                lblStarTwo.setIcon(icnSelectedIcon);
                lblStarThree.setIcon(icnSelectedIcon);
                lblStarFour.setIcon(icnDeselectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
            }
            case 4 -> {
                lblStarOne.setIcon(icnSelectedIcon);
                lblStarTwo.setIcon(icnSelectedIcon);
                lblStarThree.setIcon(icnSelectedIcon);
                lblStarFour.setIcon(icnSelectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
            }
            case 5 -> {
                lblStarOne.setIcon(icnSelectedIcon);
                lblStarTwo.setIcon(icnSelectedIcon);
                lblStarThree.setIcon(icnSelectedIcon);
                lblStarFour.setIcon(icnSelectedIcon);
                lblStarFive.setIcon(icnSelectedIcon);
            }
            default -> {
                lblStarOne.setIcon(icnDeselectedIcon);
                lblStarTwo.setIcon(icnDeselectedIcon);
                lblStarThree.setIcon(icnDeselectedIcon);
                lblStarFour.setIcon(icnDeselectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
                System.err.println("Provided rating is not within the range of '0' to '5' inclusively");
            }
        }
    }
    
    public int getRating() {
        return intSelectedRating;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFrontSpacer;
    private javax.swing.JLabel lblStarFive;
    private javax.swing.JLabel lblStarFour;
    private javax.swing.JLabel lblStarOne;
    private javax.swing.JLabel lblStarThree;
    private javax.swing.JLabel lblStarTwo;
    private javax.swing.JMenuItem mniUpdate;
    private javax.swing.JPopupMenu pmnContextMenu;
    // End of variables declaration//GEN-END:variables
}
