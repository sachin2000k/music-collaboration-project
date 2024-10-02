// Musician.java

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a Musician user with music-related functionalities.
 */
public class Musician extends User {
    private List<Project> projects;
    private List<MusicFile> musicFiles;
    private Portfolio portfolio;

    public Musician(int id, String name, String email) {
        super(id, name, email, "Musician");
        projects = new ArrayList<>();
        musicFiles = new ArrayList<>();
        portfolio = new Portfolio();
    }

    // Project Collaboration Methods
    public void createProject(Project project) {
        projects.add(project);
        System.out.println("Project " + project.getDescription() + " created.");
    }

    public void addCollaboratorToProject(int projectId, Musician collaborator) {
        for (Project p : projects) {
            if (p.getId() == projectId) {
                p.addCollaborator(collaborator);
                System.out.println("Collaborator " + collaborator.getName() + " added to project.");
                return;
            }
        }
        System.out.println("Project not found.");
    }

    // Share and Edit Music Files Methods
    public void uploadMusicFile(MusicFile file) {
        musicFiles.add(file);
        System.out.println("Music file " + file.getFileName() + " uploaded.");
    }

    public void editMusicFile(int fileId, String newContent) {
        for (MusicFile mf : musicFiles) {
            if (mf.getId() == fileId) {
                mf.editContent(newContent);
                System.out.println("Music file " + fileId + " edited.");
                return;
            }
        }
        System.out.println("Music file not found.");
    }

    // Manage Music Portfolio Methods
    public void addToPortfolio(MusicFile file) {
        portfolio.addSong(file);
        System.out.println("Music file " + file.getFileName() + " added to portfolio.");
    }

    public void updatePortfolio() {
        System.out.println("Portfolio updated. Current songs:");
        portfolio.listSongs();
    }

    // Method to list projects
    public void listProjects() {
        System.out.println("Listing projects:");
        for (Project p : projects) {
            System.out.println(p.getId() + ": " + p.getDescription());
        }
    }

    // Method to list music files
    public void listMusicFiles() {
        System.out.println("Listing music files:");
        for (MusicFile mf : musicFiles) {
            System.out.println(mf.getId() + ": " + mf.getFileName());
        }
    }
}
