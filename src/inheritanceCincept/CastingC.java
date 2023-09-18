package inheritanceCincept;

public class CastingC extends CastingB {
	public void print() {
		System.out.println("hiiiiii");
	}
	public void demo1()
	{
		System.out.println("c");
	}
	
	
	public static void main(String[] args) {
		CastingA ob=new CastingA();
		ob.add();
		//ob.demo();
		System.out.println("..............");
		CastingB ob1 =new CastingB();
		ob1.add();
		//ob1.demo();
		System.out.println("...........");
		CastingB b=new CastingC();
		b.add();
		//b.demo();
		//b.print();
		
		
	}

}
