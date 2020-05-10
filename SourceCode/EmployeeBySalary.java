public class EmployeeBySalary extends Employee{
	int salary;

	EmployeeBySalary(int id, String name, String address, int account, Member member){
		super(id, name, address, account, member);
	}

	public void updateSalary(int newSalary){
		salary = newSalary;
	}

	public void pay(ModeOfPayment mode){
		System.out.println("Employee " + employeeId + " is paid amount " + (salary - union_member.unionPay(1)));
	}
}