import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DatabaseExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "myuser";
        String password = "mypassword";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Соединение успешно установлено!");

                // Пример SELECT-запроса
                String selectQuery = "SELECT id, name, age FROM users";
                PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
                ResultSet resultSet = selectStatement.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
                }

                resultSet.close();
                selectStatement.close();

                // Пример INSERT-запроса
                String insertQuery = "INSERT INTO users (name, age) VALUES (?, ?)";
                PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                insertStatement.setString(1, "John Doe");
                insertStatement.setInt(2, 30);
                int rowsInserted = insertStatement.executeUpdate();
                System.out.println("Добавлено строк: " + rowsInserted);
                insertStatement.close();

                // Пример UPDATE-запроса
                String updateQuery = "UPDATE users SET age = ? WHERE name = ?";
                PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                updateStatement.setInt(1, 31);
                updateStatement.setString(2, "John Doe");
                int rowsUpdated = updateStatement.executeUpdate();
                System.out.println("Обновлено строк: " + rowsUpdated);
                updateStatement.close();

                // Пример DELETE-запроса
                String deleteQuery = "DELETE FROM users WHERE name = ?";
                PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                deleteStatement.setString(1, "John Doe");
                int rowsDeleted = deleteStatement.executeUpdate();
                System.out.println("Удалено строк: " + rowsDeleted);
                deleteStatement.close();

                connection.close();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Драйвер JDBC не найден!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Ошибка при работе с базой данных!");
            e.printStackTrace();
        }
    }
}
