package stringConcept;

public class ReversStringPosition {
	public static void main(String [] args)
	{
		String str="hellow world india";
		for(int i=0;i<=2;i++)
		{
			String st[]=str.split(" ");
			System.out.println(st[i]);
			for(int j=st[i].length()-1;j>=0;j--)
			{
				System.out.print(st[i].charAt(j));
			}
		}
	}

}
