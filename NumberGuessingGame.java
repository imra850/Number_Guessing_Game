import java.util.Scanner;
public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int attempt=1;
		int numberOfGuess=0,score=0;
		int realNumber=(int)(Math.random()*99+1);
		System.out.println("***************************************");
		System.out.println("Welcome to Number Guessing Name");
		System.out.println("***************************************");
		System.out.println("Guess a number between  1 to 100");
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			if(sc.hasNextInt())
			{
				numberOfGuess=sc.nextInt();
				if(numberOfGuess==realNumber)
				{
					score=score+10;
					System.out.println("Congratulation you won the game");
					System.out.println("Your Score is"+" "+score );
					System.out.println("You Guess it in"+" "+attempt+" "+"attempts");
					break;
				}
				else if(numberOfGuess<realNumber)
				{
					System.out.println("Your Guess is too small");
					System.out.println("************keep trying************");
					System.out.println("Attempts remaining="+(10-attempt));
				}
				if(attempt==10)
				{
					System.out.println("You have Exceeded the Maximun number of attempts");
					System.out.println("Better Luck next time");
					break;
				}
				attempt++;
			}
			else
			{
				System.out.println("Enter a valid number");
			}
		}
	}

}
