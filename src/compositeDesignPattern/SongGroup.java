package compositeDesignPattern;

import java.util.ArrayList;

public class SongGroup extends SongComponent {

    // Contains any Songs or SongGroups that are added
    // to this ArrayList

    ArrayList<SongComponent> songComponents = new ArrayList<>();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDescription) {

        groupName = newGroupName;
        groupDescription = newGroupDescription;

    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent newSongComponent) {

        songComponents.add(newSongComponent);

    }

    public void remove(SongComponent newSongComponent) {

        songComponents.remove(newSongComponent);

    }

    public SongComponent getComponent(int componentIndex) {

        return songComponents.get(componentIndex);

    }

    public void displaySongInfo() {

        System.out.println(getGroupName() + " " +
                getGroupDescription() + "\n");

        // Cycles through and prints any Songs or SongGroups added
        // to this SongGroups ArrayList songComponents

        for (SongComponent songInfo : songComponents) {
            songInfo.displaySongInfo();
        }

    }


}