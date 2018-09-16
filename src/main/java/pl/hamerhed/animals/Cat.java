package pl.hamerhed.animals;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	public String makeVoice() {
		// TODO Auto-generated method stub
		return "miau";
	}

	public void eat() {
		System.out.println("cat is eating");

	}

}
