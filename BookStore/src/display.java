//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Scanner;
//
//public class display {
//        private static List<Book> books = new ArrayList<>();
//        private static ShoppingCart shoppingCart;
//        private static Order order;
//        private static Customer customer;
//        private static Payment payment;
//        public void createBooks () {
////            books.add(new Book("Embrace", "jack", 10, 15.99));
////            books.add(new Book("Deadly", "Akerele", 8, 12.50));
////            books.add(new Book("End", "jesse", 5, 14.75));
////            books.add(new Book("Shadows", "micheal", 7, 16.25));
////            books.add(new Book("Empires", "bolaji", 6, 18.99));
////            books.add(new Book("Storms", "victor", 9, 13.49));
////            books.add(new Book("Silence", "eniola", 4, 17.89));
////            books.add(new Book("Horizons", "seun", 11, 11.99));
////            books.add(new Book("Call", "peter", 7, 14.50));
////            books.add(new Book("Requiem", "sunny", 6, 13.75));
////            books.add(new Book("Rofih", "rofih", 6, 98.75));
//        }
//        public Book displayBooks () {
//            return (Book) books;
//        }
//        public static void main (String[]args){
//            Driver driver = new Driver();
//            driver.createBooks();
//            goToMainMenu();
//        }
//        private static void goToMainMenu () {
//            System.out.println();
//            System.out.println("Welcome to the Main Menu");
//            String options = """
//                    Press 1 Browse books
//                    Press 2 Search for books
//                    Press 3 Add books to cart
//                    Press 4 Remove books from cart
//                    Press 5 View shopping cart
//                    Press 6 Place an order
//                    Press 7 Make a payment
//                    Press 8 View order history
//                    Press 9 to exit our app
//                    """;
//
//            display(options);
//            mainMenu(input("Enter an option: "));
//
//        }
//
//        private static void mainMenu (String userInput){
//            switch (userInput) {
////            case "0":
////                loginPage();
////                goToMainMenu();
//                // break;
//                case "1":
//                    browseBooks();
//                    goToMainMenu();
//                    break;
//                case "2":
//                    searchDropDown();
//                    goToMainMenu();
//                    break;
//                case "3":
//                    addToCart();
//                    goToMainMenu();
//                    break;
//                case "4":
//                    removeFromCart();
//                    goToMainMenu();
//                    break;
//                case "5":
//                    viewCart();
//                    goToMainMenu();
//                    break;
//                case "6":
//                    placeOrder();
//                    goToMainMenu();
//                    break;
//                case "7":
//                    makePayment();
//                    goToMainMenu();
//                    break;
//                case "8":
//                    viewOrderHistory();
//                    goToMainMenu();
//                    break;
//                case "9":
//                    exitApp();
//                    break;
//                default:
//                    display("Invalid option. Please try again.");
//                    goToMainMenu();
//
//            }
//        }
//
////    private static void loginPage() {
////        String
////    }
//
//        private static void viewCart () {
//            if (shoppingCart == null) {
//                display("your shopping cart is empty");
//                goToMainMenu();
//            }
//            shoppingCart.viewCart();
//        }
//
//        private static void removeFromCart () {
//            if (shoppingCart == null) {
//                display("There is nothing to remove");
//                goToMainMenu();
//            }
//            String title = input("Enter title of the book: ");
//            shoppingCart.removeBookFromCart(title);
//        }
//
//        private static void addToCart () {
//            if (shoppingCart == null) {
//                shoppingCart = new ShoppingCart();
//            }
//            try {
//                String title = input("Enter title of the book: ");
//                String author = input("Enter author: ");
//                Double price = Double.valueOf(input("Enter price of the book: "));
//                int quantity = Integer.parseInt(input("Enter quantity of books you want to buy: "));
//                boolean found = false;
//                for (Book book : books) {
//                    if (book.getTitle().equalsIgnoreCase(title)) {
//                        found = true;
//                        display("Book has been successfully added to cart");
//                        shoppingCart.addBookToCart(title, author, quantity, price);
//                        goToMainMenu();
//                    }
//                }
//                if (!found) {
//                    display("Book not found. Please try again.");
//                    goToMainMenu();
//                }
//
//            } catch (NumberFormatException e) {
//                display("Please enter valid input.");
//                addToCart();
//            }
//        }
//
//
//        private static void searchForBook () {
//            while (true) {
//                try {
//                    String title = input("Enter the title of the book you wish to search: ");
//                    boolean found = false;
//                    for (Book book : books) {
//                        if (book.getTitle().equalsIgnoreCase(title)) {
//                            found = true;
//                            display("Book found");
//                            goToMainMenu();
//                        }
//                    }
//                    if (!found) {
//                        display("Book not found. Please try again.");
//                        goToMainMenu();
//                    }
//                } catch (NumberFormatException e) {
//                    display("Please enter valid input.");
//                    searchForBook();
//                }
//            }
//        }
//
//        private static void browseBooks () {
//            for (Book book : books) {
//                System.out.println(book.toString());
//            }
//        }
//
//        private static String input (String prompt){
//            Scanner scanner = new Scanner(System.in);
//            display(prompt);
//            return scanner.nextLine();
//        }
//
//        private static void display (String message){
//            System.out.println(message);
//        }
//
//        private static void exitApp () {
//            display("Thanks for using our app!");
//            System.exit(0);
//        }
//        public static void searchDropDown () {
//            String option = """
//                    Do you wish to see the list of books available before searching (yes/no)
//                    """;
//            display(option);
//            search(input("Press yes or no"));
//        }
//        public static void search (String input){
//            String userInput = input.toLowerCase();
//            switch (userInput) {
//                case "yes":
//                    browseBooks();
//                    searchForBook();
//                    goToMainMenu();
//                    break;
//                case "no":
//                    searchForBook();
//                    goToMainMenu();
//                default:
//                    display("wrong input try again");
//                    searchDropDown();
//            }
//        }
//        private static void placeOrder () {
//            if (shoppingCart == null) {
//                display("There is nothing to place order");
//                goToMainMenu();
//            }
//            if (shoppingCart.getItems().isEmpty()) {
//                System.out.println("Cannot place empty order!");
//                goToMainMenu();
//            }
//            try {
//                String title = input("Enter title of the book: ");
//                int orderID = (int) (Math.random() * 10000);
//                String orderDate = new Date().toString();
//                Order newOrder = new Order(orderID, customer, orderDate, shoppingCart.getItems());
//                Customer.getOrderHistory().add(newOrder);
//                newOrder.placeOrder(title);
//                shoppingCart.clearCart();
//            } catch (NumberFormatException e) {
//                display("Please enter valid input.");
//                placeOrder();
//            }
//        }
//
//        private static void makePayment () {
//            if (Customer.getOrderHistory().isEmpty()) {
//                display("No orders to pay for!");
//                goToMainMenu();
//            }
//            try {
//                Double amount = Double.valueOf(input("Enter an amount"));
//                display("Payment amount: $" + payment.getAmount());
//                payment = new Payment(amount);
//                payment.processPayment();
//                display("Payment successful!");
//            } catch (NumberFormatException e) {
//                display("Please enter valid input.");
//                makePayment();
//            }
//        }
//
//        private static void viewOrderHistory () {
//            System.out.println("Order History");
//            if (Customer.getOrderHistory().isEmpty()) {
//                display("No orders found!");
//                goToMainMenu();
//            }
//            for (Order order : Customer.getOrderHistory()) {
//                display("Order ID: " + order.getOrderID());
//                display("Total: $" + Order.calculateTotal());
//            }
//        }
//    }
