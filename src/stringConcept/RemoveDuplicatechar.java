package stringConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDuplicatechar {
	public static void main(String[] args) {
		String str= "Dakshata";
		String st="";
		int i,j;
		char ch[]=str.toCharArray();
		for( i=0;i<str.length();i++)
		{
			for( j=0;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
				   break;
				}	
				
			}
				if(i==j)
				{
					st=st+ch[i];
				}
			}
		System.out.println(st);

	}
	

}
