package dataAccessLayer;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseDAO {
    private Connection connection;
    private Statement statement;


    public DatabaseDAO() {

    }

    public void createDatabase(String dbName) {
        String query = "CREATE DATABASE IF NOT EXISTS " + dbName;
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