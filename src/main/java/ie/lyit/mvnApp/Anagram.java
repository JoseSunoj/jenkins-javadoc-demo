/**
 * 
 */
package ie.lyit.mvnApp;

import java.util.Arrays;

/**
 * A java class contains a method to test two given strings are anagrams or not.
 * @author sunoj
 *
 */
public class Anagram {

	/**
	 * A method to test whether two strings are anagrams or not.
	 * @param s first string to test
	 * @param t second string to test
	 * @return true or flase
	 */
	public boolean isAnagrams(String s, String t) {
		if (s == null || t == null) return false;
		if (s.length() != t.length()) return false;
		
		char[] ch1 = s.toCharArray();
		char[] ch2 = t.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}	
}
