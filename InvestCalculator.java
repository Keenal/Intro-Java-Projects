import java.util.Scanner;

public class InvestCalculator {
	
	private static int quarters = 0;
	private static double balance, rate, interest, total, rateInt = 0.0;
	private static String checkInfo;
	private static boolean isCorrect = false;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(isCorrect == false) {
			System.out.println("Enter the number of quarters from 1 to 10");
			quarters = scan.nextInt();
			while(quarters < 1 || quarters > 10) {
				System.out.println("Your number wasn't between 1 and 10, try again");
				quarters = scan.nextInt();
			}
			
			System.out.println("Enter the beginning principal balance greater than 0");
			balance = scan.nextDouble();
			while(balance < 0) {
				System.out.println("Your balance wasn't greater than 0, try again");
				balance = scan.nextDouble();
			}
			
			System.out.println("Enter the interest rate percentage from 0 to 20");
			rate = scan.nextDouble();
			while(rate < 0 || rate > 20) {
				System.out.println("Your rate wasn't between 0 and 20, try again");
				rate = scan.nextDouble();
			}
			
			System.out.printf("You entered a principal balance of $" + balance + " for " + quarters + " quarters at " + rate + " interest\n");
			System.out.println("Is this correct? (y/n)");
			checkInfo = scan.next();
			
			
			if(checkInfo.equalsIgnoreCase("y")) {
				isCorrect = true;
			} else {
				isCorrect = false;
			}
		}
		
		calculateBalance();
	}
	
	public static void calculateBalance() {
		System.out.printf("%-10s %10s %10s %10s\n", "Quarter#", "Balance", "Interest", "Total");
		for(int i = 1; i <= quarters; i++) {
			rateInt = rate/100;
			interest = (balance * rateInt * 0.25);
			total = balance + interest;
			System.out.printf("%-10d %10.2f %10.2f %10.2f\n", i, balance, interest, total);
			balance = total;
		}
	}

}
