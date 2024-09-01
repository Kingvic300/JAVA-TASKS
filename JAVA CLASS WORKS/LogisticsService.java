import java.util.Scanner;

public class LogisticsService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: "); 
        int number = scan.nextInt();
        System.out.println(RiderDeliveries(number)); 
    }

    public static int RiderDeliveries(int number) {
        if (number < 50) {
            return number * 160 + 5000;
        } else if (number >= 50 && number < 60) {
            return number * 200 + 5000;
        } else if (number >= 60 && number < 70) {
            return number * 250 + 5000;
        } else {
            return number * 500 + 5000;
        }
    }
}
