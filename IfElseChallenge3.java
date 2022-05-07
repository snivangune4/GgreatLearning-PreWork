public class IfElseChallenge3{
	public static void main(String[] args){
		int num1, num2;
		num1=3;
		num2=4;
		
		System.out.println("Inital vaule of numbers is");
		System.out.println("num1-> "+num1);
		System.out.println("num2-> "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1= num1-num2;
		
		System.out.println("Interchanged vaule of numbers is");
		System.out.println("num1-> "+num1);
		System.out.println("num2-> "+num2);
	}
}