package stringConcept;

public class CountUpperLowercase {
	public static void main(String[] args) {
		String str="Welcome to My World";
		int Cupper=0;
		int Clower=0;
		String Pupper ="";
		String Plower="";
		String s=str.replaceAll("\\s", "");
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
		//char ch[]=s.toCharArray();
		if(str.charAt(i)>='A' && str.charAt(i)<='Z')
		{
			Cupper++;
			Pupper=Pupper+str.charAt(i);
			
		}
		else
		{
			Clower++;
			Plower=Plower+str.charAt(i);
			
		}
		}
		System.out.println("uppercase :"+Pupper);
		
		System.out.println("upper case: "+ Cupper);
		System.out.println("............................");
		System.out.println("lowercase :"+Plower);
		System.out.println("lower case : "+Clower);
	
	}

}
