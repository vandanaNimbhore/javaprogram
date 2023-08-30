package stringConcept;

public class Reverse123 {
	public static void main(String[] args) {
		String str="Vandana  Nimbhore Borde"; 
		String output="";
		// india world hello
		String s[]=str.split(" ");
		
		for(int i=0;i<s.length;i++)
		
		{
		    for(int j=i+1;j<s.length;j++)
		    {
		    	String swap=s[i];
		    	s[i]=s[j];
		    	s[j]=swap;
		    }
		    System.out.print (s[i]+" ");
          		
		}
		
		
		
	}

}
