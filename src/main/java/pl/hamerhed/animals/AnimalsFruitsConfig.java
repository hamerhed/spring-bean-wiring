package pl.hamerhed.animals;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AnimalsConfig.class, FruitsConfig.class})
public class AnimalsFruitsConfig {

}
