import java.util.Scanner;

public class AirlineReservationsSystem {
    private static boolean[] seatingChart = new boolean[10];
    public static void main(String[] args) {
        goToMainMenu();
    }
    public static void goToMainMenu() {
        String menu = """
                Welcome to the Airline Reservation System!
                1->Plane class
                2->Boarding pass
                3->Exit
                """;
        display(menu);
        mainMenu(input("Enter an option"));

    }

    public static void mainMenu(String prompt) {
        switch(prompt){
            case "1": planeClasses();
            case "2": boardingPass();
            case "3": exitApp();
        }
    }

    public static void planeClasses() {
       int count = 0;
        while(count <= 10) {
            String input = input("Enter your seat number to locate which class you belong to ");

            count++;
        }
        exitApp();
    }

    public static void boardingPass() {

    }

    public static void exitApp() {
        display("Thanks for using our app");
        System.exit(49);
    }

    public static void secondClass() {
        boolean[] seatingChart;
        goToMainMenu();
    }

    public static void firstClass() {
        boolean []seatingChart;

        goToMainMenu();
    }

    private static void display(String display) {
        System.out.print(display);
    }

    private static String input(String prompt) {
        display(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
