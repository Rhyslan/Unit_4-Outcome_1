
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HexFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class encryptFile {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new file browser window and get the selected file if the open button is pressed
        JFileChooser jfcFileBrowser = new JFileChooser(System.getProperty("user.dir") + "\\src\\main\\resources\\");
        int intResponse = jfcFileBrowser.showOpenDialog(null);
        Path pthDatabaseFilePath = null;
        Path pthNewFile = null;
        if (intResponse == JFileChooser.APPROVE_OPTION) {
            pthDatabaseFilePath = Paths.get(jfcFileBrowser.getSelectedFile().getAbsolutePath());
        } 
        else return;
        
        /** 
         * The key used for encrypting the file
         * MUST MATCH THE KEY USED IN THE MAIN PROGRAM
         */
        byte[] barKey = HexFormat.ofDelimiter(" ").parseHex("29 20 4e 9b 2b da 82 04 21 94 8b c4 d5 99 53 2c");
        
        try {
            // Set the java 'err' output stream to log to the 'error.log' file
            System.setErr(new PrintStream(new FileOutputStream(System.getProperty("user.dir")
                    + "\\src\\main\\resources\\" + "/errors.log")));
            
            // Prompt the user for whether they are encrypting or decrypting the file
            String strMode = JOptionPane.showInputDialog(null, "Encryption (e) or Decryption (d)", "Mode", JOptionPane.DEFAULT_OPTION);
            
            // If the mode is 'e' for encrypting, create the output file and write the encrypted input file to it
            if ("e".equals(strMode)) {
                // Create the temp file with the file extention '.encrypted'
                File filTempFile = new File(pthDatabaseFilePath.toString() + ".encrypted");
                filTempFile.createNewFile();
                pthNewFile = filTempFile.toPath();
                
                // Encrypt the file
                CryptoUtils.mthEncryptFile(barKey, pthDatabaseFilePath.toFile(), pthNewFile.toFile());
            } 
            // If the mode is 'd' for decrypting, create the output file and write the decrypted input file to it
            else if ("d".equals(strMode)){
                // Create the temp file with the file extention '.encrypted'
                File filTempFile = new File(pthDatabaseFilePath.toString() + ".decrypted");
                filTempFile.createNewFile();
                pthNewFile = filTempFile.toPath();
                
                // Decrypt the file
                CryptoUtils.mthDecryptFile(barKey, pthDatabaseFilePath.toFile(), pthNewFile.toFile());
            }
        } catch (CryptoException | IOException exc) {
            // Log any errors
            System.err.println(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()) + " " + exc);
        }
    }
}
