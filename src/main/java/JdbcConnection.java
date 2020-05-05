import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcConnection {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/umuzi", "user", "password");
            System.out.println("Opened database successfully");
            stmt = c.createStatement();


        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }



    }
}