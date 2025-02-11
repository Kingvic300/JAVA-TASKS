package Chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class DiceRollingGame {
    static final int numberOfRolls = 36;
    static final int sizeOfEachDie = 6;
    public static void main(String[] args) {
        diceBoard();
    }
    public static void diceBoard(){
        rollDice();
    }
    public static void rollDice(){
        int[][] sums = new int[6][6];
        Random random = new Random();
        for(int count = 0; count < numberOfRolls; count++){
            int firstRoll = random.nextInt(6) + 1;
            int secondRoll = random.nextInt(6) + 1;

            System.out.println(sums[count]);
        }
    }
}
