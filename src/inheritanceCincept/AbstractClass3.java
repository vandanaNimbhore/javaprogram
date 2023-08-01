package inheritanceCincept;

public class AbstractClass3 extends AbstractClass2 {
	public void add1()
	{
		System.out.println("abstract method 2"); //completing method
	}
	public void add3()      //complete static method
	{
		System.out.println("override");
	}

	public static void main(String[] args) {
		AbstractClass3 obj =new AbstractClass3();
		obj.add3();
		obj.add();
		obj.add1();
		obj.demo();
		AbstractClass3.add2();
		
		
	} 

}
