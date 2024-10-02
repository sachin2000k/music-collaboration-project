// Project.java

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a music project for collaboration.
 */
public class Project {
    private int id;
    private String description;
    private List<Musician> collaborators;
    private String deadline;
    private String status;

    public Project(int id, String description, String deadline) {
        this.id = id;
        this.description = description;
        this.deadline = deadline;
        this.collaborators = new ArrayList<>();
        this.status = "Ongoing";
    }

    // Getters and setters
    public int getId() { return id; }
    public String getDescription() { return description; }
    public List<Musician> getCollaborators() { return collaborators; }
    public String getDeadline() { return deadline; }
    public String getStatus() { return status; }

    public void addCollaborator(Musician musician) {
        collaborators.add(musician);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}
