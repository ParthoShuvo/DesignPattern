package compositeDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {

	private ArrayList<SongComponent> songComponentList = new 
			ArrayList<SongComponent>();

	private String groupName;

	private String groupDescription;

	public SongGroup(String groupName, String groupDescription) {
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}

	public ArrayList<SongComponent> getSongComponentList() {
		return songComponentList;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	@Override
	public void addSongComponent(SongComponent newSongComponent) {

		songComponentList.add(newSongComponent);
	}

	@Override
	public SongComponent getSongComponent(int componentIndex) {

		return songComponentList.get(componentIndex);
	}

	@Override
	public void displaySongInfo() {
		System.out.println("Group name: " + getGroupName() + 
				" description: " + getGroupDescription());
		Iterator<SongComponent> iterator = songComponentList.iterator();
		while(iterator.hasNext()){
			SongComponent song = iterator.next();
			song.displaySongInfo();
		}
	}

}
