package inheritanceCincept;

public class ClassB extends ClassA {
	static int a = 300;
	int b = 400;

	public static void demo2() {
		System.out.println("static int classB");
	}

	public void demo3()
	{
		System.out.println("nonstatic method classB");
	}	
      public static void main(String[] args)
      {ClassB obj=new ClassB();
         System.out.println(a);
         System.out.println(obj.b);
         demo2();
         obj.demo3();
         demo();
         obj.demo1();
         
      }
	

}
