package creational.prototype;

/**
 * @author Vengatesan Nagarajan
 */
public class Project {

    public static void main(String[] args) throws CloneNotSupportedException {
        Registry registry = new Registry();
        Employee emp1 = (Employee) registry.getInstance("EMPLOYEE");
        System.out.println(emp1);
        emp1.setRole("Tester");
        System.out.println(emp1);
        Employee emp2 = (Employee) registry.getInstance("EMPLOYEE");
        System.out.println(emp2);

        Student std1 = (Student) registry.getInstance("STUDENT");
        System.out.println(std1);
        std1.setRole("Training");
        System.out.println(std1);
        Student std2 = (Student) registry.getInstance("STUDENT");
        System.out.println(std2);
    }
}
