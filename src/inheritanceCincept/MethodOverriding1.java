 package inheritanceCincept;

public class MethodOverriding1 extends MethodOverriding  //sub
  {
	public  void add(int a,int b)
	{
		
		int c=a+b;
		System.out.println(c);
		System.out.println("hi sub");
   
   }
	public static void add1()
	{
		System.out.println("nnnjj");
	}
	public static void main(String[] args)
	{
		MethodOverriding1 obj=new MethodOverriding1 ();
		obj.add(10,20);//MethodOverriding class
		System.out.println("...............");
		obj.add(30,40);//MethodOverriding class
		add1();
		
		
		
	}
	
	
	
	
	
	
	
	

  }
