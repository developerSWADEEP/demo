import java.util.Scanner;
								//Switch Case example 3
								//case can have a body
								//default can be in between with break keyword
public class SwitchDemo3 
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
			break;
		case 100:
			System.out.println("Hello how are you?");
			break;		
		}
		System.out.println("Out of switch block");
	}
	}
