package TeachMeSkills;

import java.time.LocalDate;

public class UserOfAmericanBank extends User {

    private int state;
    private String stateOfAmerica;

    public UserOfAmericanBank(String firstName, String lastName, LocalDate dateOfBirth, String passportNumber, String gender, Invoice[] amountOfInvoices, int state, String stateOfAmerica) {
        super(firstName, lastName, dateOfBirth, passportNumber, gender, amountOfInvoices);
        this.state = state;
        this.stateOfAmerica = stateOfAmerica;
    }

    UserOfAmericanBank newUser1 = new UserOfAmericanBank("name", "surname", new LocalDate(2025, 1, 1), "0000000000000000", "female", 100, 1);

}



