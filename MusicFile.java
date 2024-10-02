// MusicFile.java

/**
 * Class representing a music file shared by a musician.
 */
public class MusicFile {
    private int id;
    private String fileName;
    private String content;
    private Musician owner;

    public MusicFile(int id, String fileName, Musician owner) {
        this.id = id;
        this.fileName = fileName;
        this.owner = owner;
        this.content = "";
    }

    // Getters and setters
    public int getId() { return id; }
    public String getFileName() { return fileName; }
    public Musician getOwner() { return owner; }
    public String getContent() { return content; }
    public void editContent(String newContent) { this.content = newContent; }
}
