package stringConcept;

public class Replace123 {
	public static void main(String[] args) {
		String str = "go#$$od mo2344rning    In*&^^%%%dia!@#$%^&&";
		String input = str.replaceAll("\\s", "");
		System.out.println(input);
		System.out.println(str.contains("bbbb"));
		String s=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
