package stringConcept;

import java.util.LinkedHashSet;

public class RemoveDublicateStrinng {
	public static void main(String[] args) {
	    
		String str ="India is country India";
		String sp[]=str.split(" ");
		LinkedHashSet lk= new LinkedHashSet();
		for(int i=0;i<sp.length;i++)
		{
	
			lk.add(sp[i]);
		}
		for(Object l:lk)
		{
			System.out.print(l +" ");
		}
		
	}

}
