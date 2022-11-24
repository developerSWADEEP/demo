import java.util.*;

						//switch cant have long, float , double
						//it can have int , byte , short , string

public class SwitchDemo6 
{

	public static void main(String[] args) 
	{
		String game;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your favourite game?");
		game = sc.nextLine();
		switch(game) 
		{
		case "hockey":
			System.out.println("Hockey is the national game of India");
			break;
		case "cricket":
			System.out.println("Cricket is the national game of England");
			break;
		case "chess":
			System.out.println("Chess is the national game of Russia");
			break;
		case "football":
			System.out.println("Football is the national game of Spain");
			break;
		case "volleyball":
			System.out.println("Volleyball is the national game of Nepal");
			break;
		default:
			System.out.println("Your game is not matched");
			break;
		}
	}
}
