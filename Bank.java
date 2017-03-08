public class Bank
{


//fields
private boolean isOpen;
private BankAccount account1;
private BankAccount account2;
private BankAccount account3;


//constructors


public Bank()
{	
	isOpen = true;
	account1 = new BankAccount("tim barron", 300.0);
	account2 = new BankAccount();
	account3 = new BankAccount("joe bradley", 100.0);
}


//assumes three BankAccounts already made
public Bank(BankAccount b1, BankAccount b2, BankAccount b3)
{
	isOpen = true;
	account1 = b1; 




}
//must make objects
public Bank(double startingAmountForAllAccounts)
{
isOpen = true;






}


//include one more constructor of your choice
public double calcTotalFunds(){
    return totalFunds();
}

}