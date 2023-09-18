package stringConcept;

public class Conversion {
	
	public static void main(String[] args) {
		
		String str="vAnDaNa nImBHoRe";
		String st="";
		String st1="";
		char ch[]=str.toCharArray();	
	     for(int i=0;i<ch.length;i++)
	     {
	    	 if(ch[i]>='A' && ch[i]<='Z')
	    	 { 
	    		  st= str.toLowerCase();
	    	 }
	    	 else 
	    		 
	    	 {
	    		  st1=str.toUpperCase();
	    	 }
	     }
	     System.out.println(st);
	     System.out.println(st1);
        
		
	}

}
