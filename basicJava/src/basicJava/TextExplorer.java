package basicJava;

/*## Q. Write a java program to find number of characters, number of words and number of lines in a text file?
		```java*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextExplorer {
	public static void main(String[] args) {
	
			
			int charCount = 0;
			int wordCount = 0;
			int lineCount = 0;
				try (
				BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\prahl\\hero.txt"));
				) 
				{
				
				// Reading the first line into currentLine
				String currentLine = reader.readLine();
				while (currentLine != null) {
				// Updating the lineCount
				lineCount++;
				
			
				// Getting number of words in currentLine
				String[] words = currentLine.split(" ");
				// Updating the wordCount
				wordCount +=words.length;
				System.out.println(words.length);//searching no.of words in each line and printing out 
				for (String word : words) {
				charCount = charCount + word.length();
				}
				// Reading next line into currentLine
				currentLine = reader.readLine();
				}
				System.out.println("Number Of Chars In A File : "+charCount);
				System.out.println("Number Of Words In A File : "+wordCount);
				System.out.println("Number Of Lines In A File : "+lineCount);
				}
					catch (IOException e) {
						e.printStackTrace();
					}
	}
}


