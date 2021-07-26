package Assignment02;

public class solution03 {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		double balance=1000;
		double credit=250;
		int deposit=400;
		System.out.println(getTotalCash(balance, credit));
		System.out.println(getTotalCash(balance, deposit));
	}
	
	public static double getTotalCash(double balance,int deposit) {
		System.out.print("In savings account : ");
		return balance+deposit;
	}
	
	public static double getTotalCash(double balance,double credit) {
		System.out.print("In current account : ");
		return balance+credit;
	}
	
}