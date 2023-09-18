package stringConcept;

import java.util.HashMap;

public class Occurance {
	public static void main(String[] args) {
		HashMap<Character,Integer> occurance=new HashMap<>();
		String str="vandana";
		//String abc[]=str.split(" ");
		char st[]=str.toCharArray();
		/*for(int i=0;i<abc.length;i++)
		{
			for(int j=i+1;j<abc.length;j++)
			{
				if(abc[i].equals(abc[j]))
				{
					System.out.println(abc[i]);
				}
			}
		}*/
		/*for(String s:st)
		{
			if(!occurance.containsKey(s))
			{
				occurance.put(s, 1);
			}
			else
			{
				int value=occurance.get(s);
				occurance.put(s, value+1);
			}
			
		}*/
		//System.out.println(occurance);
		
		
		for(char s:st)
		{
			if(!occurance.containsKey(s))
			{
				occurance.put(s, 1);
			}
			else
			{
				int value=occurance.get(s);
				occurance.put(s, value+1);
			}
			
		}
		System.out.println(occurance);
		
	}

}
