/**
 * 
 */
package ie.lyit.mvnApp;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

/**
 * Tests for App class.
 * @author sunoj
 *
 */
class AppTest {

	private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private static final PrintStream originalOut = System.out;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setOut(new PrintStream(outContent));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.setOut(originalOut);
	}

	/**
	 * Test method for {@link ie.lyit.mvnApp.App#main(java.lang.String[])}.
	 */
	@Test
	void testMain() {
		App.main(null);
		assertEquals("true", outContent.toString());
	}

}
