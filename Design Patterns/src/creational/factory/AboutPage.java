package creational.factory;/*
 * @author Vengatesan Nagarajan
 * Design Patterns
 *  23/08/20, 9:06 PM
 */

public class AboutPage extends Pages {

    public AboutPage() {
        this.content();
    }

    @Override
    public void content() {
        this.content = "About Info";
    }

    @Override
    public String toString() {
        return "AboutPage{" +
                "content='" + content + '\'' +
                '}';
    }
}
