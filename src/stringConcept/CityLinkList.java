package stringConcept;

import java.util.ArrayList;

public class CityLinkList {
	public static void main(String[] args) {
		ArrayList city= new ArrayList();
		city.add("mumbai");
		city.add("pune");
		city.add("Nagpur");
		city.add("nasik");
		city.add("hydrabad");
		city.add("banglore");
		city.add("thane");
		city.add("nagar");
		System.out.println(city);
		System.out.println(city.indexOf("thane"));
		city.set(6, "kolhapur");
		Object a = city.clone();
		System.out.println(a);
		System.out.println(city);
		for(Object c:city)
		{
			System.out.println(c);
		}
		
	}

}
