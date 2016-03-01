package compositeDesignPattern;

public class DiskJockey {
	
	private SongComponent songList;

	public DiskJockey(SongComponent songList) {
		this.songList = songList;
	}
	
	public void getSongList() {
		songList.displaySongInfo();
	}
	
	

}
