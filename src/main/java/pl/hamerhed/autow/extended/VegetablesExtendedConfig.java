package pl.hamerhed.autow.extended;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import pl.hamerhed.autowiring.Onion;
import pl.hamerhed.autowiring.Vegetable;
import pl.hamerhed.autowiring.VegetablesConfig;

@Configuration
@Import(value= {VegetablesConfig.class})
public class VegetablesExtendedConfig {
	
	@Bean
	Vegetable redOnion() {
		return new Onion();
	}
}
