package inheritanceCincept;

public class EncapsulationConcept {
	private int a=10;
	private  static int t=20;
	private String str="Username=Xyz";
	private String str1="Password=Abc";
	public int demo() {
		
		System.out.println("value of a "+a);
		return a;
	}
	public static void demo1()
	{
		System.out.println("value of t "+t);
	}
	public void username()
	{
		System.out.println(str);
	}
	public String password()
	{
		System.out.println(str1);
		return str1;
	}
	

}
