package stringConcept;

public class Removechar {
	public static void main(String[] args) {
		String str="velocity class";
		//String s=str.replaceAll("v", "");
		//System.out.println(s);
		String s[]=str.split("");
		System.out.println(s);
		char ch[]=str.toCharArray();
		int count =0;
		for(int i=0;i<=str.length()-1;i++ )
		{
			if(str.charAt(i)>='a'||str.charAt(i)>='A'||str.charAt(i)<='z'||str.charAt(i)>='Z')
			{
				count++;
				
			}
			
		}
		System.out.println(count);
		
	}

}
