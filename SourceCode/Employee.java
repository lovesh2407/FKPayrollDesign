import java.sql.*; 


enum ModeOfPayment{
	MAIL, HOLD, DEPOSIT;
}

public class Employee{
	String name;
	int employeeId;
	String postalAddress;
	int bankAccount; //// could  be another class
	Member union_member;

	ModeOfPayment mode;   

	public static idCount = 0;

	Employee(int id, String name, String address, int account, Member member){
		employeeId = id;
		this.name = name;
		postalAddress = address;
		bankAccount = account;
		union_member = member;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return employeeId;
	}

	public String getPostal(){
		return postalAddress;
	}

	public void changePostal(String address){
		postalAddress = address;
	}

	public int getBankAccount(){
		return bankAccount;
	}

	public void changeAccount(String account){
		bankAccount = account;
	}

	public void revoke_membership(){
		union_member = null;
	}

	public void updateDueRate(int rate){
		union_member.changeDueRate(rate);
	}

	public  void addServiceCharge(int charge){
		union_member.chargeService(charge);
	}

	public static void addEmployee(Connection conn){
		Scanner sc= new Scanner(System.in);
		System.out.println("please Enter Details");
		System.out.println("Name?");

		String name = sc.nextLine();

		System.out.println("Postal Address?");
		String address = sc.nextLine();

		System.out.println("Bank Account Number?");
		int account = sc.nextInt();

		Member member = Member.membership();

		System.out.println("please Enter Details");

	}

}