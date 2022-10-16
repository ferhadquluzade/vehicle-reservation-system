import java.util.Scanner;

public class RentalOffice {
    private Request request;
    private String license;
    private String vehicleType;
    private int leftVehicle=0;

    public int getLeftVehicle() {
        return leftVehicle;
    }

    public void setLeftVehicle(int leftVehicle) {
        this.leftVehicle = leftVehicle;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private Customer customer;

    public RentalOffice(String license, String vehicleType, Customer customer) {
        this.license = license;
        this.vehicleType = vehicleType;
        this.customer = customer;

        if (inStock(license)) {
            customer.payBill();
            System.out.println("Want insurance?(yes/no):::");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            if (answer.charAt(0) == "y".charAt(0)) {
                customer.signInsurance();
            }
            else{
                System.out.println("okay...");}
            System.out.println(":::Reservation Done!!!"+"\n"+Request.getDate());
            System.out.println("Left:::"+leftVehicle);
        } else {
            System.out.println(":::Reservation Cancelled!!!"+"\n"+Request.getDate());
        }
        System.out.println("Account:::"+String.valueOf(customer.getMoney()));
    }



    public boolean checkVechicleAvailablty() {
        return false;
    }

    public void reservation() {

    }

    public void cancelRes() {

    }

    public void signRentalContract() {

    }

    public void signAssociationInsurance() {

    }

    public String checkLicense() {
        return this.license;
    }

    public boolean inStock(String license) {
        int leftOver = 0;
        switch (license) {
            case "car":
                Vehicle.setCarStock();
                leftOver = Vehicle.getCarStock();
                break;
            case "van":
                Vehicle.setVanStock();
                leftOver = Vehicle.getVanStock();
                break;
            case "truck":
                Vehicle.setTruckStock();
                leftOver = Vehicle.getTruckStock();
                break;
        }
        leftVehicle=leftOver;
        return leftOver <= 0 ? false : true;
    }
}


