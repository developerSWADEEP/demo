import java.util.*;
							//after case only constant are allowed
							//if we use a variable, then it must be a final variable
							//for eg:- final int var = 10
public class SwitchDemo5 
{

	public static void main(String[] args) 
	{

		int i;
		final int var = 10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		i=sc.nextInt();
		switch (i)
		{
		case var: 
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
