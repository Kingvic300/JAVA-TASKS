import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for milliseconds: ");
        long milliseconds = input.nextLong();
        System.out.print(convertMillis(milliseconds));
    }

    public static String convertMillis(long millis) {
        long seconds = millis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        minutes = minutes % 60;
        seconds = seconds % 60;
        return hours + ":" + minutes + ":" + seconds;
    }
}