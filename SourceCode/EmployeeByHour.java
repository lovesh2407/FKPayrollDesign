public class EmployeeByHour extends Employee{
	int hourlyRate;
	int toBePaid;

	EmployeeByHour(int id, String name, String address, int account, Member member){
		super(id, name, address, account, member);
	}

	public void updateRate(int rate){
		hourlyRate = rate;
	}

	public void addTimeCard(int hoursWorked){
		if(hoursWorked > 8){
			toBePaid += hoursWorked*hourlyRate*1.5;
		}
		else{
			toBePaid += hoursWorked*hourlyRate;
		}

		System.out.println("time card of " + hoursWorked + " hours of work today added");
	}


	public void pay(ModeOfPayment mode){
		System.out.println("Employee " + employeeId + " is paid amount" + (toBePaid - union_member.unionPay(1)));
		toBePaid = 0;
	}
}