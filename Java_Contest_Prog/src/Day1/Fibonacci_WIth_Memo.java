package Day1;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci_WIth_Memo {
	//storing value 
	private static Map<Integer,Integer>cache=new HashMap<>();
			public static void main(String[] args) {
				int pos = 3;
				
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
				
				if(cache.containsKey(pos))
				{
					return cache.get(pos);
				}
				int result =   Fib(pos-1)+Fib(pos-2);
				cache.put(pos,result);
				return result;
			}
	}


