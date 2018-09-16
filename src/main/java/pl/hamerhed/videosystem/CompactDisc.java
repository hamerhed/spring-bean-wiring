package pl.hamerhed.videosystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class CompactDisc implements Disc {

	public String play() {
		return "my best songs";
	}

}
