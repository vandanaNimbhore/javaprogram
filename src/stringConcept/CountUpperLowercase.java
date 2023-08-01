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
		char ch[]=s.toCharArray();
		if(ch[i]>='A' && ch[i]<='Z')
		{
			Cupper++;
			Pupper=Pupper+ch[i];
			
		}
		else
		{
			Clower++;
			Plower=Plower+ch[i];
			
		}
		}
		System.out.println("uppercase :"+Pupper);
		
		System.out.println("upper case: "+ Cupper);
		System.out.println("............................");
		System.out.println("lowercase :"+Plower);
		System.out.println("lower case : "+Clower);
	
	}

}
