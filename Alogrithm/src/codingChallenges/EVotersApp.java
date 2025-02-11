package codingChallenges;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EVotersApp {
    private final List<Candidate> candidates = new ArrayList<>();
    private final List<User> users = new ArrayList<>();
    private static final PollingUnit pollingUnit = new PollingUnit();

    public static void main(String[] args) {
        gotToManMenu();
    }
    public static void gotToManMenu(){
        String options = """
                1->Add Candidate
                2->Add User
                3->Cast Vote
                4->View Results
                5->exit Program
                """;
        display(options);
        mainMenu(input("Enter option:"));
    }
    public static void mainMenu(String input){
        switch (input) {
            case "1":addCandidate();
            case "2":addUser();
            case "3":castVote();
            case "4":viewResults();
            case "5":exitProgram();
        }
    }

    private static void exitProgram() {
        display("Thanks for using our program");
        System.exit(42);
    }

    private static void viewResults() {
    }

    private static void castVote() {
    }

    private static void addUser() {

    }

    private static void addCandidate() {
        String name = input("Enter name:");
        int age = integerInput("Enter your age");
        String gender = input("Enter your gender");
        String address = input("Enter your address");
        String phoneNumber = input("Enter your phoneNumber");
        String email = input("Enter yor email");
        pollingUnit.addCandidate(name,age, gender, address, phoneNumber, email);
    }

    private static void display(String display){
        System.out.println(display);
    }
    private static String input(String prompt){
        display(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    private static int integerInput(String prompt){
        display(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
