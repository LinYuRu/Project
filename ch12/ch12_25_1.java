package ch12;

public class ch12_25_1 {

	public static void main(String[] args) {
		String str = "I love java";
		String[] words = str.split("\\s");
		System.out.printf("words有%d個字\n", words.length);
		for(String w:words) {
			System.out.println(w);
		}
		
	}

}
