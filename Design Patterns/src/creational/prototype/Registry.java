package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vengatesan Nagarajan
 */
public class Registry {

    Map<String, Organization> registry = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    private void initialize() {
        Employee emp = new Employee();
        emp.setRole("Developer");
        registry.put("EMPLOYEE", emp);

        Student std = new Student();
        std.setRole("Internship");
        registry.put("STUDENT", std);

    }

    public Organization getInstance(String type) throws CloneNotSupportedException {
        return (Organization) this.registry.get(type).clone();
    }

}
