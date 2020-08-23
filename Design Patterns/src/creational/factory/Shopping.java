package creational.factory;/*
 * @author Vengatesan Nagarajan
 * Design Patterns
 *  23/08/20, 9:11 PM
 */

public class Shopping extends Website {

    @Override
    public void createWebsite() {
        pages.add(new ContactPage());
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "pages=" + pages +
                '}';
    }
}
