package stringConcept;

public class DuplicateString {
	public static void main(String[] args) {
		String str="indiaa";
		char ch[]=str.toCharArray(); 
		//char st='0';
			for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					 System.out.println(ch[i]);
					
				}
			}
			
			
		}
			
	}

}
