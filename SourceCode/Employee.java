enum ModeOfPayment{
	MAIL, HOLD, DEPOSIT;
}

public class Employee{
	String name;
	int employeeId;
	String postalAddress;
	String bankAccount; //// could  be another class
	Member union_member;

	ModeOfPayment mode;   

	Employee(int id, String name, String address, String account, Member member){
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

	public String getBankAccount(){
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


}