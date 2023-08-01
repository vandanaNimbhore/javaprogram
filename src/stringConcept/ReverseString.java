package stringConcept;

public class ReverseString {
	public static void main(String [] args)
	{
		String str="Welcome world";
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		for(int j=ch.length-1;j>=0;j--)
		{
			System.out.print(ch[j]);
		}

	}

}
