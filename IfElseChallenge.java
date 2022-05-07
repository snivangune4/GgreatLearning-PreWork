import java.util.Scanner;

public class IfElseChallenge{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter a number");
		int num1=in.nextInt();
		
		if(num1 % 2 == 0){
			System.out.println("Number is even");
		}
		else{
			System.out.println("Number is odd");
		}
	}
}
			
		
