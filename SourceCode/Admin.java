import java.sql.*; 


public class Admin{

	private static final String url = "jdbc:postgresql://localhost/flipkart";
	private static final String user = "lucky";
	private static final String password = "123";

	public static void main(String[] args){
		try{
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("hbv");
			Statement stmt=conn.createStatement();  
			conn.close();
		}
		catch(Exception e){ System.out.println(e); }
	}
}