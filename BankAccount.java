import java.util.Scanner;

public class BankAccount {
    static int noOfAccounts=0;
	String name;
	String address;
	String typeOfAccount;
	int balanceInAccount;
	static int noOfTransactions;
    String AccountNumber;
    
    public String generateAccountNumber(){
        String accountNumber = "BA";
		accountNumber += (1000+noOfAccounts);
		noOfAccounts++;
		System.out.println("Your account number is "+accountNumber);
        return accountNumber;
	}
	public BankAccount(){

	}

	public void createBankAccount(String name, String address, String typeOfAccount, int balanceInAccount
			) {
				AccountNumber=   generateAccountNumber();
				
		this.name = name;
		this.address = address;
		this.typeOfAccount = typeOfAccount;
		this.balanceInAccount = balanceInAccount;
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of depositor: ");
			int noOfDepositor= sc.nextInt();
			for(int i =0;i<noOfDepositor;i++){
				System.out.println("Enter name of depositor: ");
				String name = sc.next();

			System.out.println("Enter address of depositors");
			String address = sc.next();
			System.out.println("Enter typeOfAccount");
			String typeOfAccount = sc.next();
			System.out.println("Enter balanceInAccount");
			int balanceInAccount = sc.nextInt();

			BankAccount ba = new BankAccount();
			ba.createBankAccount(name, address, typeOfAccount, balanceInAccount);
			ba.deposit(100);
			ba.checkBalance();
			ba.withdraw(200);
			ba.balance();
			ba.updateAddress("itahari");

			System.out.println(name + " " + address + " " + typeOfAccount + " " );

			}
			System.out.println("total transactions is: "+noOfTransactions);

			sc.close();
		
	}

	public void deposit(int amount) {
		balanceInAccount = balanceInAccount + amount;
		System.out.println("Deposit ammount:" + amount);
		noOfTransactions++;
	}

	public void checkBalance() {
		System.out.println("balanceInAccount is:" + balanceInAccount);

	}

	public void withdraw(int amount) {
		if (balanceInAccount < amount) {
			System.out.println("Insufficient balance");
		} else {
			balanceInAccount = balanceInAccount - amount;
			System.out.println("withdraw amount is:" + amount);
			noOfTransactions++;
		}
		

	}

	public void balance() {
		System.out.println("Balance is:" + balanceInAccount);
	}

	public void updateAddress(String address) {
		this.address = address;
	}
}