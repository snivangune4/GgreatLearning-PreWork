public class WhileLoopChallenge2{
	public static void main(String[] arg){
		
		// Outer loop to count no. of rows
		for(int i=1;i<=5;i++){
			int j=1;
			
			//inner loop to count no. of *
			while(j<=i){
				  System.out.print("*");
				  j++;
			  }
			  System.out.println();
		}
	}
}