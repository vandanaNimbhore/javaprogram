package inheritanceCincept;

public abstract class AbstractClass {   //incomplete class
	static int a=10;
	public abstract void add();  //incomplete method 
	public abstract void add1();
	
	public static void add2()
	{
		System.out.println("hiiii");  // static metoh
	}
	public void add3()      //complete static method
	{
		System.out.println("hello");
	}
	
	public static void main(String [] args)
	{
		 
		//AbstractClass obj=new  AbstractClass(); //not create object bcoz incompete
		    System.out.println(a);                                  //or abstract class.
		
	}

}
