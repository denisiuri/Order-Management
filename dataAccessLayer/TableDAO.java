package dataAccessLayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableDAO {

    private Connection connection;
    private Statement statement;

    public TableDAO() {

    }

    public void createTable(String tableName) {
        String query = "CREATE TABLE IF NOT EXISTS " + tableName;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
    }
}
