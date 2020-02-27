package dataAccessLayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderDAO {

    private Connection connection;
    private Statement statement;

    public OrderDAO() {

    }

    public void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS orders(orderID int unique auto_increment NOT NULL primary key,"
                + "clientID int NOT NULL,"
                + "productID int NOT NULL,"
                + "quantity int NOT NULL,"
                + "FOREIGN KEY (clientID) REFERENCES client(clientID),"
                + "FOREIGN KEY (productID) REFERENCES product(productID));";
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

    public void insertOrder(int clientID, int productID, int quantity) {
        String query = "INSERT INTO orders(clientID, productID, quantity) VALUES ("  + clientID + ", " + productID + ", " + quantity + ");";
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

    public void deleteOrder(int orderID) {
        String query = "DELETE FROM orders WHERE productID = " + orderID;
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

    public void updateOrder(int orderID, int clientID, int productID, int quantity) {
        String query = "UPDATE orders SET clientID = " + clientID + ", " + "productID = " + productID + ", " + "quantity = " + quantity + "WHERE orderID = " + orderID;
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
