package exceptionPackage;

public class ExceptionClass {
	static String str;
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int c;
		try
		{
		
			 c =a/b;
			 System.out.println(c);
			 System.out.println(str.charAt(a));
			 System.out.println("try enddd");
		}
		catch(ArithmeticException e)
		{ b=1;
		   try
		   {
			   c=a/b;
		   }
		   catch(ArithmeticException e1) {
				System.out.println("enterd value of b");
   
		   }
		}
		catch(NullPointerException e)
		{ 
			System.out.println("hiiiiii");
		}
		//System.out.println(c);
		System.out.println("enddddd");
	}

}
