public class Vehicle {
    private static int carStock = 25;
    private static int vanStock = 25;
    public static int truckStock = 25;


    public static int getCarStock() {
        return carStock;
    }

    public static void setCarStock() {
        Vehicle.carStock -=1;
    }

    public static void setVanStock() {

        Vehicle.vanStock -=1;
    }

    public static void setTruckStock() {
        Vehicle.truckStock -=1;
    }

    public static int getVanStock() {
        return vanStock;
    }

    public static int getTruckStock() {
        return truckStock;
    }

}
