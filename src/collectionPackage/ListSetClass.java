package collectionPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;


 public class ListSetClass {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(111);
		al.add("abc");
		al.add('v');
		al.add(null);
		al.add("def");
		al.add("abc");
		  
       al.remove(4);
		System.out.println(al);
		System.out.println(al.get(1));
		
		System.out.println("....iterator......");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println(".........SET..........");
	//..........................................................	
		HashSet hs=new HashSet();
		hs.add(112);
		hs.add("riya");
		hs.add("riya");
		hs.add('a');
		hs.add(null);
        System.out.println(hs);
      
        //...............................................  
       
        System.out.println("..........hashset to arraylist............");
        HashSet hs1=new HashSet();
        hs1.addAll(al);
        System.out.println(hs1);
        
        //............................................   

        System.out.println(".......arraylist to hashset..............");
        ArrayList al1=new ArrayList(hs);
        System.out.println(hs);
        System.out.println(al1.get(3));
    
        //..............................................
       /* System.out.println(".......LinkedList.........");
        LinkedList ll= new LinkedList();
        
        ll.add(450);
        ll.add("prachi");
        ll.add('b');
        ll.add(null);
        ll.add(null);
        System.out.println(ll);
        ll.get(0);
       //..............................................
        System.out.println("........vector.......");
        Vector v=new Vector();
        v.add(90);
        v.add("nidhi");
        v.add('x');
        v.add("null");
        v.add("null");
        System.out.println(v);*/
        
        //...........................................
        
       /* System.out.println("........linkedhashset.........");
        
        LinkedHashSet linkHS=new LinkedHashSet();
        
        linkHS.add(76);
        linkHS.add("krish");
        linkHS.add('d');
        linkHS.add("null");
        linkHS.add("null");
        System.out.println(linkHS);
        
       //.............................................
        
        System.out.println(".................Treeset............");
        
        TreeSet ts=new TreeSet();
        ts.add("vvvv");
        ts.add("dhano");
        ts.add("dhano");
        ts.add("hhhh");
        ts.add("pppp");
        System.out.println(ts);
       /* Iterator it1=ts.iterator();
        Object t=0;
        while(it1.hasNext())
        {
        	t=it.next();
        	
        	
        }
        System.out.println(t);*/
        
        
        
        
          
        
        
        
        
        
        
        
        
        
	}

}
