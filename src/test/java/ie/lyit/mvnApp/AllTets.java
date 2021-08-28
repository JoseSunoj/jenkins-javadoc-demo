/**
 * 
 */
package ie.lyit.mvnApp;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;

import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ AnagramTest.class, AppTest.class })
@SelectPackages("ie.lyit.MvnApp")
/**
 * Test suite
 * @author sunoj
 *
 */
public class AllTets {

}
