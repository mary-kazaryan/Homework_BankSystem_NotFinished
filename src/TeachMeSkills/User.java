package TeachMeSkills;
import java.time.LocalDate;
import java.util.Date;

public abstract class User {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String passportNumber;
    private String gender;
    private static Invoice[] amountOfInvoices = new Invoice[100];

    final String male = "male";
    final String female = "female";

    public User(String firstName, String lastName, LocalDate dateOfBirth, String passportNumber, String gender, Invoice [] amountOfInvoices) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.passportNumber = passportNumber;
        this.gender = gender;
    }

    Bank newAmericanBank = new Bank ("America", 1, "euro", new LocalDate(2025, 1, 1));
    Bank newChinaBank = new Bank("China", 2, "renminbi", new LocalDate(2025, 1, 1));
    Bank newGermanBank = new Bank ("Germany", 3, "euro", new LocalDate(2025, 1, 1));



    public static void createInvoice(String numberOfInvoice, double sumOfInvoice, LocalDate endOfInvoice) {
        if (sumOfInvoice >= Bank.getMinSum()) {
            UserOfAmericanBank.addInvoiceToArray(numberOfInvoice, sumOfInvoice, endOfInvoice);
            System.out.println("Открытие счета в Bank of America");
        } else System.out.println("Сумма меньше порогой");
    }

    public static void addInvoiceToArray(String numberOfInvoice, double sumOfInvoice, Date endOfInvoice) {
        boolean isInvoicesArrayNotFull = true;
            for (Invoice item : amountOfInvoices) {
            if (item == null) {
                boolean isInvoicesArrayNotFull = true;
                break;

                // TODO вызвать следующий метод на добавление инвойса в массив
            } else if (item != null && bill.equals(item)) {
                System.out.println("Такой счет уже существует у пользователя. Создайте, пожалуйста, другой банковский счет.");
            } else
                System.out.println("На данный момент у вас создано максимальное количество счетов. Обратитесь, пожалуйста в банк.");
        }
    }

    



    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if (gender.equals(male) || gender.equals(female)) {
            this.gender = gender;
        } else System.out.println("This field can contain either ale or female parameter");
    }

}
