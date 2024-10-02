// Portfolio.java

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a musician's music portfolio.
 */
public class Portfolio {
    private List<MusicFile> songs;

    public Portfolio() {
        songs = new ArrayList<>();
    }

    public void addSong(MusicFile song) {
        songs.add(song);
    }

    public void listSongs() {
        for (MusicFile song : songs) {
            System.out.println(song.getId() + ": " + song.getFileName());
        }
    }
}
