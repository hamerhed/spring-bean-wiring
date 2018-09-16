package pl.hamerhed.animals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class FruitsConfig {
	
	@Bean(name = {"orange"})
	public Food fruit() {
		return new Orange();
	}
}
