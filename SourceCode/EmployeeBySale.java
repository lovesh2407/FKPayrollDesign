public class EmployeeBySale extends Employee{
	int commissionRate;
	int toBePaid;

	EmployeeBySale(int id, String name, String address, int account, Member member){
		super(id, name, address, account, member);
	}

	public void updateCommission(int newRate){
		commissionRate = newRate;
	}

	public void addSales(int amount){
		toBePaid += amount * commissionRate;
	}

	public void pay(ModeOfPayment mode){
		System.out.println("Employee " + employeeId + " is paid amount" + (toBePaid - union_member.unionPay(1)));
		toBePaid =0;
	}
}