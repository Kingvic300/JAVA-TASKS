import java.util.Scanner;

public class Nokia2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your Nokia phone");
        System.out.println("1 -> Phone book");
        System.out.println("2 -> Messages");
        System.out.println("3 -> Chat");
        System.out.println("4 -> Call register");
        System.out.println("5 -> Tones");
        System.out.println("6 -> Settings");
        System.out.println("7 -> Call divert");
        System.out.println("8 -> Games");
        System.out.println("9 -> Calculator");
        System.out.println("10 -> Reminders");
        System.out.println("11 -> Clock");
        System.out.println("12 -> Profiles");
        System.out.println("13 -> SIM services");

        System.out.print("Input a button: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Phone book");
                System.out.println("1 -> Search");
                System.out.println("2 -> Service Nos.");
                System.out.println("3 -> Add name");
                System.out.println("4 -> Erase");
                System.out.println("5 -> Edit");
                System.out.println("6 -> Assign tone");
                System.out.println("7 -> Send b'card");
                System.out.println("8 -> Options");
                System.out.println("9 -> Speed dials");
                System.out.println("10 -> Voice Tags");
                System.out.print("Choose an option: ");
                int phonebookOption = input.nextInt();
                switch (phonebookOption) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos.");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("Options");
                        System.out.println("1 -> Type of view");
                        System.out.println("2 -> Voice tags");
                        System.out.print("Choose an option: ");
                        int options = input.nextInt();
                        switch (options) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Voice tags");
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                        break;
                    case 9:
                        System.out.println("Speed dials");
                        break;
                    case 10:
                        System.out.println("Voice Tags");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;
            case 2:
                System.out.println("Messages");
                System.out.println("1 -> Inbox");
                System.out.println("2 -> Outbox");
                System.out.println("3 -> Picture messages");
                System.out.println("4 -> Templates");
                System.out.println("5 -> Smileys");
                System.out.println("6 -> Message settings");
                System.out.print("Choose an option: ");
                int messageOption = input.nextInt();
                switch (messageOption) {
                    case 1:
                        System.out.println("Inbox");
                        break;
                    case 2:
                        System.out.println("Outbox");
                        break;
                    case 3:
                        System.out.println("Picture messages");
                        break;
                    case 4:
                        System.out.println("Templates");
                        break;
                    case 5:
                        System.out.println("Smileys");
                        break;
                    case 6:
                        System.out.println("Message settings");
                        System.out.println("1 -> Set1");
                        System.out.println("2 -> Common");
                        System.out.print("Choose an option: ");
                        int messageSettingsOption = input.nextInt();
                        switch (messageSettingsOption) {
                            case 1:
                                System.out.println("Set1");
                                System.out.println("1 -> Message center number");
                                System.out.println("2 -> Messages sent as");
                                System.out.println("3 -> Message validity");
                                break;
                            case 2:
                                System.out.println("Common");
                                System.out.println("1 -> Delivery reports");
                                System.out.println("2 -> Reply via same centre");
                                System.out.println("3 -> Character support");
                                System.out.println("4 -> Info service");
                                System.out.println("5 -> Voice mailbox number");
                                System.out.println("6 -> Service command editor");
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                System.out.println("Call register");
                System.out.println("1 -> Missed calls");
                System.out.println("2 -> Received calls");
                System.out.println("3 -> Dialled numbers");
                System.out.println("4 -> Erase recent call lists");
                System.out.println("5 -> Show call duration");
                System.out.println("6 -> Show call costs");
                System.out.println("7 -> Call cost settings");
                System.out.print("Choose an option: ");
                int callRegisterOption = input.nextInt();
                switch (callRegisterOption) {
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialled numbers");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        System.out.println("Show call duration");
                        System.out.println("1 -> Last call duration");
                        System.out.println("2 -> All calls' duration");
                        System.out.println("3 -> Received calls' duration");
                        System.out.println("4 -> Dialled calls' duration");
                        System.out.println("5 -> Clear timers");
                        break;
                    case 6:
                        System.out.println("Show call costs");
                        System.out.println("1 -> Last call costs");
                        System.out.println("2 -> All calls' costs");
                        System.out.println("3 -> Clears counters");
                        break;
                    case 7:
                        System.out.println("Call cost settings");
                        System.out.println("1 -> Call cost limit");
                        System.out.println("2 -> Show costs in");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;
            case 5:
                System.out.println("Tones");
                System.out.println("1 -> Ringing tone");
                System.out.println("2 -> Ringing volume");
                System.out.println("3 -> Incoming call alert");
                System.out.println("4 -> Composer");
                System.out.println("5 -> Message alert tone");
                System.out.println("6 -> Keypad tones");
                System.out.println("7 -> Warning and game tones");
                System.out.println("8 -> Vibrating alert");
                System.out.println("9 -> Screen saver");
                System.out.print("Choose an option: ");
                int tonesOption = input.nextInt();
                switch (tonesOption) {
                    case 1:
                        System.out.println("Ringing tone");
                        break;
                    case 2:
                        System.out.println("Ringing volume");
                        break;
                    case 3:
                        System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("Composer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypad tones");
                        break;
                    case 7:
                        System.out.println("Warning and game tones");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
                break;
            case 6:
                System.out.println("Settings");
                System.out.println("1 -> Call settings");
                System.out.println("2 -> Phone settings");
                System.out.println("3 -> Security settings");
                System.out.println("4 -> Restore factory settings");
                System.out.print("Choose an option: ");
                int settingsOption = input.nextInt();
                switch (settingsOption) {
                    case 1:
                        System.out.println("Call settings");
                        System.out.println("1 -> Automatic redial");
                        System.out.println("2 -> Speed dialing");
                        System.out.println("3 -> Call waiting options");
                        System.out.println("4 -> Own number sending");
                        System.out.println("5 -> Phone line in use");
                        System.out.println("6 -> Automatic Answer");
                        break;
                    case 2:
                        System.out.println("Phone settings");
                        System.out.println("1 -> Language");
                        System.out.println("2 -> Cell info display");
                        System.out.println("3 -> Welcome note");
                        System.out.println("4 -> Network selection");
                        System.out.println("5 -> Lights");
                        System.out.println("6 -> Confirm SIM service actions");
                        break;
                    }
}
}
}