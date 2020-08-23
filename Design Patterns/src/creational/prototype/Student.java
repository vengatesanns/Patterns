package creational.prototype;

/**
 * @author Vengatesan Nagarajan
 */
public class Student extends Organization {

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Student{" +
                "role='" + role + '\'' +
                '}';
    }
}
