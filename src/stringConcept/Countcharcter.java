package stringConcept;

import java.util.HashMap;

public class Countcharcter {
	public static void main(String[] args) {
		String str="welcometoIndia";
		char []ch=str.toCharArray();
		HashMap<Character,Integer>hm=new HashMap<>();
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
		   System.out.println(hm);

}
} 