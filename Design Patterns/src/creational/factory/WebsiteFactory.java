package creational.factory;/*
 * @author Vengatesan Nagarajan
 * Design Patterns
 *  23/08/20, 9:13 PM
 */

public class WebsiteFactory {

    public static Website getWebsite(String type) {
        Website website = null;
        switch (type) {
            case "BLOG":
                website = new Blog();
                break;
            case "SHOPPING":
                website = new Shopping();
                break;
            default:
                website = null;
        }
        return website;
    }
}
