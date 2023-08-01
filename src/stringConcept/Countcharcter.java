package stringConcept;

public class Countcharcter {
	public static void main(String[] args) {
		String str="welcome to India";
		char ch[]=str.toCharArray();
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					System.out.println(count);
				}
			}
			
		}
		
	}

}
