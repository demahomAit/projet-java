package desprogram;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class DesDecrypter {
    Cipher dcipher;

    public DesDecrypter(SecretKey key) throws Exception {
        dcipher = Cipher.getInstance("DES");
        dcipher.init(Cipher.DECRYPT_MODE, key);
    }

    public byte[] decrypt(byte[] input) throws Exception {
        return dcipher.doFinal(input);
    }

}

