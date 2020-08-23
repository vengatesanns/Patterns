package creational.singleton;

public class Singleton {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        long startTime = System.currentTimeMillis();
        DBConnection dbConnection1 = DBConnection.getInstance();
        long endTime = System.currentTimeMillis();
        System.out.println(dbConnection1);
        System.out.println(endTime - startTime);

        long startTime1 = System.currentTimeMillis();
        DBConnection dbConnection2 = DBConnection.getInstance();
        long endTime1 = System.currentTimeMillis();
        System.out.println(dbConnection2);
        System.out.println(endTime1 - startTime1);
    }
}