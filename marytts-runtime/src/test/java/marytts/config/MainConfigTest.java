/**
 * 
 */
package marytts.config;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import marytts.exceptions.MaryConfigurationException;

import org.junit.Before;
import org.junit.Test;
/**
 * @author marc
 *
 */
public class MainConfigTest {

	private MaryConfig mc;
	
	@Before
	public void setUp() throws MaryConfigurationException {
		mc = new MainConfig();
	}
	
	@Test
	public void isMainConfig() {
		assertTrue(mc.isMainConfig());
	}
	
	@Test
	public void hasProperties() {
		assertNotNull(mc.getProperties()); 
	}
}
