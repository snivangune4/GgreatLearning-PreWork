import java.util.Scanner;

public class IfElseChallenge2{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter the year");
		int year=in.nextInt();
		
		if(year%400 == 0){
			System.out.println("It is a leap year");
		}
		else if(year%100==0 ){
			System.out.println("It is not a leap year");
		}
		else if(year%4==0){
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("It is not a leap year");
		}
	}
}