package Chapter7;

import java.util.Scanner;

public class AirlineReservationsSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] seats = new int[10];
        System.out.println(" Please type 1 for First Class and\n"+"Please type 2 for Economy");
        int response = input.nextInt();
        while (response != 1 && response != 2) {
            System.out.println(" Please type 1 for First Class and\n"+"Please type 2 for Economy");
            response = input.nextInt();
        }
        switch (response) {
            case 1:

            case 2:
                break;
        }
    }
}
