// Admin.java

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing an Admin user with administrative functionalities.
 */
public class Admin extends User {
    private List<User> users;
    private List<Content> pendingContent;
    private SystemSettings settings;

    public Admin(int id, String name, String email) {
        super(id, name, email, "Admin");
        users = new ArrayList<>();
        pendingContent = new ArrayList<>();
        settings = new SystemSettings();
    }

    // User Management Methods
    public void createUser(User user) {
        users.add(user);
        System.out.println("User " + user.getName() + " created successfully.");
    }

    public void updateUser(int userId, String name, String email, String role) {
        for (User u : users) {
            if (u.getId() == userId) {
                u.setName(name);
                u.setEmail(email);
                u.setRole(role);
                System.out.println("User " + userId + " updated successfully.");
                return;
            }
        }
        System.out.println("User not found.");
    }

    public void deleteUser(int userId) {
        users.removeIf(u -> u.getId() == userId);
        System.out.println("User " + userId + " deleted successfully.");
    }

    // Content Moderation Methods
    public void approveContent(int contentId) {
        for (Content c : pendingContent) {
            if (c.getId() == contentId) {
                c.setApproved(true);
                System.out.println("Content " + contentId + " approved.");
                return;
            }
        }
        System.out.println("Content not found.");
    }

    public void rejectContent(int contentId) {
        pendingContent.removeIf(c -> c.getId() == contentId);
        System.out.println("Content " + contentId + " rejected.");
    }

    // System Settings Methods
    public void updateSettings(String preference, String value) {
        settings.updateSetting(preference, value);
        System.out.println("System settings updated.");
    }

    // Method to add pending content for moderation
    public void addPendingContent(Content content) {
        pendingContent.add(content);
    }

    // Method to list users
    public void listUsers() {
        System.out.println("Listing users:");
        for (User u : users) {
            System.out.println(u.getId() + ": " + u.getName() + " (" + u.getRole() + ")");
        }
    }

    // Method to list pending content
    public void listPendingContent() {
        System.out.println("Listing pending content:");
        for (Content c : pendingContent) {
            System.out.println(c.getId() + ": " + c.getDetails());
        }
    }
}
