package TeachMeSkills;
import java.time.LocalDate;

public class Bank {

    private String country;
    private int bankCode;
    private String currency;
    private LocalDate endOfLicence;
    private double minSum;
    private final User[] numberOfUsers = new User[100];

    public Bank(String country, int bankCode, String currency, LocalDate endOfLicence, double minSum) {
        this.country = country;
        this.bankCode = bankCode;
        this.currency = currency;
        this.endOfLicence = endOfLicence;
        this.minSum = minSum;
    }
    // TODO нужно ли добавлять в конструктор User [] если я задаю ему значение [100]

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public int getBankCode() {
        return bankCode;
    }
    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getEndOfLicence() {
        return endOfLicence;
    }
    public void setEndOfLicence(LocalDate endOfLicence) {
        this.endOfLicence = endOfLicence;
    }

    public double getMinSum() {
        return minSum;
    }
    public void setMinSum(double minSum) { this.minSum = minSum;
    }

}

