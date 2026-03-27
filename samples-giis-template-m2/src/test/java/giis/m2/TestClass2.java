package giis.m2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestClass2 {
	private final Logger log=LoggerFactory.getLogger(this.getClass());

	@BeforeEach
	public void setUp(TestInfo testInfo) {
		log.info("****** Running test: {} ******", testInfo.getDisplayName());
	}
	
	@Test
	public void testFunction21() {
		assertEquals("11-12", new Class2().function21());
	}

}
