package stringConcept;

public class ConvertString {
	public static void main(String[] args) {
		String str="velocity";
		
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]>ch[j])
				{
					char b=ch[i];
					ch[i]=ch[j];
					ch[j]=b;
					
				}
				
			}
			System.out.print(ch[i]);
		}
	}

	
}
