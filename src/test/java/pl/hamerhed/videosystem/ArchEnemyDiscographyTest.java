package pl.hamerhed.videosystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={VideosystemForArchEnemyConfig.class})
public class ArchEnemyDiscographyTest {
	
	//pobierany na podstawie nazwy metody tworzacej beana
	@Autowired
	private CdPlayer khaosLegionPlayer;
	
	//pobierany na podstawie nazwy metody tworzacej beana
	@Autowired
	private CdPlayer warEternalPlayer;
	
	@Autowired
	private CdPlayer blackEarthPlayer;
	
	@Rule
	public SystemOutRule outRule = new SystemOutRule().enableLog(); 
	
	@Before
	public void setUp() {
		outRule.clearLog();
	}
	
	@Test
	public void beanExistanceTest() throws Exception {
		assertNotNull(khaosLegionPlayer);
		assertNotNull(warEternalPlayer);
		assertNotNull(blackEarthPlayer);
	}
	
	@Test
	public void khaosLegionPlay() throws Exception {
		khaosLegionPlayer.play();
		assertEquals("performer: Arch Enemy title: Khaos Legions track: Track1 track: Track2\n", outRule.getLogWithNormalizedLineSeparator());
	}
	
	@Test
	public void warEternalPlay() throws Exception {
		warEternalPlayer.play();
		assertEquals("performer: Arch Enemy title: War Eternal track: Track1we track: Track2we\n", outRule.getLogWithNormalizedLineSeparator());
	}
	
	@Test
	public void blackEarthPlay() throws Exception {
		blackEarthPlayer.play();
		assertEquals("performer: Arch Enemy title: Black Earth track: Track1be track: Track2be\n", outRule.getLogWithNormalizedLineSeparator());
	}
}
