package giis.m1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestClass1 {
	private final Logger log=LoggerFactory.getLogger(this.getClass());

	@BeforeEach
	public void setUp(TestInfo testInfo) {
		log.info("****** Running test: {} ******", testInfo.getDisplayName());
	}

	@Test
	public void testFunction11() {
		assertEquals("11", new Class1().function11());
	}
	
}
