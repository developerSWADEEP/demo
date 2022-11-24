import java.util.*;

						//1) Switch Case example 3.
						//2) case can have a body.
						//3) default can be in between with break keyword.
						//4) if case has no body then all the statement before break keyword
						//in that case, are the statements of that case.

public class SwitchDemo4 
{

	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		i=sc.nextInt();
		switch (i) 
		{
		case 10: 
		{
			System.out.println("khamma Ghani");
			break;
		}
		default:
			System.out.println("NICE to meet you");
			break;
		case 20:
			System.out.println("RAADHE RAADHE");
			System.out.println("How are you?");
			System.out.println("Have a drink?");
			break;
		case 100:
			System.out.println("Hello how are you?");
			break;		
		}
		
		System.out.println("Out of switch block");
		
	}

}
