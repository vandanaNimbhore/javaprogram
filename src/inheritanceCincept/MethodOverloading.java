package inheritanceCincept;

public class MethodOverloading {
	public static void add() {
		int a = 67;
		int b = 67; // public static method
		int c = a + b;
		System.out.println(c);
	}

	public static void add(int a, int b) {
		int c = a + b; // public static method with argument
		System.out.println("argument addition " + c);
	}
	public static void add(String a,int b)
	{
		System.out.println("hhhhh");
	}
	static void  addition()
	{
		int a=10;
		int b=40;
		int c=a+b;
		System.out.println(c);
	}

	public void add1() {
		int a = 89; // non static declairation
		int b = 70;
		int c = a + b;
		System.out.println("non static declairation: " + c);
	}

	public void add1(int x, int y) {
		int z = x + y;
		System.out.println("non static with argument : " + z);
	} 

	public static void main(String[] args) {
		add();
		add(23, 23);
		MethodOverloading obj = new MethodOverloading();
		obj.add1();
		obj.add1(45, 10);
		add("b",6);
	}

}
 