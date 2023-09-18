package stringConcept;

import java.util.HashMap;

public class CountHighestVowels {
	public static void main(String[] args) {
		String str="india is countrye";
		char ch[]=str.toCharArray();
		HashMap<Character,Integer>hm=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
		  if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u');
		  {
			for(char c:ch)
		     {
				if(!hm.containsKey(c))
				 {
					  hm.put(c, 1);
				 }
				 else
				 {
					  int value=hm.get(c);
					  hm.put(c, value+1);
				 }
			  }
			  
		  }
		}
		
	}

}
