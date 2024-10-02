// Main.java

import java.util.*;

/**
 * Main class to simulate the application functionalities.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Admin admin = new Admin(1, "AdminUser", "admin@example.com");
    private static Map<Integer, Musician> musicians = new HashMap<>();
    private static int userIdCounter = 2; // Starting from 2 because Admin is 1
    private static int projectIdCounter = 1;
    private static int musicFileIdCounter = 1;
    private static int contentIdCounter = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to the Online Music Collaboration Platform!");

        while (true) {
            System.out.println("\nSelect User Type:");
            System.out.println("1. Admin");
            System.out.println("2. Musician");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    adminMenu();
                    break;
                case "2":
                    musicianMenu();
                    break;
                case "3":
                    System.out.println("Exiting the application.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Admin Menu
    private static void adminMenu() {
        System.out.println("\n--- Admin Dashboard ---");

        while (true) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. User Management");
            System.out.println("2. Content Moderation");
            System.out.println("3. System Settings");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    adminUserManagement();
                    break;
                case "2":
                    adminContentModeration();
                    break;
                case "3":
                    adminSystemSettings();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void adminUserManagement() {
        while (true) {
            System.out.println("\nUser Management:");
            System.out.println("1. Create User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. List Users");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Musician musician = new Musician(userIdCounter++, name, email);
                    admin.createUser(musician);
                    musicians.put(musician.getId(), musician);
                    break;
                case "2":
                    System.out.print("Enter User ID to update: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    admin.updateUser(updateId, newName, newEmail, "Musician");
                    break;
                case "3":
                    System.out.print("Enter User ID to delete: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    admin.deleteUser(deleteId);
                    musicians.remove(deleteId);
                    break;
                case "4":
                    admin.listUsers();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void adminContentModeration() {
        while (true) {
            System.out.println("\nContent Moderation:");
            System.out.println("1. List Pending Content");
            System.out.println("2. Approve Content");
            System.out.println("3. Reject Content");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    admin.listPendingContent();
                    break;
                case "2":
                    System.out.print("Enter Content ID to approve: ");
                    int approveId = Integer.parseInt(scanner.nextLine());
                    admin.approveContent(approveId);
                    break;
                case "3":
                    System.out.print("Enter Content ID to reject: ");
                    int rejectId = Integer.parseInt(scanner.nextLine());
                    admin.rejectContent(rejectId);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void adminSystemSettings() {
        while (true) {
            System.out.println("\nSystem Settings:");
            System.out.println("1. Update Setting");
            System.out.println("2. View Setting");
            System.out.println("3. Back");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter setting name: ");
                    String settingName = scanner.nextLine();
                    System.out.print("Enter setting value: ");
                    String settingValue = scanner.nextLine();
                    admin.updateSettings(settingName, settingValue);
                    break;
                case "2":
                    System.out.print("Enter setting name: ");
                    String viewSettingName = scanner.nextLine();
                    String value = admin.settings.getSetting(viewSettingName);
                    System.out.println("Setting " + viewSettingName + " = " + value);
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Musician Menu
    private static void musicianMenu() {
        System.out.print("\nEnter Musician User ID: ");
        int musicianId = Integer.parseInt(scanner.nextLine());
        Musician musician = musicians.get(musicianId);

        if (musician == null) {
            System.out.println("Musician not found.");
            return;
        }

        System.out.println("\n--- Musician Dashboard ---");

        while (true) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Project Collaboration");
            System.out.println("2. Share and Edit Music Files");
            System.out.println("3. Manage Music Portfolio");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    musicianProjectCollaboration(musician);
                    break;
                case "2":
                    musicianMusicFiles(musician);
                    break;
                case "3":
                    musicianPortfolio(musician);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void musicianProjectCollaboration(Musician musician) {
        while (true) {
            System.out.println("\nProject Collaboration:");
            System.out.println("1. Create Project");
            System.out.println("2. Add Collaborator to Project");
            System.out.println("3. List Projects");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter project description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter deadline (YYYY-MM-DD): ");
                    String deadline = scanner.nextLine();
                    Project project = new Project(projectIdCounter++, description, deadline);
                    musician.createProject(project);
                    break;
                case "2":
                    System.out.print("Enter Project ID: ");
                    int projectId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Collaborator User ID: ");
                    int collaboratorId = Integer.parseInt(scanner.nextLine());
                    Musician collaborator = musicians.get(collaboratorId);
                    if (collaborator != null) {
                        musician.addCollaboratorToProject(projectId, collaborator);
                    } else {
                        System.out.println("Collaborator not found.");
                    }
                    break;
                case "3":
                    musician.listProjects();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void musicianMusicFiles(Musician musician) {
        while (true) {
            System.out.println("\nMusic Files:");
            System.out.println("1. Upload Music File");
            System.out.println("2. Edit Music File");
            System.out.println("3. List Music Files");
            System.out.println("4. Submit Content for Approval");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter music file name: ");
                    String fileName = scanner.nextLine();
                    MusicFile musicFile = new MusicFile(musicFileIdCounter++, fileName, musician);
                    musician.uploadMusicFile(musicFile);
                    break;
                case "2":
                    System.out.print("Enter Music File ID: ");
                    int fileId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter new content: ");
                    String newContent = scanner.nextLine();
                    musician.editMusicFile(fileId, newContent);
                    break;
                case "3":
                    musician.listMusicFiles();
                    break;
                case "4":
                    System.out.print("Enter Music File ID to submit: ");
                    int contentFileId = Integer.parseInt(scanner.nextLine());
                    Content content = new Content(contentIdCounter++, "Music File ID: " + contentFileId + " by " + musician.getName());
                    admin.addPendingContent(content);
                    System.out.println("Content submitted for approval.");
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void musicianPortfolio(Musician musician) {
        while (true) {
            System.out.println("\nMusic Portfolio:");
            System.out.println("1. Add Music File to Portfolio");
            System.out.println("2. Update Portfolio");
            System.out.println("3. Back");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Music File ID: ");
                    int fileId = Integer.parseInt(scanner.nextLine());
                    for (MusicFile mf : musician.musicFiles) {
                        if (mf.getId() == fileId) {
                            musician.addToPortfolio(mf);
                            break;
                        }
                    }
                    break;
                case "2":
                    musician.updatePortfolio();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
