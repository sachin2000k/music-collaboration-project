// User.java

/**
 * Abstract class representing a general user.
 */
public abstract class User {
    protected int id;
    protected String name;
    protected String email;
    protected String role;

    public User(int id, String name, String email, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getRole() { return role; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setRole(String role) { this.role = role; }
}
