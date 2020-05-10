public class Member{
	int weeklyDueRate;
	int serviceCharge;

	Member(int rate, int charge){
		weeklyDueRate = rate;
		serviceCharge = charge;
	}

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

	public static Member membeship(){
		System.out.println("Is the employee member of the union YES/NO?");
		String ans = sc.nextLine();

		if (ans == "NO"){
			return null;
		}

		System.out.println("Weekly Due Rate in Rupees?");
		int rate = sc.nextInt();	

		System.out.println("Any service charge to start with?");
		int charge = sc.nextInt();

		return Member(rate, charge);
	}
}