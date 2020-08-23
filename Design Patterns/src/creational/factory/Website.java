package creational.factory;/*
 * @author Vengatesan Nagarajan
 * Design Patterns
 *  23/08/20, 9:08 PM
 */

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    List<Pages> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();
}
