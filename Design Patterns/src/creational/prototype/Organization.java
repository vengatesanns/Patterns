package creational.prototype;


/**
 * @author Vengatesan Nagarajan
 */
public abstract class Organization implements Cloneable {

    String name;
    String location;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
