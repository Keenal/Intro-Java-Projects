/*
 * By Keenal Shah
 * Guessing Game
 * Try to guess a number within 6 tries!
 */
import java.util.Scanner;

public class GuessingGameTester {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max;
		String ans = "Y";
		
		System.out.println("Welcome to Keenal's Guessing Game!");
		System.out.println("Enter the maximum number to guess from.");
		max = scan.nextInt();
		
		System.out.println("You get 6 tries, go!");
		
		GuessingGame gg = new GuessingGame();
		gg.newGame(max);
		gg.Guess(max);
		while(ans.contains("Y") || ans.contains("y")) {
			System.out.println("Would you like to play again? Y or N?");
			ans = scan.next();
			if(ans.contains("Y") || ans.contains("y")) {
				System.out.println("Welcome to Keenal's Guessing Game!");
				System.out.println("Enter the maximum number to guess from.");
				max = scan.nextInt();
				gg.newGame(max);
				gg.Guess(max);
			}
			if(ans.contains("n") || ans.contains("n")) {
				System.out.println("Thanks for playing Keenal's guessing game.");
				ans = "n";
			}
		}
		scan.close();
	}
	
	
	
	

}
