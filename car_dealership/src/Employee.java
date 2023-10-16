public class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public void handelCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if(finance){
            double loanAmount = vehicle.getPrice()-cust.getCash();
            runCreditHistory(cust, loanAmount);
        }else if(vehicle.getPrice()<=cust.getCash()){
            processTransaction(cust, vehicle);
        }else{
            System.out.println("Need more money(");
        }
    }
    public void processTransaction(Customer cust, Vehicle vehicle){
        cust.buyCar(vehicle);
        System.out.println(cust.getName()+" just bought a vehicle "+vehicle.getModel());

    }
    public void runCreditHistory(Customer cust, double loanAmount){
        System.out.println("Run credit history for "+cust.getName()+"...");
        System.out.println(cust.getName()+" has been approved to purchase the vehicle");
    }
}
