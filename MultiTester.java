/**
 * Multitester
 * 
 * @Omar (your name) 
 * @1.0 (a version number or a date)
 */
public class MultiTester{
public static void main(String[] args){
    //part 1
System.out.println("Generating bank accounts...");
BankAccount b1 = new BankAccount("Omar Ahmad", 45.00);
BankAccount b2 = new BankAccount("John Doe");
BankAccount b3 = new BankAccount();

    //part 2
b1.printInfo();
b1.deposit(150.0);
b1.printInfo();
b1.withdraw(75.0);
b1.printInfo();
System.out.println("");

b2.printInfo();
b2.deposit(150.0);
b2.printInfo();
b2.withdraw(75.0);
b2.printInfo();
System.out.println("");

b3.printInfo();
b3.deposit(150.0);
b3.printInfo();
b3.withdraw(75.0);
b3.printInfo();
System.out.println("");
    //part 3
Employee e1 = new Employee("Omar", "Ahmad", 17, "Student", 0.0);
System.out.println("Generating employee...");

    //part 4
e1.printPersonnelReport();
System.out.println("Assigning new Position...");
e1.changePosition("Underwater basketweaver", 130000.00);
e1.printPersonnelReport();
System.out.println("");

System.out.println("Giving myself a fat raise...");
e1.giveRaise(10000.00);
e1.printPersonnelReport();
System.out.println("");

System.out.println("Acquiring ID...");
e1.setID("2693302");
e1.printPersonnelReport();
System.out.println("");

System.out.println("aging...");
e1.increaseAge();
e1.printPersonnelReport();
System.out.println("");

System.out.println("firing myself...");
e1.fire();
e1.printPersonnelReport();
}
}