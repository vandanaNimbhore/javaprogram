package inheritanceCincept;

public class Sbi implements Generlisation  {
	public void withdraw()
	{
	   System.out.println("daiy 20000 cash withdraw");	
	}
   public void pin()
   {
	   System.out.println("chnage pin 2 time");
   }
   public static void main(String []args)
   {
	   Sbi obj= new Sbi();
	   obj.pin();
	   obj.withdraw();
	  Hdfc ob=new Hdfc();
	  ob.withdraw();
	  ob.pin();
	   
   }
}
