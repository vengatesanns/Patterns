package creational.factory;/*
 * @author Vengatesan Nagarajan
 * Design Patterns
 *  23/08/20, 9:12 PM
 */

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }

    @Override
    public String toString() {
        return "Blog{" +
                "pages=" + pages +
                '}';
    }
}
