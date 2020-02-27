package Controller;

import businessLayer.Client;
import businessLayer.Order;
import businessLayer.Product;
import dataAccessLayer.*;
import PresentationLayer.*;

import javax.swing.*;
import java.awt.event.*;

public class Controller {
    private Client client;
    private View view;
    private ClientDAO clientDAO;
    private Product product;
    private ProductDAO productDAO;
    private Order order;
    private OrderDAO orderDAO;

    public Controller(View v, Client c, ClientDAO cD, Product p, ProductDAO pD, Order o, OrderDAO oD) {
        client = c;
        view = v;
        clientDAO = cD;
        product = p;
        productDAO = pD;
        order = o;
        orderDAO = oD;

        v.addClientListener(new addClientListener());
        v.deleteClientListener(new deleteClientListener());
        v.updateClientListener(new updateClientListener());
        v.addProductListener(new addProductListener());
        v.deleteProductListener(new deleteProductListener());
        v.updateProductListener(new updateProductListener());
        v.addOrderListener(new addOrderListener());
        v.delOrderListener(new delOrderListener());
        v.updateOrderListener(new updateOrderListener());
    }

    class addClientListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                client.setLastName(view.getLastNameTextField().getText());
                client.setFirstName(view.getFirstNameTextField().getText());
                client.setAddress(view.getAddressTextField().getText());
                client.setPhone_no(view.getPhoneTextField().getText());

                clientDAO.insertClient(client.getLastName(), client.getFirstName(), client.getAddress(), client.getPhone_no());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class deleteClientListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                client.setClient_id(Integer.parseInt(view.getIdTextField().getText()));
                clientDAO.deleteClient(client.getClient_id());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class updateClientListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                client.setClient_id(Integer.parseInt(view.getUpdateClientIDTextField().getText()));
                client.setAddress(view.getUpdateAddressTextField().getText());
                client.setPhone_no(view.getUpdatePhoneTextField().getText());

                clientDAO.updateClient(client.getClient_id(), client.getAddress(), client.getPhone_no());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class addProductListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                product.setProduct_name(view.getProductNameTextField().getText());
                product.setPrice(Float.parseFloat(view.getPriceTextField().getText()));
                product.setQuantity(Integer.parseInt(view.getQuantityTextField().getText()));

                productDAO.insertProduct(product.getProduct_name(), product.getPrice(), product.getQuantity());

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class deleteProductListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                product.setProduct_id(Integer.parseInt(view.getIdProductTextField().getText()));

                productDAO.deleteProduct(product.getProduct_id());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class updateProductListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                product.setProduct_id(Integer.parseInt(view.getUpdateProductIDTextField().getText()));
                product.setPrice(Float.parseFloat(view.getUpdatePriceTextField().getText()));
                product.setQuantity(Integer.parseInt(view.getUpdateQuantityTextField().getText()));

                productDAO.updateProduct(product.getProduct_id(), product.getPrice(), product.getQuantity());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class addOrderListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int quantity;
                int newQuantity;
                float price;
                order.setClientID(Integer.parseInt(view.getClientIDTextField().getText()));
                order.setProductID(Integer.parseInt(view.getProductIDTextField().getText()));
                order.setQuantity(Integer.parseInt(view.getQuantityOrderTextField().getText()));


                product.setProduct_id(order.getProductID());
                quantity = productDAO.selectQuantity(product.getProduct_id());
                price = productDAO.selectPrice(product.getProduct_id());
                if(quantity < order.getQuantity())
                {
                    JOptionPane optionPane = new JOptionPane("Under stock !", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Failure");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }
                else {
                    newQuantity = quantity - order.getQuantity();
                    orderDAO.insertOrder(order.getClientID(), order.getProductID(), order.getQuantity());
                    productDAO.updateProduct(order.getProductID(), price, newQuantity);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class delOrderListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                order.setOrderID(Integer.parseInt(view.getIdOrderTextField().getText()));

                orderDAO.deleteOrder(order.getOrderID());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class updateOrderListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                order.setOrderID(Integer.parseInt(view.getUpdateOrderIDTextField().getText()));
                order.setClientID(Integer.parseInt(view.getUpdateOrderClientIDTextField().getText()));
                order.setProductID(Integer.parseInt(view.getUpdateOrderProductIDTextField().getText()));
                order.setQuantity(Integer.parseInt(view.getUpdateOrderQuantityTextField().getText()));

                orderDAO.updateOrder(order.getOrderID(), order.getClientID(), order.getProductID(), order.getQuantity());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

