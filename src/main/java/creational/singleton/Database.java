package creational.singleton;

public class Database {

    private static Database database;

    private Database() {
        System.out.println("Creating database");
    }

    public static Database getInstance() {
        if (Database.database == null) {
            Database.database = new Database();
        }
        return Database.database;
    }

}
