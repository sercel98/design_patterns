package composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

	private String playlistName;

	private ArrayList<IComponent> playlist;

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
		playlist = new ArrayList<IComponent>();
	}

	@Override
	public void play() {
		for (IComponent p : playlist) {
			p.play();
		}
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		for (IComponent p : playlist) {
			p.setPlaybackSpeed(speed);
			
		}

	}

	@Override
	public String getName() {
		return playlistName;
	}

	public void add(IComponent component) {
		playlist.add(component);
	}

	public void remove(IComponent component) {
		playlist.remove(component);
	}

}
