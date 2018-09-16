package pl.hamerhed.discography;

import java.util.List;

import pl.hamerhed.videosystem.Disc;

 public class DiscographyCd implements Disc {

	private String performer;
	private String title;
	private List<String> tracks;
	
	public DiscographyCd(String performer, String title, List<String> tracks) {
		this.performer = performer;
		this.title = title;
		this.tracks = tracks;
	}
	
	public String play() {
		StringBuilder b = new StringBuilder();
		b.append("performer: " + performer);
		b.append(" title: " + title);
		for (String track : tracks) {
			b.append(" track: " + track);
		}
		return b.toString();
	}

}
