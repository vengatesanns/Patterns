package creational.builder;

/**
 * @author Vengatesan Nagarajan
 */
public class Organization {

    public static void main(String[] args) {
        Employee emp1 = new Employee.Education().sslc(78).hsc(75).percentage();
        Employee emp2 = new Employee.Education().pg(85).ug(90).sslc(76).hsc(79).percentage();

        System.out.println(emp1);
        System.out.println(emp2);
    }

}
