package TeachMeSkills;

import java.time.LocalDate;
import java.util.Date;

public class UserOfChinaBank extends User {

    private String provinceName;

    public UserOfChinaBank(String firstName, String lastName, LocalDate dateOfBirth, String passportNumber, String gender, Invoice[] amountOfInvoices, String provinceName) {
        super(firstName, lastName, dateOfBirth, passportNumber, gender, amountOfInvoices);
        this.provinceName = provinceName;
    }

    UserOfChinaBank newUser2 = new UserOfChinaBank("name", "surname", new LocalDate(2025, 1, 1), "0000000000000000", "female", 100, 1);
}

