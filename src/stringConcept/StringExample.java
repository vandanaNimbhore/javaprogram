 package stringConcept;

public class StringExample {
	public static void main(String[] args) {
		
	
	String str="riya";
	String str1="riya";
	System.out.println(str==str1);
	System.out.println(str.equals(str1));
	System.out.println(str.length());
	System.out.println("............................");
	String st=new String("abc");
	String st1="abc";
	System.out.println(st==st1);
	System.out.println(st.equals(st1));
	System.out.println(".............................");
	String s=new String("xyz");
	String s1=new String("xyz");
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	System.out.println("................................");
	StringBuffer sb=new StringBuffer("abc");
	StringBuffer sb1=new StringBuffer("abc");
	System.out.println(sb + " "+ sb1);
	System.out.println(sb==sb1);
	System.out.println(sb.equals(sb1));
	System.out.println(sb.capacity());
	System.out.println(sb.append(sb1));
	
	
	
	
	}
}
