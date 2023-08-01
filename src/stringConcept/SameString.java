package stringConcept;

import java.util.HashSet;
import java.util.Set;

public class SameString {

	public static void main(String[] args) {
		String str="vandana@gmail.com;test@yahoo.com;vandana@yahoo.com;test@gmail.com";
		String st[]=str.split(";");
		
		for(int i=0;i<=st.length-1;i++)
		{
			boolean result=st[i].contains("yahoo");
			if(result==true)
			{
			System.out.println(st[i]);
		}
		}	
	}

}
