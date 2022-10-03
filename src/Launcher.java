import java.util.Scanner;

class Guesser
{
	int guessedNum;
	
	public int GuessNumber() 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guesser enter your number of guessing :");
		guessedNum = scan.nextInt();
		
		return guessedNum;
	}
}


class Player
{
	
	int playerGuessedNum;
	
	public int PlayerGuessNum() 
	{
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Player enter your Number of guessing :");
		playerGuessedNum = scan.nextInt();
		
		return playerGuessedNum;
	}
	
}



class Umpire
{
	int numFromGuesser;
	int numFromPlayer1,numFromPlayer2,numFromPlayer3;
	
	//collect number from the guesser
	void getNumFromGuesser()
	{
		Guesser guesser = new Guesser();
		numFromGuesser = guesser.GuessNumber();
		
	}
	
	
	//collect numbers from players
	void getNumFromPlayers() 
	{
		Player one = new Player();
		Player two = new Player();
		Player three = new Player();
		
		numFromPlayer1 = one.PlayerGuessNum();
		numFromPlayer2 = two.PlayerGuessNum();
		numFromPlayer3 = three.PlayerGuessNum();	
	}
	
	//comparing the numbers and decide the winner
	void decideWinner() 
	{
		if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) 
		{
			System.out.println("Game tied as all guessed the same number.");
		}
		else if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Game tied between Players 1 & 2!");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied between Players 1 & 3!");
			}
			else
			{
				System.out.println("Player 1 won the game!");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer1)
			{
				System.out.println("Game tied between Players 1 & 2");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied between Players 2 & 3");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			if(numFromGuesser==numFromPlayer1)
			{
				System.out.println("Game tied between Players 1 & 3");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Game tied between Players 2 & 3");
			}	
			else
			{
				System.out.println("Player 3 won the game");
			}
		}
		else
		{				
			System.out.println("Game Lost! Try again..");
		}
		}	
	}
	


public class Launcher 
{

	public static void main(String[] args) 
	{
		Umpire umpire = new Umpire();
		umpire.getNumFromGuesser();
		umpire.getNumFromPlayers();
		umpire.decideWinner();

	}

}
