import java.util.Scanner;

public class SwitchCaseChallenge3{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1 = in.nextInt();
		System.out.println("\nPlease enter the first number");
		int num2 = in.nextInt();
		System.out.println("\nPlease enter the opeartion ID from the following \n");
		System.out.println("1->Addition");
		System.out.println("2->Subtraction");
		System.out.println("3->Multiplication");
		System.out.println("4->Division");
		int operationId = in.nextInt();
		switch(operationId){
			case 1:
				System.out.println(num1+num2);
			break;
			case 2:
				System.out.println(num1-num2);
				break;
			case 3:
				System.out.println(num1*num2);
				break;
			case 4:
				if(num2 != 0){
					System.out.println(num1/num2);
				}
				else{
					System.out.println("Cannot be divided");
				}
				break;
			default:
				System.out.println("Please enter correct opeartion ID");
		}
	}
}