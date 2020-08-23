package creational.prototype;

/**
 * @author Vengatesan Nagarajan
 */
public class Employee extends Organization {

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                '}';
    }
}
