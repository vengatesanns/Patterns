package creational.singleton;

/**
 * @author Vengatesan Nagarajan
 */
public class DBConnection {

    // Lazy Loading
    private static DBConnection dbConnection = null;

    // Blocks the object creation
    private DBConnection() {
        // To avoid reflections
        if (dbConnection != null) {
            throw new RuntimeException("Use getInstance to create object");
        }
    }

    // Thread Safe
    public static DBConnection getInstance() {
        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }

}
