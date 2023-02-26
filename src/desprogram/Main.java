package desprogram;

import java.util.*;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


public class Main {

		public static void main(String[] args) throws Exception {
			
	        // Générer une clé de chiffrement DES de 64 bits
			
	        KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
	        SecretKey myDesKey = keygenerator.generateKey();
	        Scanner scanner=new Scanner(System.in);
	        
	        // Initialiser l'encrypteur
	        
	        DesEncrypter encrypter = new DesEncrypter(myDesKey);

	        // Chiffrer le texte
	        
	        System.out.println("entrer le texte a chiffrer:");
	        String text =scanner.nextLine();
	        scanner.close();
	        byte[] ciphertext = encrypter.encrypt(text.getBytes("UTF-8"));

	        // Afficher le texte chiffré
	        System.out.println("le cipher texte:"+new String(ciphertext, "UTF-8"));
	        
	        
	        

	        // Initialiser le décrypteur
	        DesDecrypter decrypter = new DesDecrypter(myDesKey);

	        // Déchiffrer le texte
	        byte[] decrypted = decrypter.decrypt(ciphertext);
	        // Afficher le texte déchiffré
	        System.out.println("texte claire:"+new String(decrypted, "UTF-8"));
	    }
	    
	}


