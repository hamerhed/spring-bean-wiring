package pl.hamerhed.videosystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:pl/hamerhed/discography/nightwish/nightwish_discography_config.xml")
public class VideosystemForNightwishConfig {
	@Bean
	@Autowired
	public MediaPlayer oncePlayer(Disc onceCd) {
		return new CdPlayer(onceCd);
	}
	
	@Bean
	@Autowired
	public MediaPlayer wishmasterPlayer(final Disc wishmasterCd) {
		return new CdPlayer(wishmasterCd);
	}
}
