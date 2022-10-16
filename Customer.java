public class Customer {

    private int money = 500;
    private String name;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String customerName) {
        this.name = customerName;
    }

    public void payBill() {
        money -=25;
    }

    public void signInsurance() {
        money -=250;
        System.out.println(":::Charged 250!!!");
    }

}
