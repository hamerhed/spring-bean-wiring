package pl.hamerhed.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"pl.hamerhed.autowiring"})
public class VegetablesConfig {
	
	@Bean
	public Vegetable carrot() {
		return new Carrot();
	}
	
	@Bean
	public Vegetable onion() {
		return new Onion();
	}

}
