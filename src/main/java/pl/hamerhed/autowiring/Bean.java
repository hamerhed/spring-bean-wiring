package pl.hamerhed.autowiring;

import org.springframework.stereotype.Component;

@Component
class Bean implements Vegetable {

	public String name() {
		return "bean";
	}

}
