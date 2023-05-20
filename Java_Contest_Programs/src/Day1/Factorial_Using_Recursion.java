//factorial using recursion
package Day1;

public class Factorial_Using_Recursion {

	public static void main(String[] args) {
		int num=5;
		
		int result;
		
		result = fact(num);
		
		
		System.out.println("Result is "+result);
	}
	
	public static int fact(int num)
	 {
		 if(num==1)
		 {
			 return 1;
		 }
		return num*fact(num-1);
		
	 }

}


