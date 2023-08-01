package stringConcept;

public class StringMemory {
	public static void main(String[] args) {
		
	
	String str=new String("Riya");  //declaired with new keyword, stored in nonconstatnt
	String str1=new String("RIYA");
	
	String str2 ="Riya"; // declaired without new keyword stored constant pool area.
	String str3="riyay";
	//== using >> compairing address
	System.out.println("compairing address");
	System.out.println(str==str1);
	System.out.println(str2==str3);
	boolean a=(str==str1); // using boolean datatype
	System.out.println(a);
	System.out.println("..........compairing value.........");
	
	// using equals() method >> compairing value
	System.out.println(str.equals(str2));
	System.out.println(str2.equals(str3));
	boolean b=str1.equals(str2);
	System.out.println(b);
	
	// equalsIgnoreCase-compairng value bt not including lower and uppercase impact
	System.out.println("..........compairing value without upper and lower impact");
	System.out.println(str2.equalsIgnoreCase(str3));
	
	// specify length of string
	System.out.println(".....Length.......");
	System.out.println(str.length());
	int c=str.length();
	System.out.println("length is: "+c);
	
	// print single char  by using index charAt()
	System.out.println(".....character display...");
	char ch=str.charAt(3);
	System.out.println(ch);
	
	//print index by using character. indexOf()
	System.out.println("......display character index.....");
	int d=str3.indexOf('u');
	System.out.println(d);
	
	//lastIndex 
	System.out.println(".....display last index.....");
	int d1=str3.lastIndexOf('y');
	System.out.println(d1); 
	
	System.out.println("display string index");     //
	int d2=str.indexOf("R");
	System.out.println(d2);
	
	//display uppercase letter toUpperCase()
	System.out.println(".....uppercase letter.......");
	String s=str3.toUpperCase();
	System.out.println(s);
	
	//display lowercase letter toLowerCase()
	System.out.println("........lowerCase letter.....");
	String s1=str1.toLowerCase();
	System.out.println(s1);
	char c1=str.charAt(3);
	System.out.println(c1);
	System.out.println("........End with........");
	
	//endWith  end character of string 
	String st=" Velocity class katraj ";
	boolean z=st.endsWith("raj ");    //true output
	System.out.println(z);
	System.out.println(st.endsWith("ass"));// false output
	
	//substring :give statrt end index  then print between string.
	 System.out.println(".....SubString.....");
	 String z1=st.substring(1);
	 System.out.println(z1);   //begining index
	 System.out.println(st.substring(3, 14)); //last index
	 
	 //replace: replacing character:
	 System.out.println(".....replace character......");
	 String z2=st.replace("ity"," ess");
	 System.out.println(z2);
	 
	 //split :spliting string
	 System.out.println("....spliting string....");
     String v[]=st.split("a");	 
     System.out.println(v[0]);
     System.out.println(v[1]);
     System.out.println(v[2]);
     System.out.println(v[3]);
     
     //trim :removes all starting and ending white spaces.
     System.out.println("......remove spaces.....");
     System.out.println(st);  
     System.out.println(st.trim()); // after using trim
    
	
	
	
	
	
	
	
	
   
	
	}

	
}
