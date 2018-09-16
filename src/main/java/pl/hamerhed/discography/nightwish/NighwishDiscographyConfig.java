package pl.hamerhed.discography.nightwish;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.hamerhed.videosystem.Disc;

@Configuration
class NighwishDiscographyConfig {

	@Bean
	public Disc onceCd() {
		return new NightwishCd("Nightwish", "Once", Arrays.asList("Track1", "Track2"));
	}
}
