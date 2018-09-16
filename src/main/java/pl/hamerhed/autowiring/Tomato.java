package pl.hamerhed.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Tomato implements Vegetable {

	public String name() {
		return "tomato";
	}

}
