package desprogram;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
public class DesEncrypter {
    Cipher ecipher;
    public DesEncrypter(SecretKey key) throws Exception {
        ecipher = Cipher.getInstance("DES");
        ecipher.init(Cipher.ENCRYPT_MODE, key);
    }
	public byte[] encrypt(byte[] input) throws Exception {
        return ecipher.doFinal(input);
    }

}
