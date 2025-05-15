public class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();

        bike.setNumberOfWheels(2);
        bike.setColor("red");
        int bikeWheels = bike.getNumberofWheels();
        String bikeColor = bike.getColor();

        car.setNumberOfWheels(4);
        car.setColor("black");

        int carwheels = car.getNumberofWheels();
        String carColor = car.getColor();

        System.out.println("Bike object - Wheels: " + bikeWheels + ", color: " + bikeColor);
        System.out.println("Bike object - Wheels: " + carwheels + ", color: " + carColor);

    }
}
