import java.util.Scanner;

class Challenge2{
		
	public int performAddition(int num1, int num2){
		int result = num1+num2;
		return result;
	}
	
	public static void main(String [] args){
		
		
		Challenge2 main = new Challenge2();
		int num1,num2,result;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the numbers to add");
		 num1 = in.nextInt();
		 num2 = in.nextInt();
		
		result = main.performAddition(num1,num2);
		System.out.println(result);
	}
}
