package Encrypters;

/**
 * Created by Tastum on 17/10/2016.
 */

import java.util.Random;

public class Crypter {


    public static String encryptDecryptXOR(String input) {

        char[] key = {'K', 'K', 'K'}; //Dette kan være alle andre bogstaver end a,b og c.

        StringBuilder output = new StringBuilder();

        //For loop der scrambler den String, der bliver indtastet
        for (int i = 0; i < input.length(); i++) {
            output.append((char) (input.charAt(i) ^ key[i % key.length]));
        }
       // return input;
        return output.toString();
    }

    public static String xor() {

        //Eksempel på en hard-codet String, der bliver krypteret
        String communication = "test123";

        // Returnerer den krypterede værdi.
        return Crypter.encryptDecryptXOR(communication) + "\n" + Crypter.encryptDecryptXOR
                (Crypter.encryptDecryptXOR(communication));
    }


    public static String buildToken(String chars, int length) {
        Random rand = new Random();
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < length; i++) {
            buf.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return buf.toString();
    }

}
