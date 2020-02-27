package dataAccessLayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientDAO {

    private Connection connection;
    private Statement statement;

    public ClientDAO() {
    }

    public void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS client(clientID int unique auto_increment NOT NULL primary key,"
                + "lastName varchar(20) NOT NULL,"
                + "firstName varchar(20) NOT NULL,"
                + "address varchar(20) NOT NULL,"
                + "phone varchar(20) NOT NULL);";
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

    public void insertClient(String lastName, String firstName, String address, String phone_no) {

        String query = "INSERT INTO client(lastName, firstName, address, phone) VALUES (" + "'" + lastName + "'" + ", " + "'" + firstName + "'" + ", " + "'" + address + "'" + ", " + "'" + phone_no + "'" + ")";
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

    public void deleteClient(int clientID) {
        String query = "DELETE FROM client WHERE clientID = " + clientID;
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

    public void updateClient(int clientID, String address, String phone) {
        String query = "UPDATE client SET address = " + "'" + address + "'" + ", " + "phone = " + "'" + phone + "'" + "WHERE clientID = " + clientID;
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

    public void viewClient() {
        String query = "SELECT * FROM client";
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

