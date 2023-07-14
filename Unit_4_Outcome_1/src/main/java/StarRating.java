
import javax.swing.ImageIcon;

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

        lblFrontSpacer = new javax.swing.JLabel();
        lblStar1 = new javax.swing.JLabel();
        lblStar2 = new javax.swing.JLabel();
        lblStar3 = new javax.swing.JLabel();
        lblStar4 = new javax.swing.JLabel();
        lblStar5 = new javax.swing.JLabel();

        org.jdesktop.swingx.HorizontalLayout horizontalLayout1 = new org.jdesktop.swingx.HorizontalLayout();
        horizontalLayout1.setGap(5);
        setLayout(horizontalLayout1);
        add(lblFrontSpacer);

        lblStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeselectedStar.png"))); // NOI18N
        lblStar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStar1MouseExited(evt);
            }
        });
        add(lblStar1);

        lblStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeselectedStar.png"))); // NOI18N
        lblStar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblStar2MouseDragged(evt);
            }
        });
        lblStar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStar2MouseExited(evt);
            }
        });
        add(lblStar2);

        lblStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeselectedStar.png"))); // NOI18N
        lblStar3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblStar3MouseDragged(evt);
            }
        });
        lblStar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStar3MouseExited(evt);
            }
        });
        add(lblStar3);

        lblStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeselectedStar.png"))); // NOI18N
        lblStar4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblStar4MouseDragged(evt);
            }
        });
        lblStar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStar4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStar4MouseExited(evt);
            }
        });
        add(lblStar4);

        lblStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DeselectedStar.png"))); // NOI18N
        lblStar5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblStar5MouseDragged(evt);
            }
        });
        lblStar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStar5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStar5MouseExited(evt);
            }
        });
        add(lblStar5);
    }// </editor-fold>//GEN-END:initComponents

    private ImageIcon icnSelectedIcon = new ImageIcon(getClass().getResource("/SelectedStar.png"));
    private ImageIcon icnDeselectedIcon = new ImageIcon(getClass().getResource("/DeselectedStar.png"));
    private boolean booIsSelector = false;
    public int intSelectedRating = 0;
    
    //<editor-fold defaultstate="collapsed" desc="Selection Highlighting">
    private void lblStar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar1MouseEntered
        if (booIsSelector == true) {
            lblStar1.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStar1MouseEntered

    private void lblStar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar1MouseExited
        if (booIsSelector == true & intSelectedRating != 1) {
            lblStar1.setIcon(icnDeselectedIcon);
        }
    }//GEN-LAST:event_lblStar1MouseExited

    private void lblStar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar2MouseEntered
        if (booIsSelector == true) {
            lblStar1.setIcon(icnSelectedIcon);
            lblStar2.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStar2MouseEntered

    private void lblStar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar2MouseExited
        if (booIsSelector == true & intSelectedRating != 2) {
            lblStar1.setIcon(icnDeselectedIcon);
            lblStar2.setIcon(icnDeselectedIcon);
        }
    }//GEN-LAST:event_lblStar2MouseExited

    private void lblStar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar3MouseEntered
        if (booIsSelector == true) {
            lblStar1.setIcon(icnSelectedIcon);
            lblStar2.setIcon(icnSelectedIcon);
            lblStar3.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStar3MouseEntered

    private void lblStar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar3MouseExited
        if (booIsSelector == true  & intSelectedRating != 3) {
            lblStar1.setIcon(icnDeselectedIcon);
            lblStar2.setIcon(icnDeselectedIcon);
            lblStar3.setIcon(icnDeselectedIcon);
        }
    }//GEN-LAST:event_lblStar3MouseExited

    private void lblStar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar4MouseEntered
        if (booIsSelector == true) {
            lblStar1.setIcon(icnSelectedIcon);
            lblStar2.setIcon(icnSelectedIcon);
            lblStar3.setIcon(icnSelectedIcon);
            lblStar4.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStar4MouseEntered

    private void lblStar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar4MouseExited
        if (booIsSelector == true  & intSelectedRating != 4) {
            lblStar1.setIcon(icnDeselectedIcon);
            lblStar2.setIcon(icnDeselectedIcon);
            lblStar3.setIcon(icnDeselectedIcon);
            lblStar4.setIcon(icnDeselectedIcon);
        }
    }//GEN-LAST:event_lblStar4MouseExited

    private void lblStar5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar5MouseEntered
        if (booIsSelector == true) {
            lblStar1.setIcon(icnSelectedIcon);
            lblStar2.setIcon(icnSelectedIcon);
            lblStar3.setIcon(icnSelectedIcon);
            lblStar4.setIcon(icnSelectedIcon);
            lblStar5.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStar5MouseEntered

    private void lblStar5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar5MouseExited
        if (booIsSelector == true  & intSelectedRating != 5) {
            lblStar1.setIcon(icnDeselectedIcon);
            lblStar2.setIcon(icnDeselectedIcon);
            lblStar3.setIcon(icnDeselectedIcon);
            lblStar4.setIcon(icnDeselectedIcon);
            lblStar5.setIcon(icnDeselectedIcon);
        }
    }//GEN-LAST:event_lblStar5MouseExited
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Selection Handling">
    private void lblStar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar1MouseClicked
        if (booIsSelector == true) {
            intSelectedRating = 1;
            lblStar1.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStar1MouseClicked

    private void lblStar2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar2MouseDragged
        if (booIsSelector == true) {
            intSelectedRating = 2;
            lblStar1.setIcon(icnSelectedIcon);
            lblStar2.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStar2MouseDragged

    private void lblStar3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar3MouseDragged
        if (booIsSelector == true) {
            intSelectedRating = 3;
            lblStar1.setIcon(icnSelectedIcon);
            lblStar2.setIcon(icnSelectedIcon);
            lblStar3.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStar3MouseDragged

    private void lblStar4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar4MouseDragged
        if (booIsSelector == true) {
            intSelectedRating = 4;
            lblStar1.setIcon(icnSelectedIcon);
            lblStar2.setIcon(icnSelectedIcon);
            lblStar3.setIcon(icnSelectedIcon);
            lblStar4.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStar4MouseDragged

    private void lblStar5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStar5MouseDragged
        if (booIsSelector == true) {
            intSelectedRating = 5;
            lblStar1.setIcon(icnSelectedIcon);
            lblStar2.setIcon(icnSelectedIcon);
            lblStar3.setIcon(icnSelectedIcon);
            lblStar4.setIcon(icnSelectedIcon);
            lblStar5.setIcon(icnSelectedIcon);
        }
    }//GEN-LAST:event_lblStar5MouseDragged
    //</editor-fold>
    
    public boolean getIsSelector() {
        return booIsSelector;
    }
    
    public void setIsSelector(boolean isSelector) {
        this.booIsSelector = isSelector;
    }
    
    /**
     *
     * @param intRating
     */
    public void setRating(int intRating) {
        intSelectedRating = intRating;
        switch (intRating){
            case 1:
                lblStar1.setIcon(icnSelectedIcon);
                lblStar2.setIcon(icnDeselectedIcon);
                lblStar3.setIcon(icnDeselectedIcon);
                lblStar4.setIcon(icnDeselectedIcon);
                lblStar5.setIcon(icnDeselectedIcon);
                break;
            case 2:
                lblStar1.setIcon(icnSelectedIcon);
                lblStar3.setIcon(icnSelectedIcon);
                lblStar4.setIcon(icnDeselectedIcon);
                lblStar5.setIcon(icnDeselectedIcon);
                break;
            case 3:
                lblStar1.setIcon(icnSelectedIcon);
                lblStar2.setIcon(icnSelectedIcon);
                lblStar3.setIcon(icnSelectedIcon);
                lblStar4.setIcon(icnDeselectedIcon);
                lblStar5.setIcon(icnDeselectedIcon);
                break;
            case 4:
                lblStar1.setIcon(icnSelectedIcon);
                lblStar2.setIcon(icnSelectedIcon);
                lblStar3.setIcon(icnSelectedIcon);
                lblStar4.setIcon(icnSelectedIcon);
                lblStar5.setIcon(icnDeselectedIcon);
                break;
            case 5:
                lblStar1.setIcon(icnSelectedIcon);
                lblStar2.setIcon(icnSelectedIcon);
                lblStar3.setIcon(icnSelectedIcon);
                lblStar4.setIcon(icnSelectedIcon);
                lblStar5.setIcon(icnSelectedIcon);
                break;
            default:
                lblStar1.setIcon(icnDeselectedIcon);
                lblStar2.setIcon(icnDeselectedIcon);
                lblStar3.setIcon(icnDeselectedIcon);
                lblStar4.setIcon(icnDeselectedIcon);
                lblStar5.setIcon(icnDeselectedIcon);
                System.out.println("switch did not work");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFrontSpacer;
    private javax.swing.JLabel lblStar1;
    private javax.swing.JLabel lblStar2;
    private javax.swing.JLabel lblStar3;
    private javax.swing.JLabel lblStar4;
    private javax.swing.JLabel lblStar5;
    // End of variables declaration//GEN-END:variables
}
