
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;

/**
 *
 * @author dylan
 */
public class GameEntry extends javax.swing.JToggleButton {

    /**
     * Creates new form GameEntry
     */
    public GameEntry() {
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
        mniRemove = new javax.swing.JMenuItem();
        lblSpacer = new javax.swing.JLabel();
        lblBoxArt = new javax.swing.JLabel();
        lblGameName = new javax.swing.JLabel();
        lblClassification = new javax.swing.JLabel();
        lblMACL = new javax.swing.JLabel();
        lblReleaseYear = new javax.swing.JLabel();
        lblPlayStatus = new javax.swing.JLabel();

        pmnContextMenu.setName(""); // NOI18N

        mniUpdate.setText("Update");
        mniUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUpdateActionPerformed(evt);
            }
        });
        pmnContextMenu.add(mniUpdate);

        mniRemove.setText("Remove");
        mniRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRemoveActionPerformed(evt);
            }
        });
        pmnContextMenu.add(mniRemove);

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        org.jdesktop.swingx.HorizontalLayout horizontalLayout1 = new org.jdesktop.swingx.HorizontalLayout();
        horizontalLayout1.setGap(5);
        setLayout(horizontalLayout1);
        add(lblSpacer);

        lblBoxArt.setText("No Image");
        add(lblBoxArt);

        lblGameName.setText("Name");
        add(lblGameName);

        lblClassification.setText("Class");
        add(lblClassification);

        lblMACL.setText("MACL");
        add(lblMACL);

        lblReleaseYear.setText("Year");
        add(lblReleaseYear);

        lblPlayStatus.setText("Status");
        lblPlayStatus.setToolTipText("");
        add(lblPlayStatus);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="expanded" desc="Global Variables">
    public static String[] sarThisGameData = new String[10];
    // </editor-fold>
    
    public void mthSetFields(String[] sarGameData) {
        // Store the game data locally
        sarThisGameData = sarGameData;
        
        /** 
         * Get the box art image from the provided relative path and resize it to fit the label
         * If the image cannot be loaded for whatever reason, the label's text states the inability to load the image
         */
        BufferedImage bimBoxArtImage = null;
        try {
            bimBoxArtImage = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\" + 
                    sarGameData[2]));
        } catch (IOException exc) {
            System.err.println(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()) + " " + 
                    "Unable to load boxart image " + "(" + System.getProperty("user.dir") + "\\src\\main\\resources\\" + 
                    sarGameData[2] + ") " + "for " + sarThisGameData[0] + " on " + sarThisGameData[1]);
        }
        if (bimBoxArtImage != null) {
            lblBoxArt.setText("");
            Image imgBoxArtImage = bimBoxArtImage.getScaledInstance(45, 70, Image.SCALE_SMOOTH);
            ImageIcon icnBoxArtImage = new ImageIcon(imgBoxArtImage);
            lblBoxArt.setIcon(icnBoxArtImage);
        } else {
            lblBoxArt.setText("No \n Image");
        }
        
        // Set the values of the remaining game data fields
        lblGameName.setText(sarGameData[3]);
        lblMACL.setText(sarGameData[4]);
        lblClassification.setText(sarGameData[5]);
        lblReleaseYear.setText(sarGameData[6]);
        lblPlayStatus.setText(sarGameData[7]);
        
        // Create, set and add a new rating object to this object
        StarRating srtRating = new StarRating();
        srtRating.mthSetRating(Integer.parseInt(sarGameData[8]));
        this.add(srtRating);
    }
    
    private void mniUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUpdateActionPerformed
        // Create new game data window and set its type to edit the current entry
        GameDataWindow winUpdateGame = new GameDataWindow();
        winUpdateGame.mthSetWindowType("edit");
        winUpdateGame.mthLoadCurrentGameData(sarThisGameData);
        winUpdateGame.setVisible(true);
    }//GEN-LAST:event_mniUpdateActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // Set the selected game to the current instance of this object and open the context menu, only if right clicked
        MainWindow.strSelectedGame = sarThisGameData[0];
        if (SwingUtilities.isRightMouseButton(evt)) {
            pmnContextMenu.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseClicked

    /**
     * Remove the current entry from the stored variables and the database file, decrypting and re-encrypting the file 
     *  before and after the editing actions, respectively
     * The interface is updated, actions are flagged as 'unsaved' and the user is notified of the success or failure 
     *  of the action
     */
    private void mniRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRemoveActionPerformed
        // Confirm with the user if they wish to delete the entry
        int intConfirmExit = (int) JOptionPane.showConfirmDialog(null, 
                "Deleting entry!\nDo you wish to proceed?", "Remove Entry", JOptionPane.YES_NO_OPTION, 
                JOptionPane.ERROR_MESSAGE);
        if (intConfirmExit != 0) return;
        
        XPathFactory xpfXPathFactory = XPathFactory.newInstance();
        XPath xpaXPath = xpfXPathFactory.newXPath();
        
        try {
            // Get the node of the loaded XML file that matches the ID of the selected game
            XPathExpression xpeExpr = xpaXPath.compile("/gameList/game[@id = '" + sarThisGameData[0] + "']");
            Node nodCurrentNode = (Node) xpeExpr.evaluate(MainWindow.docXMLFile, XPathConstants.NODE);
            nodCurrentNode.getParentNode().removeChild(nodCurrentNode);
            
            // Update the platform list variables and the loaded XML attribute
            String strPlatformList = Arrays.toString(MainWindow.sarPlatformList);
            strPlatformList = strPlatformList.replace("[", "");
            strPlatformList = strPlatformList.replace("]", "");
            strPlatformList = strPlatformList.replace(", " + sarThisGameData[1], "");
            MainWindow.docXMLFile.getDocumentElement().setAttribute("platformList", strPlatformList);
            MainWindow.sarPlatformList = new String[MainWindow.sarPlatformList.length];
            MainWindow.sarPlatformList = strPlatformList.split(", ");
            MainWindow.intPlatformCount--;
            
            
            // Create the temp file to store the decrypted database as an XML file
            File filTempFile = new File(MainWindow.pthDatabaseFilePath.toString().replace(".encrypted", 
                    ".xml"));
            filTempFile.createNewFile();
            MainWindow.pthTempFile = filTempFile.toPath();
            
            // Decrypt the database and write it to the temp file
            CryptoUtils.mthDecryptFile(MainWindow.barEncryptionKey, MainWindow.pthDatabaseFilePath.toFile(), 
                    MainWindow.pthTempFile.toFile());
            
            
            // Create a XML transformer and write the loaded XML file to the temp file
            TransformerFactory tffTransformerFactory = TransformerFactory.newInstance();
            Transformer tsfTransformer = tffTransformerFactory.newTransformer();
            tsfTransformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource dmsSource = new DOMSource(MainWindow.docXMLFile);
            FileOutputStream fosOutput = new FileOutputStream(MainWindow.pthTempFile.toString());
            StreamResult smrResult = new StreamResult(fosOutput);
            tsfTransformer.transform(dmsSource, smrResult);
            
            
            // Re-encrypt the database and delete the temp file
            CryptoUtils.mthEncryptFile(MainWindow.barEncryptionKey, MainWindow.pthTempFile.toFile(), 
                    MainWindow.pthDatabaseFilePath.toFile());
            fosOutput.close();
            filTempFile.delete();
        } catch (XPathExpressionException | TransformerException | IOException | CryptoException exc) {
            // Log any errors and notify the user of failure
            System.err.println(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()) + " " + 
                    "Database editing didn't work (transformer or file error): " + exc);
            JOptionPane.showMessageDialog(this, "Game Failed To Be Removed");
        }
        
        // Update the data array and reduce its length
        String[][] smaUpdatedRecords = new String[MainWindow.smaGameData.length - 1][10];
        int intNewIndex = 0;
        for (String[] smaGameData : MainWindow.smaGameData) {
            if (!smaGameData[0].equals(sarThisGameData[0])) {
                smaUpdatedRecords[intNewIndex] = smaGameData;
                intNewIndex++;
            } 
            else break;
        }
        MainWindow.smaGameData = new String[smaUpdatedRecords.length][10];
        System.arraycopy(smaUpdatedRecords, 0, MainWindow.smaGameData, 0, 
                smaUpdatedRecords.length);
        
        // Update the interface, flag 'unsaved' actions and notify the user of success
        MainWindow.mthUpdateInterface();
        MainWindow.blnIsSaved = false;
        JOptionPane.showMessageDialog(this, "Game Removed Successfully");
    }//GEN-LAST:event_mniRemoveActionPerformed

    //<editor-fold defaultstate="collapsed" desc="Variables declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBoxArt;
    private javax.swing.JLabel lblClassification;
    private javax.swing.JLabel lblGameName;
    private javax.swing.JLabel lblMACL;
    private javax.swing.JLabel lblPlayStatus;
    private javax.swing.JLabel lblReleaseYear;
    private javax.swing.JLabel lblSpacer;
    private javax.swing.JMenuItem mniRemove;
    private javax.swing.JMenuItem mniUpdate;
    private javax.swing.JPopupMenu pmnContextMenu;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
