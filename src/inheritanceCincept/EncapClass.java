package inheritanceCincept;

public class EncapClass {
	public static void main(String[] args)
	{int t=50;
		EncapsulationConcept obj=new EncapsulationConcept();
		obj.demo();
		EncapsulationConcept.demo1();
		System.out.println("...after changing a value...");
		//obj.demo()=30;  //we are not chnaging a value
		//when we are chnging a value then we are using returntype.
		int s=obj.demo();
		System.out.println(s);
		int d=s+t;  // 10+50   10 is private variable value
		System.out.println(d);
		s=89;
				System.out.println(s);
				obj.username();
		String st =obj.password();
		st="ddddd";
		
				
				
				
		
	}

}
