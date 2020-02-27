package Main;

import businessLayer.Client;
import businessLayer.Order;
import businessLayer.Product;
import dataAccessLayer.*;
import PresentationLayer.*;
import Controller.*;

public class MainClass {
    public static void main(String[] args) {
        View v = new View();
        Client c = new Client();
        ClientDAO cd = new ClientDAO();
        cd.createTable();
        Product p = new Product();
        ProductDAO pd = new ProductDAO();
        pd.createTable();
        Order o = new Order();
        OrderDAO od = new OrderDAO();
        od.createTable();
        Controller controller = new Controller(v, c, cd, p, pd, o, od);
    }
}
