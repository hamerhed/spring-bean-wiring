package pl.hamerhed.autowiring;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {VegetablesConfig.class})
public class VegetablesTest {
	
	@Autowired
	private List<Vegetable> list;
	
	@Autowired
	private Set<Vegetable> set;
	
	@Autowired
	private Vegetable carrot;
	
	@Test
	public void testListCollection() throws Exception {
		assertNotNull(list);
		assertEquals(4, list.size());
		
		List<String> names = list.stream().map(p -> p.name()).collect(Collectors.toList());
		assertTrue(names.contains("onion"));
		assertTrue(names.contains("tomato"));
		assertTrue(names.contains("carrot"));
		assertTrue(names.contains("bean"));
	}
	
	@Test
	public void testSetCollection() throws Exception {
		assertNotNull(set);
		assertEquals(4, set.size());
		
		List<String> names = set.stream().map(p -> p.name()).collect(Collectors.toList());
		assertTrue(names.contains("onion"));
		assertTrue(names.contains("tomato"));
		assertTrue(names.contains("carrot"));
		assertTrue(names.contains("bean"));
	}
	
	@Test
	public void testCarrot() throws Exception {
		assertNotNull(carrot);
		assertEquals("carrot", carrot.name());
	}
}
