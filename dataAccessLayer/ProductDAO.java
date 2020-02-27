package dataAccessLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDAO {

    private Connection connection;
    private Statement statement;

    public ProductDAO() {

    }

    public void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS product(productID int unique auto_increment NOT NULL primary key,"
                + "productName varchar(20) NOT NULL,"
                + "price float NOT NULL,"
                + "quantity int NOT NULL);";
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

    public void insertProduct(String productName, float price, int quantity) {
        String query = "INSERT INTO product(productName, price, quantity) VALUES (" + "'" + productName + "'" + ", " + price + ", " + quantity + ");";
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            System.out.println(statement.toString());
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(statement);
            DbUtil.close(connection);
        }
    }

    public void deleteProduct(int productID) {
        String query = "DELETE FROM product WHERE productID = " + productID;
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

    public void updateProduct(int productID, float price, int quantity) {
        String query = "UPDATE product SET price = " + "'" + price + "'" + ", " + "quantity = " + "'" + quantity + "'" + "WHERE productID = " + productID;
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

    public int selectQuantity(int productID) {
        String query = "SELECT quantity FROM product WHERE productID = " + productID;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            //statement.executeUpdate(query);
            if (rs.next()) {
                int quantity = rs.getInt(1);
                return quantity;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(statement);
            DbUtil.close(connection);

        }
        return -1;
    }

    public float selectPrice(int productID) {
        String query = "SELECT price FROM product WHERE productID = " + productID;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            //statement.executeUpdate(query);
            if (rs.next()) {
                float price = rs.getFloat(1);
                return price;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.close(statement);
            DbUtil.close(connection);

        }
        return -1;
    }
}
