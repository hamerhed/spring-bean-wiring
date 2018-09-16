package pl.hamerhed.animals;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AnimalsTest.AnimalsConfiguration.class})
public class AnimalsTest {
	//znajduje wszystkie beany ktore sa danego typu i tworzy z nich kolekcje
	@Autowired
	private List<Animal> animals;
	
	@Autowired
	private Set<Animal> animalsSet;
	
	@Test
	public void whichAnimalsHasBeenTaken() throws Exception {
		assertNotNull(animals);
		assertEquals(3, animals.size());
		for (Animal animal : animals) {
			System.out.println("animal type=" + animal.getClass().getCanonicalName());
		}
		
		for (Animal animal : animals) {
			animal.eat();
		}
	}
	
	@Test
	public void setAnimalstest() throws Exception {
		assertNotNull(animals);
		assertEquals(3, animals.size());
		for (Animal animal : animals) {
			System.out.println("animal set type=" + animal.getClass().getCanonicalName());
		}
		
		for (Animal animal : animals) {
			animal.eat();
		}
	}
	
	@Configuration
	@ComponentScan(basePackages= {"pl.hamerhed.animals"})
	static class AnimalsConfiguration {}
		
}
