package stringConcept;

public class ReplaceWord {
	public static void main(String[] args) {
		String str="india is my country";
		//output: Welcome my country
		
		
		StringBuffer obj=new StringBuffer(str);
	  int ch=str.indexOf('m');
	 System.out.println(ch);
		StringBuffer resu =obj.replace(0, 8, "welcome");
		System.out.println(resu);
		
		
		
		
	}

}
