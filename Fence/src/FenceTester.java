import java.util.Scanner;

public class FenceTester {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int height, width = 0;

		System.out.print("Enter height in range [2, 5]: ");

		height = scan.nextInt();

		if (height > 5 || height < 2) {
			System.out.print("Enter the height between 2 and 5: ");
			height = scan.nextInt();
		}

		System.out.printf("Enter width in range [%d, 24]: ", height);

		width = scan.nextInt();

		if (width > 24 || width < height) {
			System.out.printf("Enter the width between %d and 24: ", height);
			width = scan.nextInt();
		}

		Fence fence = new Fence();
		fence.getHeightWidth(height, width);
		
		
		

	}

}
