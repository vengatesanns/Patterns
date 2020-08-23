package creational.factory;/*
 * @author Vengatesan Nagarajan
 * Design Patterns
 *  23/08/20, 9:18 PM
 */

public class WebsiteBuilder {
    public static void main(String[] args) {
        Website website1 = WebsiteFactory.getWebsite("BLOG");
        System.out.println(website1);

        Website website2 = WebsiteFactory.getWebsite("SHOPPING");
        System.out.println(website2);
    }
}
