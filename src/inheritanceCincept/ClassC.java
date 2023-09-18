package inheritanceCincept;

public class ClassC extends ClassB {
	public static int s=700;
	int t=900;
	@Override
	public  void demo1()
	{
		System.out.println(" methodClassC");
		
	}
	/*public void demo5()
	{
		System.out.println("non static ClassC");
	}*/
	public  static void main(String[] args) 
	{ // System.out.println("ClassA accesss");
		//System.out.println(x);
		//demo();
		ClassC obj1=new ClassC();
		//System.out.println(obj1.y);
		
		
		/*System.out.println("<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("ClassB execution");
		//System.out.println(a);
		//demo2();
		System.out.println(obj1.b);
		//obj1.demo3();*/
		/*System.out.println(">>>>>>>>>>>");
		System.out.println(s);
		demo4();
		System.out.println(obj1.t);
		obj1.demo5();
		demo();
		obj1.demo1();
		obj1.demo3();
		demo2();*/
		ClassA ob=new ClassA();
		ob=obj1;
		
		ob.demo1();
		
		
	}

}
