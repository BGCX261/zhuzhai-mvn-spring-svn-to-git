/**
 * 
 */
package com.glority.springrecipes.sequence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Glority
 *
 */
public class TestSequenceGenerator {
	ApplicationContext context;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		SequenceGenerator generator = (SequenceGenerator)context.getBean("sequenceGenerator");
		assertEquals("301A",generator.getSequence());
		assertEquals("302A",generator.getSequence());
	}

}
