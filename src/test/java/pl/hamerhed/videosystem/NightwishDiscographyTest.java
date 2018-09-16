package pl.hamerhed.videosystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={VideosystemForNightwishConfig.class})
public class NightwishDiscographyTest {

	@Autowired
	private MediaPlayer oncePlayer;
	
	@Autowired
	private MediaPlayer wishmasterPlayer;
	
	@Rule
	public SystemOutRule outRule = new SystemOutRule().enableLog();
	
	@Before
	public void setUp() {
		outRule.clearLog();
	}
	
	@Test
	public void beansExistance() throws Exception {
		assertNotNull(oncePlayer);
		assertNotNull(wishmasterPlayer);
	}
	
	@Test
	public void oncePlayerTest() throws Exception {
		oncePlayer.play();
		assertEquals("performer: Nightwish title: Once track: Track1 track: Track2\n", outRule.getLogWithNormalizedLineSeparator());
	}
	
	@Test
	public void wishmasterPlayerTest() throws Exception {
		wishmasterPlayer.play();
		assertEquals("performer: Nightwish title: Wishmaster track: Track1w track: Track2w\n", outRule.getLogWithNormalizedLineSeparator());
	}
}
