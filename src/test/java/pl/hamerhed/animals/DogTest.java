package pl.hamerhed.animals;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AnimalsFruitsConfig.class})
public class DogTest {
	
	@Autowired
	private Animal dog;
	
	@Autowired
	@Qualifier("dogEatingFruit")
	private Animal x;
	
	@Rule
	public final SystemOutRule out = new SystemOutRule().enableLog();
	
	@Before
	public void setUp() {
		out.clearLog();
	}
	
	@Test
	public void testConfig() throws Exception {
		assertNotNull(dog);
		assertNotNull(x);
	}
	
	@Test
	public void barkingTest() throws Exception {
		assertEquals("bark", dog.makeVoice());
	}
	
	@Test
	public void eatingTest() throws Exception {
		dog.eat();
		assertEquals("I am eating beef\n", out.getLogWithNormalizedLineSeparator());
	}
	
	@Test
	public void eatingOrangeTest() throws Exception {
		x.eat();
		assertEquals("I am eating orange\n", out.getLogWithNormalizedLineSeparator());
	}

}
