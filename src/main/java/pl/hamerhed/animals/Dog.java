package pl.hamerhed.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

class Dog implements Animal {

	private Food food;
	
	public Dog(final Food food) {
		System.out.println("create dog");
		this.food = food;
	}
	
	public String makeVoice() {
		return "bark";
	}

	public void eat() {
		System.out.println("I am eating " + food.name());

	}

}
