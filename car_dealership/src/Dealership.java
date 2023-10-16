
public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom", "123 Anything St.", 10000);
        Vehicle vehicle1 = new Vehicle("type1", "model1", "green", 7800);
        Employee emp1 = new Employee("Rob");

        System.out.println(cust1.toString());
        cust1.purchesCar(vehicle1, emp1, false);
        System.out.println(cust1.toString());
        cust1.purchesCar(vehicle1, emp1, true);
        cust1.purchesCar(vehicle1, emp1, false);

    }
}