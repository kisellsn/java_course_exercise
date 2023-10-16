import java.util.Arrays;

public class Customer {
    private String name;
    private String address;
    private double cash;
    private Vehicle ownedCars[] = new Vehicle[10];
    private int countCars = 0;

    public Customer(String name, String address, double cash) {
        this.name = name;
        this.address = address;
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public Vehicle[] getOwnedCars() {
        return ownedCars;
    }

    public void buyCar(Vehicle newCar) {
        setCash(getCash()-newCar.getPrice());
        this.ownedCars[countCars]=newCar;
        countCars+=1;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cash=" + cash +
                ", ownedCars=" + Arrays.toString(ownedCars) +
                ", countCars=" + countCars +
                '}';
    }

    public void purchesCar(Vehicle vehicle, Employee employee, boolean finance){
        employee.handelCustomer(this, finance, vehicle);

    }
}
