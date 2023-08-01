package inheritanceCincept;

public class CastingB extends CastingA  {
	public void add()
	{
		System.out.println("sub class nonstatic method ");
	
		
		
	}
	public static void main(String[] args) {
		CastingA ob=new CastingA ();
		ob.add();
		CastingB ob1=new CastingB();
		ob1.add();
		CastingA ob2=new CastingB();
	ob2.add();
	}

}
