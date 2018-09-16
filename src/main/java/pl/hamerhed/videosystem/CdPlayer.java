package pl.hamerhed.videosystem;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class CdPlayer implements MediaPlayer {

	private Disc disc;
	
	@Autowired
	public CdPlayer(final Disc disc) {
		this.disc = disc;
	}
	
	public void play() {
		System.out.println(disc.play());
	}

}
