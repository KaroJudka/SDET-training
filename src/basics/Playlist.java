package basics;

import java.util.ArrayList;

public class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Yesterday");
    desertIslandPlaylist.add("Hey-ho");
    desertIslandPlaylist.add("Hey Jude");
    desertIslandPlaylist.add("Chilling");
    desertIslandPlaylist.add("Cold heart");
    desertIslandPlaylist.add("Moin moin");
    desertIslandPlaylist.remove(4);
    String temp = ("Hey-ho");
    desertIslandPlaylist.set(1, "Moin moin");
    desertIslandPlaylist.set(4, temp);
    System.out.println(desertIslandPlaylist);
  }
}
