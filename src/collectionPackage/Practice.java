package collectionPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Practice {
	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("abcd");
	al.add("pqrs");
	al.add(10);
	al.add('q');
	al.get(1);
	System.out.println(al);
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	   
		
	
		 
		
		 
	}

}
