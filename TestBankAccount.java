public class TestBankAccount
{	
	//main method
	public static void main(String[] args)
	{
			BankAccount b1 = new BankAccount("Grace Hooper", 99.0);
			b1.printInfo();
			b1.deposit(100);
			b1.printInfo();
	}
}