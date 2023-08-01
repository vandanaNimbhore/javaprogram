package inheritanceCincept;

public class A extends B {
	int a=20;
	int b=50;
	
public void demo()
{
	int a=60;
	int b=40;
	System.out.println(a);
	System.out.println(b);
	System.out.println(this.a);
	System.out.println(super.a);
}
public static void main(String[] args) {
	A ob=new A();
	ob.demo();
	System.out.println(ob.a);
}
}
