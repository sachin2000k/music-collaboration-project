// Content.java

/**
 * Class representing user-generated content awaiting moderation.
 */
public class Content {
    private int id;
    private String details;
    private boolean isApproved;

    public Content(int id, String details) {
        this.id = id;
        this.details = details;
        this.isApproved = false;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getDetails() { return details; }
    public boolean isApproved() { return isApproved; }
    public void setApproved(boolean approved) { isApproved = approved; }
}
