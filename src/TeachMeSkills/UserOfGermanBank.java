package TeachMeSkills;

import java.time.LocalDate;

public class UserOfGermanBank extends User {

    private int FederalLand;

    public UserOfGermanBank(String firstName, String lastName, LocalDate dateOfBirth, String passportNumber, String gender, Invoice[] amountOfInvoices, int federalLand) {
        super(firstName, lastName, dateOfBirth, passportNumber, gender, amountOfInvoices);
        FederalLand = federalLand;
    }

    UserOfGermanBank newUser3 = new UserOfGermanBank("name", "surname", new LocalDate(2025, 1, 1), "0000000000000000", "female", 100, 1);
}

