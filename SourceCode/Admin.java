import java.sql.*; 
import java.util.Scanner;


public class Admin{

	private static final String url = "jdbc:postgresql://localhost/flipkart";
	private static final String user = "lucky";
	private static final String password = "123";
	private static Connection conn;

	public static void main(String[] args){
		try{
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("hbv");
			Statement stmt=conn.createStatement();  
			conn.close();
		}
		catch(Exception e){ System.out.println(e); }


		System.out.println("Hello Sir, what's order for me, please chhose from following");
		System.out.println("1 add an employee");

		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a == 1){
			Employee.addEmployee();
		}

	}
}