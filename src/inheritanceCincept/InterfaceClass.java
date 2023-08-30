package inheritanceCincept;

public class InterfaceClass implements InterfaceMethod ,Interface1
{
	public void demo() {     // method form is non static 
		System.out.println("first incomplete method");
	}
	public void demo1() {
		System.out.println("Second incomplete method ");
	}
	/*public void demo2()
	{
		System.out.println("default class method");
	}*/
	public void pin()
	{
		
	}
	
		public static void main(String[] args) {
		InterfaceClass obj=new InterfaceClass();
		obj.demo();
		obj.demo1();
		//obj.demo2();  //complete method calling 
		System.out.println(a);
		System.out.println(InterfaceClass.a);    
		System.out.println(InterfaceMethod.a);// also calling interface
		//obj.a=40; //its not allow because in interfaces values are not chnage.
		
		obj.pin();
	}
	@Override
	public void data() {
		
		
	}
	

}
