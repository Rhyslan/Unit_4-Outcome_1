/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dylan
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
 
/**
 * A utility class that encrypts or decrypts a file.
 * @author www.codejava.net
 *
 */
public class CryptoUtils {
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES";
 
    public static void mthEncryptFile(byte[] key, File inputFile, File outputFile) throws CryptoException {
        mthEnDeCrypt(Cipher.ENCRYPT_MODE, key, inputFile, outputFile);
    }
 
    public static void mthDecryptFile(byte[] key, File inputFile, File outputFile) throws CryptoException {
        mthEnDeCrypt(Cipher.DECRYPT_MODE, key, inputFile, outputFile);
    }
 
    private static void mthEnDeCrypt(int cipherMode, byte[] key, File inputFile, File outputFile) throws CryptoException {
        try {
            Key keySecretKey = new SecretKeySpec(key, ALGORITHM);
            Cipher cphCipher = Cipher.getInstance(TRANSFORMATION);
            cphCipher.init(cipherMode, keySecretKey);
             
            FileInputStream fisInputStream = new FileInputStream(inputFile);
            FileOutputStream fosOutputStream = new FileOutputStream(outputFile);
            byte[] barInputBytes = new byte[1000000000];
            
            int intCount = fisInputStream.read(barInputBytes);
            while (intCount >= 0) {
                fosOutputStream.write(cphCipher.update(barInputBytes, 0, intCount));
                intCount = fisInputStream.read(barInputBytes);
            }
            
            fosOutputStream.write(cphCipher.doFinal());
            fosOutputStream.flush();
             
            fisInputStream.close();
            fosOutputStream.close();
             
        } catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException | IOException ex) {
            System.err.println(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()) + " " + "Encryption Error: " + ex);
        }
    }
}
