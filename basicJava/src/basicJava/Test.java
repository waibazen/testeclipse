package basicJava;

import java.util.HashMap;
import java.util.Map;
//using HashMap for dups in a string 
public class Test {

	public static void main(String[] args) {
		String s = "hero is the real foxy hero so makes queen angry and real sad";
		HashMap<String, Integer> listOfWords = new HashMap<String, Integer>();
		String[] words = s.split(" ");

		for (String word : words) {
			if (listOfWords.containsKey(word)) {
				listOfWords.put(word, listOfWords.get(word) + 1);//count++
			} else {
				listOfWords.put(word, 1);//count=1
			}
		}

		for (Map.Entry<String, Integer> entry : listOfWords.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
