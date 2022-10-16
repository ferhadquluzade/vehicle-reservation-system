import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Request {
    private static LocalDateTime date;

    public Request(String customerName, String license, String vehicleType) {
        this.date = LocalDateTime.now();
        Customer customer = new Customer(customerName);
        RentalOffice renOffice = new RentalOffice(license, vehicleType, customer);
    }

    public static String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        return dtf.format(date);
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}









