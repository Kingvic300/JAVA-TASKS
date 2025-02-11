import java.time.LocalDate;

public class Customer {
    private String name;
    private String phone;
    private String email;
    private String password;
    private String DOB;
    private String gender;

    public Customer(String name, String email, String password, String DOB, String gender, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.DOB = validateAge(DOB);
        this.gender = gender;
        this.phone = phone;
    }

    //public void addBooks
    private String validateAge(String DOB) {
        LocalDate localDate = LocalDate.now();
        String[] DOBs = DOB.split("/");
        int birthDate = Integer.parseInt(DOBs[0]);
        int birthMonth = Integer.parseInt(DOBs[1]);
        int birthYear = Integer.parseInt(DOBs[2]);

        int currentYear = LocalDate.now().getYear();
        int currentMonth = LocalDate.now().getMonthValue();
        int currentDay = LocalDate.now().getDayOfMonth();

        return String.valueOf(birthYear - currentYear);
    }
}
