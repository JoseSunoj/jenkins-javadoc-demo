package ie.lyit.mvnApp;

/**
 * A Java program to tests whether two strings are anagrams or not.
 * This class contains the main method which calls the isAnagrams method of Anagram 
 * and displays the result.
 * @author sunoj
 * @version 0.1
 */
public class App {
	/**
	 * The main method of the application.
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		System.out.print(anagram.isAnagrams("action man", "cannot aim"));
	}
}
