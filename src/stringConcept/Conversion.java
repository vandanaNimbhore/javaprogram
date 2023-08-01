package stringConcept;

public class Conversion {
	
	public static void main(String[] args) {
		
		String str="AaBbCc";
		String st="";
		String st1="";
		char ch[]=str.toCharArray();	
	     for(int i=0;i<str.length();i++)
	     {
	    	 if(ch[i]>=97&&ch[i]<=122)
	    	 {
	    		  st= str.toUpperCase();
	    	 }
	    	 else if(ch[i]>=41 &&ch[i]<=96)
	    		 
	    	 {
	    		  st1=str.toLowerCase();
	    	 }
	     }
	     System.out.println(st);
	     System.out.println(st1);
        
		
	}

}
