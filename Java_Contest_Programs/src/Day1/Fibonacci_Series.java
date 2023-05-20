//Fibonacci Series Using Recursion
package Day1;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int pos = 8;
		
		int result=0;
		
		result = Fib(pos);
		System.out.println("Ans is "+result);	
	}
	
	public static int Fib(int pos)
	{
		if(pos==0)
		{
			return 0;
		}
		if(pos==1)
		{
			return 1;
		}
		return  Fib(pos-1)+Fib(pos-2);
	}

}
