public class Member{
	int weeklyDueRate;
	int serviceCharge;

	public void chargeService(int charge){
		serviceCharge += charge;
	}

	public void changeDueRate(int rate){
		weeklyDueRate = rate;
	} 

	public int unionPay(int weeks){
		int amount = weeks * weeklyDueRate + serviceCharge;
		serviceCharge = 0;
		return amount;
	}
}