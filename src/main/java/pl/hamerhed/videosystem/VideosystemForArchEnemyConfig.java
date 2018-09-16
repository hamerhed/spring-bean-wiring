package pl.hamerhed.videosystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:pl/hamerhed/discography/archenemy/arch_enemy_discography.xml")
public class VideosystemForArchEnemyConfig {
	
	@Bean
	//@Autowired
	//public MediaPlayer khaosLegionPlayer(Disc khaosLegionsCd) {
	//moze byc tez pobierany bez @autwired jak ponizej
	public MediaPlayer khaosLegionPlayer(@Qualifier("khaosLegionsCd") Disc khaosLegionsCd) {
		return new CdPlayer(khaosLegionsCd);
	}
	
	@Bean
	@Autowired
	public MediaPlayer warEternalPlayer(Disc warEternalCd) {
		return new CdPlayer(warEternalCd);
	}
	
	@Bean
	@Autowired
	public MediaPlayer blackEarthPlayer(Disc blackEarthCd) {
		return new CdPlayer(blackEarthCd);
	}
}
