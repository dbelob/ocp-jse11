package acme.tests.chapter15.test15;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Example {
    public static void main(String... args) throws SQLException {
        var url = "jdbc:derby:birds";
        var sql = "SELECT name FROM peacocks WHERE name = ?";
        try (var conn = DriverManager.getConnection(url);
             var stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "Feathers");

//            try (var rs = stmt.execute()) {
            try (var rs = stmt.executeQuery()) {
                System.out.println(rs.next());
            }
        }
    }
}
