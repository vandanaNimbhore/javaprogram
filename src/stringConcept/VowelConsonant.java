package stringConcept;

public class VowelConsonant {
	public static void main(String[] args) {
	 String str="velocity";
	int count=0;
	 int j;
      
		for(int i=0;i<str.length();i++)
		{ 
		   if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)==
				   'i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		   { 
			   System.out.println("vowels:     "+str.charAt(i));
			    
		   }
		   else if(str.charAt(i)>='a' && str.charAt(i)<='z')
		   {
			   count ++;
			   System.out.println("consonant : " +str.charAt(i));
		   }
		}
		
	}
}
