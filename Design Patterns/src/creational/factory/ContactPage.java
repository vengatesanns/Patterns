package creational.factory;/*
 * @author Vengatesan Nagarajan
 * Design Patterns
 *  23/08/20, 9:05 PM
 */

public class ContactPage extends Pages {

    public ContactPage() {
        this.content();
    }

    @Override
    public void content() {
        this.content = "Contact Details";
    }

    @Override
    public String toString() {
        return "ContactPage{" +
                "content='" + content + '\'' +
                '}';
    }
}
