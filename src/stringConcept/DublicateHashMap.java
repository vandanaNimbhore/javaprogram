package stringConcept;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class DublicateHashMap {
	public static void main(String[] args) {

	String str="india is country india";
	LinkedHashSet lk=new LinkedHashSet();
	lk.add(str);
	for(Object s:lk)
	{
		System.out.println(lk);
	}
	
}
}