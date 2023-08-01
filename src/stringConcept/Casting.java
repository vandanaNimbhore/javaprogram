package stringConcept;

public class Casting {
	public static void main(String[] args) {
		// implicite casting:
		byte b=78;
		short s=b;
		System.out.println("byte to short: "+s);
		
		short s1=120;
		int a=s1;
		System.out.println("short to int: "+a);
		
		int s2=34;
		long l=s2;
		System.out.println("int to long: "+l);
		float f=s2;
		System.out.println("int to float :"+f);
		
		float s3=78.56f;
		double d=s3;
		System.out.println("float to double :"+d);
		//int i=s3; int to float conversion not allow
		
		long l1=686;
		double dd=l1;
		System.out.println("long to double :"+dd);
		System.out.println(".......explicit........");
		//explicit casting
		double a1=56.78d;
		float b1=(float)a1;
		System.out.println("double to float :"+b1);
		
		long a2 =7487;
		int b2=(int)a2;
		System.out.println("long to int :"+b2);
		
		int a3=7686;
		short b3=(short)a3;
		System.out.println("int to short:"+b3);
		
		short h=129;
		byte j=(byte)h;
		System.out.println(j);
		

		
		
		
		
		 
		
		
	}

}
