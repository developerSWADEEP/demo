import java.util.Scanner;
								//switch case example 1
public class SwitchDemo1 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		i = sc.nextInt();
		switch(i)
		{
		case 10:
			System.out.println("Khamma Ghani");
			break;
		case 20:
			System.out.println("Raadhe Raadhe");
			break;
		case 30:
			System.out.println("NAMASHKAR");
			break;
		default:
			System.out.println("Nice to meet you");
			break;
		}
		System.out.println("out of switch block");
		System.out.println("BYE BYE!");
		System.out.println("hello");
	}
}
