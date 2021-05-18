package TeachMeSkills;
import java.time.LocalDate;

public class Invoice {

    public static String numberOfInvoice;
    public static double sumOfInvoice;
    public static LocalDate endOfInvoice;

    public Invoice(String numberOfInvoice, double sumOfInvoice, LocalDate endOfInvoice) {
        this.numberOfInvoice = numberOfInvoice;
        this.sumOfInvoice = sumOfInvoice;
        this.endOfInvoice = endOfInvoice;
    }

    Invoice bill = new Invoice("default", 1, new LocalDate(2025, 1, 1));

    public String getNumberOfInvoice() {
        return numberOfInvoice;
    }

    public void setNumberOfInvoice(String numberOfInvoice) {
        boolean result = numberOfInvoice.matches("^[a-zA-Z0-9]+$");
        if (result) {
            this.numberOfInvoice = numberOfInvoice;
        } else {
            System.out.println("Please enter a correct invoice number");
        }
    }

    public double getSumOfInvoice() {
        return sumOfInvoice;
    }
    public void setSumOfInvoice(double sumOfInvoice) {
        this.sumOfInvoice = sumOfInvoice;
    }


    public LocalDate getEndOfInvoice() {
        return endOfInvoice;
    }
    public void setEndOfInvoice(LocalDate endOfInvoice) {
        this.endOfInvoice = endOfInvoice;
    }

}




