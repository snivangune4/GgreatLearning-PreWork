import java.util.Scanner;

public class SwitchChallenge1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=in.nextInt();
		switch(num){
			case 1:
			System.out.println("neither prime nor composite");
			break;
			case 2:
			System.out.println("no is prime");
			break;
			case 3:
			System.out.println("no is composite");
			break;
		}
	}
}