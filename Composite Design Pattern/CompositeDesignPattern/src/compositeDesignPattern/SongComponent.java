package compositeDesignPattern;

public abstract class SongComponent {

	
	public void addSongComponent(SongComponent newSongComponent){
		throw  new UnsupportedOperationException();
	}
	
	public void removeSongComponent(SongComponent songComponent){
		throw new UnsupportedOperationException();
	}
	
	public SongComponent getSongComponent(int componentIndex){
		throw new UnsupportedOperationException();
	}
	
	public String getSongName(){
		throw new UnsupportedOperationException();
	}
	
	public String getBandName(){
		throw new UnsupportedOperationException();
	}
	
	public int getReleaseYear(){
		throw new UnsupportedOperationException();
	}
	
	public void displaySongInfo(){
		throw new UnsupportedOperationException();
	}

}
