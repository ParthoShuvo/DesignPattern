package compositeDesignPattern;

public class MainClass {
	public static void main(String[] args) {
		SongComponent industrialMusic = new SongGroup("Industrial Music", "bla bla bla ");
		SongComponent heavyMetalMusic = new SongGroup("Heavy Metal Music", "bla bla bla ");
		SongComponent dubStepMusic = new SongGroup("dubstep Music", "bla bla bla ");
		SongComponent everySong = new SongGroup("Master Song", "bla bla bla");
		everySong.addSongComponent(industrialMusic);
		industrialMusic.addSongComponent(new Song("bla", "hola", 1997));
		industrialMusic.addSongComponent(new Song("bla", "holai", 1929));
		industrialMusic.addSongComponent(heavyMetalMusic);
		industrialMusic.addSongComponent(new Song("blo", "holae", 1997));
		industrialMusic.addSongComponent(new Song("blo", "holaie", 1929));
		everySong.addSongComponent(dubStepMusic);
		dubStepMusic.addSongComponent(new Song("jhj", "jdjh", 1985));
		DiskJockey diskJockey = new DiskJockey(everySong);
		diskJockey.getSongList();
		
	}
}
