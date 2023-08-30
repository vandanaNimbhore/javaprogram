package stringConcept;

public class LengthString {
	/* public static String LongestWord(String sen) {
		    String spl[]=sen.split(" ");
		    String lon = "";
		   // int length=sen.length();
		    for(int i=0;i<spl.length;i++)
		    {
		      for(int j=i+1;j<spl.length;j++)
		      {
		        if(spl[i].length()>=spl[j].length())
		        {
		          lon=spl[i];
		        }
		      }

		    }
		    System.out.println(lon);


		  }*/

		  public static void main (String[] args) {  
		    String str="fun&!! time";
		  // LengthString.LongestWord(str);
		   String rp= str.replace("&!!"," ");
		   System.out.println(rp);
		   String spl[]=rp.split(" ");
		    String lon = "";
		  
		   // int length=sen.length();
		    for(int i=0;i<spl.length;i++)
		    {
		      for(int j=i+1;j<spl.length;j++)
		      {
		        if(spl[i].length()>=spl[j].length())
		        
		        	{
		        	 lon=lon+spl[i];
		        	}
		         
		        }
		      

		    }
		    System.out.println(lon);


		  }
		    
		  

		}


