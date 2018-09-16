package pl.hamerhed.animals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class AnimalsConfig {

	@Bean(name="beef")
	public Food meat() {
		return new Meat();
	}
	
	@Bean
	public Animal dog(Food beef) {
		return new Dog(beef);
	}
	
	@Bean
	public Animal dogEatingFruit(Food orange) {
		return new Dog(orange);
	}
}
