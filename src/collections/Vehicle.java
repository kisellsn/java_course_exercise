package collections;

public class Vehicle implements Comparable<Vehicle>{
    private String model;
    private double price;

    public String getModel() {
        return model;
    }

    @Override
    public int compareTo(Vehicle o) {
        if(this.price<o.price){
            return 1;
        }else if(this.price>o.price){
            return -1;
        }
        return 0;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicle(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
