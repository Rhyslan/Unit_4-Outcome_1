
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

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

        lblFrontSpacer = new javax.swing.JLabel();
        lblStarOne = new javax.swing.JLabel();
        lblStarTwo = new javax.swing.JLabel();
        lblStarThree = new javax.swing.JLabel();
        lblStarFour = new javax.swing.JLabel();
        lblStarFive = new javax.swing.JLabel();

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

    //<editor-fold defaultstate="expanded" desc="Global Variables">
    public int intSelectedRating = 0;
    // </editor-fold>
    
    //<editor-fold defaultstate="expanded" desc="Local Variables">
    private final ImageIcon icnSelectedIcon = new ImageIcon(getClass().getResource("/SelectedStar.png"));
    private final ImageIcon icnDeselectedIcon = new ImageIcon(getClass().getResource("/DeselectedStar.png"));
    private boolean booIsSelector = false;
    // </editor-fold>
    
    /**
     * Set if the rating is editable
     * @param isSelector 
     */
    public void mthSetIsSelector(boolean isSelector) {
        this.booIsSelector = isSelector;
    }
    
    /**
     * Returns if the rating is editable
     * @return 
     */
    public boolean mthGetIsSelector() {
        return booIsSelector;
    }
    
    /**
     * Sets the icons of the labels depending on what rating is provided
     * @param intRating
     */
    public void mthSetRating(int intRating) {
        // Locally store the rating
        intSelectedRating = intRating;
        
        switch (intRating){
            // Rating of 0
            case 0 -> {
                lblStarOne.setIcon(icnDeselectedIcon);
                lblStarTwo.setIcon(icnDeselectedIcon);
                lblStarThree.setIcon(icnDeselectedIcon);
                lblStarFour.setIcon(icnDeselectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
            }
            // Rating of 1
            case 1 -> {
                lblStarOne.setIcon(icnSelectedIcon);
                lblStarTwo.setIcon(icnDeselectedIcon);
                lblStarThree.setIcon(icnDeselectedIcon);
                lblStarFour.setIcon(icnDeselectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
            }
            // Rating of 2
            case 2 -> {
                lblStarOne.setIcon(icnSelectedIcon);
                lblStarTwo.setIcon(icnSelectedIcon);
                lblStarThree.setIcon(icnDeselectedIcon);
                lblStarFour.setIcon(icnDeselectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
            }
            // Rating of 3
            case 3 -> {
                lblStarOne.setIcon(icnSelectedIcon);
                lblStarTwo.setIcon(icnSelectedIcon);
                lblStarThree.setIcon(icnSelectedIcon);
                lblStarFour.setIcon(icnDeselectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
            }
            // Rating of 4
            case 4 -> {
                lblStarOne.setIcon(icnSelectedIcon);
                lblStarTwo.setIcon(icnSelectedIcon);
                lblStarThree.setIcon(icnSelectedIcon);
                lblStarFour.setIcon(icnSelectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
            }
            // Rating of 5
            case 5 -> {
                lblStarOne.setIcon(icnSelectedIcon);
                lblStarTwo.setIcon(icnSelectedIcon);
                lblStarThree.setIcon(icnSelectedIcon);
                lblStarFour.setIcon(icnSelectedIcon);
                lblStarFive.setIcon(icnSelectedIcon);
            }
            // Sets the rating to 0 if the number provided is not within 0-5 inclusively
            default -> {
                lblStarOne.setIcon(icnDeselectedIcon);
                lblStarTwo.setIcon(icnDeselectedIcon);
                lblStarThree.setIcon(icnDeselectedIcon);
                lblStarFour.setIcon(icnDeselectedIcon);
                lblStarFive.setIcon(icnDeselectedIcon);
                System.err.println("Provided rating is not within the range of '0' to '5' inclusive");
            }
        }
    }
    
    /**
     * Returns the locally stored rating
     * @return 
     */
    public int mthGetRating() {
        return intSelectedRating;
    }
    
    /**
     * If the rating is editable, clear the rating
     */
    public void mthSelectRatingZero() {
        if (booIsSelector == true) {
            intSelectedRating = 0;
            lblStarOne.setIcon(icnDeselectedIcon);
            lblStarTwo.setIcon(icnDeselectedIcon);
            lblStarThree.setIcon(icnDeselectedIcon);
            lblStarFour.setIcon(icnDeselectedIcon);
            lblStarFive.setIcon(icnDeselectedIcon);
        }
    }
    
    //<editor-fold defaultstate="collapsed" desc="Click Selection">
    /**
     * If the rating is editable, depending on which star icon is clicked, set the rating and stars to match to selection
     */
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
    
    //<editor-fold defaultstate="collapsed" desc="Variables declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFrontSpacer;
    private javax.swing.JLabel lblStarFive;
    private javax.swing.JLabel lblStarFour;
    private javax.swing.JLabel lblStarOne;
    private javax.swing.JLabel lblStarThree;
    private javax.swing.JLabel lblStarTwo;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
