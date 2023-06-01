import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "(YOURPASSWORD)");
        System.out.println("Abriu conexão");
        connection.close();
        System.out.println("Fechou conexão");
    }
}