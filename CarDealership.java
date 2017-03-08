public class CarDealership{
    // fields
    private String name;
    private Car car1, car2, car3;
    
    // constructors
    public CarDealership(){
        name = "generic";
        car1 = new Car();
        car2 = new Car();
        car3 = new Car();
    }
    
    public CarDealership(String name, Car car1, Car car2, Car car3){
        this.name = "generic";
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
    }
    
    // methods
    public String getName(){
        return name;
    }
    public Car sellCar1(){
        Car temp1 = car1;
        car1 = null;
        return temp1;
    }
    public void replaceCar1(Car newCar){
        car1 = newCar;
    }
    public void discountAllCars(double discount){
        car1.setPrice(car1.getPrice() - discount);
        car2.setPrice(car2.getPrice() - discount);
        car3.setPrice(car3.getPrice() - discount);
    }
    public void printInventory(){
        car1.printReport();
        car2.printReport();
        car3.printReport();
    }
}