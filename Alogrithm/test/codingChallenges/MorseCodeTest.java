package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MorseCodeTest {
    @Test
    public void morseCodeEncryption() {
        String morseCode = "Victor";

        morseCode = MorseCode.encryption(morseCode);

        String encryptedMorseCode = "...-..-.-.----.-.";

        assertEquals(encryptedMorseCode, morseCode);
    }

}