package exceptionPackage;

public class ExceptionClass1 {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int c;
		try
		{
			c=a/b;
			System.out.println("try enddd");
		}
		catch(Exception e)
		{
			System.err.println(e.getStackTrace());
			System.err.println(e.getMessage());
			System.out.println(e.toString());
		}
		
	}

}
