/**
 * 
 */
package ie.lyit.mvnApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

/**
 * Tests for Anagram class.
 * @author sunoj
 *
 */
class AnagramTest {

	private static Anagram anagram;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		anagram = new Anagram();
	}

	/**
	 * Test method one for
	 * {@link ie.lyit.mvnApp.Anagram#isAnagrams(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testIsAnagrams() {
		assertFalse(anagram.isAnagrams(null, null));
	}

	/**
	 * Test method two for
	 * {@link ie.lyit.mvnApp.Anagram#isAnagrams(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testTwoIsAnagrams() {
		assertFalse(anagram.isAnagrams("action man", "cannotaim"));
	}

	/**
	 * Test method three for
	 * {@link ie.lyit.mvnApp.Anagram#isAnagrams(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testThreeIsAnagrams() {
		assertTrue(anagram.isAnagrams("the eyes", "they see"));
	}

	/**
	 * Test method four for
	 * {@link ie.lyit.mvnApp.Anagram#isAnagrams(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFourIsAnagrams() {
		assertFalse(anagram.isAnagrams("the eyes", "they sea"));
	}

	/**
	 * Test method five for
	 * {@link ie.lyit.mvnApp.Anagram#isAnagrams(java.lang.String, java.lang.String)}.
	 */
	@Test
	void testFiveIsAnagrams() {
		assertTrue(anagram.isAnagrams("", ""));
	}

}
