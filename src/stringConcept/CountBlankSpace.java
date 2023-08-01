package stringConcept;

public class CountBlankSpace {
	public static void main(String[] args) {
		String st="Good Morning India";
		int count=0;
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
