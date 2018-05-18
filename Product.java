import java.util.Arrays;
import java.util.Scanner;

public class Product {
	
	private static String[] productName = new String[2];
	private static int[] quantity = new int[2];
	private static double[] unitPrice = new double[2];
	private static double[] total = new double[2];
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Enter info for Product " + (i+1));
			System.out.print("Product Name: ");
			productName[i] = scan.next();
			System.out.print("Quantity: ");
			quantity[i] = scan.nextInt();
			System.out.print("Unit Price: ");
			unitPrice[i] = scan.nextDouble();
			total[i] = quantity[i]*unitPrice[i];
		}
		
		
		System.out.println("--------------------------------------------------------------");
		System.out.printf("|%-10s| %10s| %10s| %10s|\n", "Product", "Qty", "Price", "Total");
		for(int i = 0; i < 2; i++) {
			String upperCase = productName[i].substring(0, 1).toUpperCase() + productName[i].substring(1).toLowerCase();
			System.out.printf("|%-10s| %10s| %10.2f| %10.2f|\n", upperCase, quantity[i], unitPrice[i], total[i]);
		}
		
		System.out.println("--------------------------------------------------------------");
		
	}

}
