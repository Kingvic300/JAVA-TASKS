package codingChallenges;

import java.util.ArrayList;

public class CaesarCipher {
    public static String encryption(String[] text, int key) {
        ArrayList<String> encrypt = new ArrayList<>();
        for (int index = 0; index < text.length; index++) {
            char character = text[index].charAt(index);
            validateText(character);
            characterCasing(character);
            validatedKey(key);
            int[] encrypted = new int[text.length];
            for(int i = 0; i < encrypted.length; i++) {
                encrypted += character += key;
            }
        }
        return encrypt.toString();

    }
    private static void validatedKey(int key) {
        if(key >= 1 && key <= 26){
            return;
        }
        throw new IllegalArgumentException("Invalid key");
    }
    private static void validateText(char text) {
        if(!Character.isLetter(text)){
            throw new IllegalArgumentException("Invalid character");
        }
    }
    private static char characterCasing(char character){
        return  Character.toUpperCase(character);
    }
}
