import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	Scanner scan = new Scanner(System.in);
	
	public static int MAXGUESSALLOWED = 6; 
	
	public int answer, differential, maximum, numGuessesTaken, theirGuess; 
	Random rand = new Random(); 
	boolean isGameOver = false; 
	
	
	public void newGame(int maximum) {
		answer = (rand.nextInt((maximum - 0) +1) + 0);
		isGameOver = false;
		differential = maximum; 
		numGuessesTaken = 0; 
	}
	
	public void Guess(int maximum) {
			for(int i = 0; i < MAXGUESSALLOWED; i++) {
				if(isGameOver != true) {
					System.out.printf("Enter your guess (0 - %d) ", maximum);
					theirGuess = scan.nextInt();
					
						if(theirGuess > maximum) {
							System.out.println("Guess is out of range, try again");
						}
						else if(theirGuess > answer) {
							System.out.println("Too High");
						}
						else if(theirGuess < answer) {
							System.out.println("Too Low");
						}
						else if(theirGuess == answer) {
							System.out.println("Correct!");
							System.out.println("Congratulations!");
							isGameOver = true;
						}
					}

		}
	}
	


	
	

}
