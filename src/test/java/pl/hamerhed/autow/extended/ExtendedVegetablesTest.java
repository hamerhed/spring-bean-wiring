package pl.hamerhed.autow.extended;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pl.hamerhed.autow.extended.VegetablesExtendedConfig;
import pl.hamerhed.autowiring.Vegetable;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {VegetablesExtendedConfig.class})
public class ExtendedVegetablesTest {

	@Autowired
	private List<Vegetable> list;
	
	@Autowired
	private Set<Vegetable> set;
	
	
	@Test
	public void testVegetablesList() throws Exception {
		assertEquals(5, list.size());
		assertEquals(2, list.stream().filter(p -> p.name().equals("onion")).count());
	}
	
	@Test
	public void testVegetablesSet() throws Exception {
		assertEquals(5, set.size());
		assertEquals(2, set.stream().filter(p -> p.name().equals("onion")).count());
	}
}
