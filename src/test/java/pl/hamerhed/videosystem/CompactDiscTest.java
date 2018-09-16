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
@ContextConfiguration(classes=VideosystemConfig.class)
public class CompactDiscTest {

	@Autowired
	private MediaPlayer player;
	
	@Rule
	public SystemOutRule outRule = new SystemOutRule().enableLog();
	
	@Before
	public void setUp() {
		outRule.clearLog();
	}
	
	@Test
	public void testPlayer() throws Exception {
		player.play();
		assertEquals("my best songs\n", outRule.getLogWithNormalizedLineSeparator());
		
	}
	
}
