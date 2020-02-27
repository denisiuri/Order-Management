package PresentationLayer;

import dataAccessLayer.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class View extends JFrame {
    private JPanel panel = new JPanel();
    private JPanel clientPanel = new JPanel();
    private JPanel productPanel = new JPanel();
    private JPanel orderPanel = new JPanel();

    private JPanel addClientPanel = new JPanel();
    private JPanel deleteClientPanel = new JPanel();
    private JPanel editClientPanel = new JPanel();

    private JPanel addProductPanel = new JPanel();
    private JPanel deleteProductPanel = new JPanel();
    private JPanel editProductPanel = new JPanel();

    private JPanel addOrderPanel = new JPanel();
    private JPanel deleteOrderPanel = new JPanel();
    private JPanel editOrderPanel = new JPanel();

    private JButton clientButton;
    private JButton productButton;
    private JButton orderButton;
    private JButton enterClientButton;
    private JButton enterProductButton;
    private JButton delOrderButton;

    private JButton delProductButton;

    private JButton addClientButton;
    private JButton deleteClientButton;
    private JButton editClientButton;
    private JButton viewClientButton;

    private JButton addProductButton;
    private JButton deleteProductButton;
    private JButton editProductButton;
    private JButton viewProductButton;

    private JButton addOrderButton;
    private JButton deleteOrderButton;
    private JButton editOrderButton;
    private JButton viewOrderButton;
    private JButton deleteButton;
    private JButton updateClientButton;
    private JButton updateProductButton;
    private JButton updateOrderButton;

    private JButton backAddClientButton;
    private JButton backAddProductButton;
    private JButton backAddOrderButton;

    private JButton backDelClientButton;
    private JButton backDelProductButton;
    private JButton backDelOrderButton;

    private JButton backEditClientButton;
    private JButton backEditProductButton;
    private JButton backEditOrderButton;

    private JButton backViewClientButton;
    private JButton backViewProductButton;
    private JButton backViewOrderButton;

    private JButton backClientButton;
    private JButton backProductButton;
    private JButton backOrderButton;

    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField addressTextField;
    private JTextField phoneTextField;

    private JTextField productNameTextField;
    private JTextField priceTextField;
    private JTextField quantityTextField;

    private JTextField clientIDTextField;
    private JTextField productIDTextField;
    private JTextField quantityOrderTextField;
    private JButton enterOrderButton;

    private JTextField updateProductIDTextField;
    private JTextField updatePriceTextField;
    private JTextField updateQuantityTextField;

    private JTextField updateClientIDTextField;
    private JTextField updateAddressTextField;
    private JTextField updatePhoneTextField;

    private JTextField updateOrderIDTextField;
    private JTextField updateOrderClientIDTextField;
    private JTextField updateOrderProductIDTextField;
    private JTextField updateOrderQuantityTextField;

    private JTextField idOrderTextField;
    private JTextField idTextField;
    private JTextField idProductTextField;

    private ViewClient viewClientPanel = new ViewClient();
    private ViewProduct viewProductPanel = new ViewProduct();
    private ViewOrders viewOrdersPanel = new ViewOrders();

    public JTextField getClientIDTextField() {
        return clientIDTextField;
    }

    public JTextField getProductIDTextField() {
        return productIDTextField;
    }

    public JTextField getQuantityOrderTextField() {
        return quantityOrderTextField;
    }

    public JTextField getUpdateOrderIDTextField() {
        return updateOrderIDTextField;
    }

    public JTextField getUpdateOrderClientIDTextField() {
        return updateOrderClientIDTextField;
    }

    public JTextField getUpdateOrderProductIDTextField() {
        return updateOrderProductIDTextField;
    }

    public JTextField getUpdateOrderQuantityTextField() {
        return updateOrderQuantityTextField;
    }

    public JTextField getFirstNameTextField() {
        return firstNameTextField;
    }

    public JTextField getLastNameTextField() {
        return lastNameTextField;
    }

    public JTextField getAddressTextField() {
        return addressTextField;
    }

    public JTextField getPhoneTextField() {
        return phoneTextField;
    }

    public JTextField getIdTextField() {
        return idTextField;
    }

    public JTextField getUpdateClientIDTextField() {
        return updateClientIDTextField;
    }

    public JTextField getUpdateAddressTextField() {
        return updateAddressTextField;
    }

    public JTextField getUpdatePhoneTextField() {
        return updatePhoneTextField;
    }

    public JTextField getProductNameTextField() {
        return productNameTextField;
    }

    public JTextField getIdOrderTextField() {
        return idOrderTextField;
    }

    public JTextField getPriceTextField() {
        return priceTextField;
    }

    public JTextField getQuantityTextField() {
        return quantityTextField;
    }

    public JTextField getIdProductTextField() {
        return idProductTextField;
    }

    public JTextField getUpdateProductIDTextField() {
        return updateProductIDTextField;
    }

    public JTextField getUpdatePriceTextField() {
        return updatePriceTextField;
    }

    public JTextField getUpdateQuantityTextField() {
        return updateQuantityTextField;
    }

    public View() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 640, 450);
        this.setTitle("Warehouse");

        //Main Panel
        panel.setBounds(0, 0, 640, 450);
        this.add(panel);
        panel.setLayout(null);

        clientButton = new JButton("Client");
        clientButton.setBounds(245, 70, 116, 22);
        panel.add(clientButton);
        clientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                clientPanel.setVisible(true);
            }
        });

        productButton = new JButton("Product");
        productButton.setBounds(245, 140, 116, 22);
        panel.add(productButton);
        productButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                productPanel.setVisible(true);
            }
        });

        orderButton = new JButton("Order");
        orderButton.setBounds(245, 210,116, 22);
        panel.add(orderButton);
        this.setVisible(true);
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                orderPanel.setVisible(true);
            }
        });

        //Client panel
        clientPanel.setBounds(0, 0, 640, 450);
        this.add(clientPanel);
        clientPanel.setLayout(null);
        clientPanel.setVisible(false);

        addClientButton = new JButton("Add Client");
        addClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clientPanel.setVisible(false);
                addClientPanel.setVisible(true);
            }
        });
        addClientButton.setBounds(270, 80, 97, 25);
        clientPanel.add(addClientButton);

        deleteClientButton = new JButton("Delete Client");
        deleteClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clientPanel.setVisible(false);
                deleteClientPanel.setVisible(true);
            }
        });
        deleteClientButton.setBounds(270, 150, 97, 25);
        clientPanel.add(deleteClientButton);

        editClientButton = new JButton("Edit Client");
        editClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clientPanel.setVisible(false);
                editClientPanel.setVisible(true);
            }
        });
        editClientButton.setBounds(270, 220, 97, 25);
        clientPanel.add(editClientButton);

        viewClientButton = new JButton("View Client");
        viewClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clientPanel.setVisible(false);
                viewClientPanel.setVisible(true);
            }
        });
        viewClientButton.setBounds(270, 290, 97, 25);
        clientPanel.add(viewClientButton);

        backClientButton = new JButton("Back");
        backClientButton.setBounds(12, 13, 97, 25);
        clientPanel.add(backClientButton);
        backClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clientPanel.setVisible(false);
                panel.setVisible(true);
            }
        });

        //Add client Panel
        addClientPanel.setBounds(0, 0, 640, 450);
        this.add(addClientPanel);
        addClientPanel.setLayout(null);
        addClientPanel.setVisible(false);

        JLabel lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setBounds(188, 95, 56, 16);
        addClientPanel.add(lastNameLabel);

        JLabel firstNameLabel = new JLabel("First Name");
        firstNameLabel.setBounds(188, 145, 56, 16);
        addClientPanel.add(firstNameLabel);

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(188, 195, 56, 16);
        addClientPanel.add(addressLabel);

        JLabel phoneNoLabel = new JLabel("Phone");
        phoneNoLabel.setBounds(188, 245, 56, 16);
        addClientPanel.add(phoneNoLabel);

        firstNameTextField = new JTextField();
        firstNameTextField.setBounds(283, 95, 116, 22);
        addClientPanel.add(firstNameTextField);

        lastNameTextField = new JTextField();
        lastNameTextField.setBounds(283, 145, 116, 22);
        addClientPanel.add(lastNameTextField);

        addressTextField = new JTextField();
        addressTextField.setBounds(283, 195, 116, 22);
        addClientPanel.add(addressTextField);

        phoneTextField = new JTextField();
        phoneTextField.setBounds(283, 245, 116, 22);
        addClientPanel.add(phoneTextField);

        enterClientButton = new JButton("Enter");
        enterClientButton.setBounds(290, 321, 97, 25);
        addClientPanel.add(enterClientButton);

        backAddClientButton = new JButton("Back");
        backAddClientButton.setBounds(12, 13, 97, 25);
        addClientPanel.add(backAddClientButton);
        backAddClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addClientPanel.setVisible(false);
                clientPanel.setVisible(true);
            }
        });

        //Delete client
        deleteClientPanel.setBounds(0, 0, 640, 450);
        this.add(deleteClientPanel);
        deleteClientPanel.setLayout(null);
        deleteClientPanel.setVisible(false);

        JLabel idLabel = new JLabel("ID");
        idLabel.setBounds(317, 125, 71, 16);
        deleteClientPanel.add(idLabel);

        idTextField = new JTextField();
        idTextField.setBounds(268, 165, 116, 22);
        deleteClientPanel.add(idTextField);
        idTextField.setColumns(10);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(275, 205, 97, 25);
        deleteClientPanel.add(deleteButton);

        JLabel deleteLabel = new JLabel("Introduceti id-ul persoanei pe care doriti sa o stergeti");
        deleteLabel.setBounds(170, 85, 310, 16);
        deleteClientPanel.add(deleteLabel);

        backDelClientButton = new JButton("Back");
        backDelClientButton.setBounds(12, 13, 97, 25);
        deleteClientPanel.add(backDelClientButton);
        backDelClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteClientPanel.setVisible(false);
                clientPanel.setVisible(true);
            }
        });

        //Update client
        editClientPanel.setBounds(0, 0, 640, 450);
        this.add(editClientPanel);
        editClientPanel.setLayout(null);
        editClientPanel.setVisible(false);

        updateClientIDTextField = new JTextField();
        updateClientIDTextField.setBounds(283, 95, 116, 22);
        editClientPanel.add(updateClientIDTextField);

        updateAddressTextField = new JTextField();
        updateAddressTextField.setBounds(283, 145, 116, 22);
        editClientPanel.add(updateAddressTextField);

        updatePhoneTextField = new JTextField();
        updatePhoneTextField.setBounds(283, 195, 116, 22);
        editClientPanel.add(updatePhoneTextField);

        updateClientButton = new JButton("Update");
        updateClientButton.setBounds(290, 235, 97, 25);
        editClientPanel.add(updateClientButton);

        JLabel updateIDClientLabel = new JLabel("Client ID");
        updateIDClientLabel.setBounds(188, 95, 56, 16);
        editClientPanel.add(updateIDClientLabel);

        JLabel updateAddressLabel = new JLabel("Address");
        updateAddressLabel.setBounds(188, 145, 56, 16);
        editClientPanel.add(updateAddressLabel);

        JLabel updatePhoneLabel = new JLabel("Phone");
        updatePhoneLabel.setBounds(188, 195, 56, 16);
        editClientPanel.add(updatePhoneLabel);

        backEditClientButton = new JButton("Back");
        backEditClientButton.setBounds(12, 13, 97, 25);
        editClientPanel.add(backEditClientButton);
        backEditClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editClientPanel.setVisible(false);
                clientPanel.setVisible(true);
            }
        });

        //View Clients
        viewClientPanel.setBounds(0, 0, 640, 450);
        this.add(viewClientPanel);
        viewClientPanel.setLayout(null);
        viewClientPanel.setVisible(false);

        viewClientPanel.getViewButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewClientPanel.printTable();
            }

        });

        backViewClientButton = new JButton("Back");
        backViewClientButton.setBounds(12, 13, 97, 25);
        viewClientPanel.add(backViewClientButton);
        backViewClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewClientPanel.setVisible(false);
                clientPanel.setVisible(true);
            }
        });

        backViewClientButton = new JButton("Back");
        backViewClientButton.setBounds(12, 13, 97, 25);
        viewClientPanel.add(backViewClientButton);
        backViewClientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewClientPanel.setVisible(false);
                clientPanel.setVisible(true);
            }
        });
        //Product panel
        productPanel.setBounds(0, 0, 640, 450);
        this.add(productPanel);
        productPanel.setLayout(null);
        productPanel.setVisible(false);

        addProductButton = new JButton("Add Product");
        addProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                productPanel.setVisible(false);
                addProductPanel.setVisible(true);
            }
        });
        addProductButton.setBounds(270, 80, 110, 25);
        productPanel.add(addProductButton);

        deleteProductButton = new JButton("Delete Product");
        deleteProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                productPanel.setVisible(false);
                deleteProductPanel.setVisible(true);
            }
        });
        deleteProductButton.setBounds(270, 150, 110, 25);
        productPanel.add(deleteProductButton);

        editProductButton = new JButton("Edit Product");
        editProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                productPanel.setVisible(false);
                editProductPanel.setVisible(true);
            }
        });
        editProductButton.setBounds(270, 220, 110, 25);
        productPanel.add(editProductButton);

        viewProductButton = new JButton("View Product");
        viewProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                productPanel.setVisible(false);
                viewProductPanel.setVisible(true);
            }
        });
        viewProductButton.setBounds(270, 290, 110, 25);
        productPanel.add(viewProductButton);

        backProductButton = new JButton("Back");
        backProductButton.setBounds(12, 13, 97, 25);
        productPanel.add(backProductButton);
        backProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                productPanel.setVisible(false);
                panel.setVisible(true);
            }
        });

        //Add product
        addProductPanel.setBounds(0, 0, 640, 450);
        this.add(addProductPanel);
        addProductPanel.setLayout(null);
        addProductPanel.setVisible(false);

        JLabel productNameLabel = new JLabel("Product Name");
        productNameLabel.setBounds(188, 95, 56, 16);
        addProductPanel.add(productNameLabel);

        JLabel priceLabel = new JLabel("Price");
        priceLabel.setBounds(188, 145, 56, 16);
        addProductPanel.add(priceLabel);

        JLabel quantityLabel = new JLabel("Quantity");
        quantityLabel.setBounds(188, 195, 56, 16);
        addProductPanel.add(quantityLabel);

        productNameTextField = new JTextField();
        productNameTextField.setBounds(283, 95, 116, 22);
        addProductPanel.add(productNameTextField);

        priceTextField = new JTextField();
        priceTextField.setBounds(283, 145, 116, 22);
        addProductPanel.add(priceTextField);

        quantityTextField = new JTextField();
        quantityTextField.setBounds(283, 195, 116, 22);
        addProductPanel.add(quantityTextField);

        enterProductButton = new JButton("Enter");
        enterProductButton.setBounds(290, 235, 97, 25);
        addProductPanel.add(enterProductButton);

        backAddProductButton = new JButton("Back");
        backAddProductButton.setBounds(12, 13, 97, 25);
        addProductPanel.add(backAddProductButton);
        backAddProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addProductPanel.setVisible(false);
                productPanel.setVisible(true);
            }
        });

        //Delete product
        deleteProductPanel.setBounds(0, 0, 640, 450);
        this.add(deleteProductPanel);
        deleteProductPanel.setLayout(null);
        deleteProductPanel.setVisible(false);

        JLabel idProductLabel = new JLabel("ID");
        idProductLabel.setBounds(317, 125, 71, 16);
        deleteProductPanel.add(idProductLabel);

        idProductTextField = new JTextField();
        idProductTextField.setBounds(268, 165, 116, 22);
        deleteProductPanel.add(idProductTextField);

        delProductButton = new JButton("Delete");
        delProductButton.setBounds(275, 205, 97, 25);
        deleteProductPanel.add(delProductButton);

        JLabel deleteProductLabel = new JLabel("Introduceti id-ul produsului pe care doriti sa il stergeti");
        deleteProductLabel.setBounds(170, 85, 310, 16);
        deleteProductPanel.add(deleteProductLabel);

        backDelProductButton = new JButton("Back");
        backDelProductButton.setBounds(12, 13, 97, 25);
        deleteProductPanel.add(backDelProductButton);
        backDelProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteProductPanel.setVisible(false);
                productPanel.setVisible(true);
            }
        });
        //Update product
        editProductPanel.setBounds(0, 0, 640, 450);
        this.add(editProductPanel);
        editProductPanel.setLayout(null);
        editProductPanel.setVisible(false);

        updateProductIDTextField = new JTextField();
        updateProductIDTextField.setBounds(283, 95, 116, 22);
        editProductPanel.add(updateProductIDTextField);

        updatePriceTextField = new JTextField();
        updatePriceTextField.setBounds(283, 145, 116, 22);
        editProductPanel.add(updatePriceTextField);

        updateQuantityTextField = new JTextField();
        updateQuantityTextField.setBounds(283, 195, 116, 22);
        editProductPanel.add(updateQuantityTextField);

        updateProductButton = new JButton("Update");
        updateProductButton.setBounds(290, 235, 97, 25);
        editProductPanel.add(updateProductButton);

        JLabel updateIDProductLabel = new JLabel("Product ID");
        updateIDProductLabel.setBounds(188, 95, 56, 16);
        editProductPanel.add(updateIDProductLabel);

        JLabel updatePriceLabel = new JLabel("Price");
        updatePriceLabel.setBounds(188, 145, 56, 16);
        editProductPanel.add(updatePriceLabel);

        JLabel updateQuantityLabel = new JLabel("Quantity");
        updateQuantityLabel.setBounds(188, 195, 56, 16);
        editProductPanel.add(updateQuantityLabel);

        backEditProductButton = new JButton("Back");
        backEditProductButton.setBounds(12, 13, 97, 25);
        editProductPanel.add(backEditProductButton);
        backEditProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editProductPanel.setVisible(false);
                productPanel.setVisible(true);
            }
        });

        //View Product
        viewProductPanel.setBounds(0, 0, 640, 450);
        this.add(viewProductPanel);
        viewProductPanel.setLayout(null);
        viewProductPanel.setVisible(false);

        viewProductPanel.getViewButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewProductPanel.printTable();
            }

        });

        backViewProductButton = new JButton("Back");
        backViewProductButton.setBounds(12, 13, 97, 25);
        viewProductPanel.add(backViewProductButton);
        backViewProductButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewProductPanel.setVisible(false);
                productPanel.setVisible(true);
            }
        });

        //Order panel
        orderPanel.setBounds(0, 0, 640, 450);
        this.add(orderPanel);
        orderPanel.setLayout(null);
        orderPanel.setVisible(false);

        addOrderButton = new JButton("Add Order");
        addOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                orderPanel.setVisible(false);
                addOrderPanel.setVisible(true);
            }
        });
        addOrderButton.setBounds(270, 80, 110, 25);
        orderPanel.add(addOrderButton);

        deleteOrderButton = new JButton("Delete Order");
        deleteOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                orderPanel.setVisible(false);
                deleteOrderPanel.setVisible(true);
            }
        });
        deleteOrderButton.setBounds(270, 150, 110, 25);
        orderPanel.add(deleteOrderButton);

        editOrderButton = new JButton("Edit Order");
        editOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                orderPanel.setVisible(false);
                editOrderPanel.setVisible(true);
            }
        });
        editOrderButton.setBounds(270, 220, 110, 25);
        orderPanel.add(editOrderButton);

        viewOrderButton = new JButton("View Order");
        viewOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                orderPanel.setVisible(false);
                viewOrdersPanel.setVisible(true);
            }
        });
        viewOrderButton.setBounds(270, 290, 110, 25);
        orderPanel.add(viewOrderButton);

        backOrderButton = new JButton("Back");
        backOrderButton.setBounds(12, 13, 97, 25);
        orderPanel.add(backOrderButton);
        backOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                orderPanel.setVisible(false);
                panel.setVisible(true);
            }
        });

        //Add order Panel
        addOrderPanel.setBounds(0, 0, 640, 450);
        this.add(addOrderPanel);
        addOrderPanel.setLayout(null);
        addOrderPanel.setVisible(false);

        JLabel clientIDLabel = new JLabel("Client ID");
        clientIDLabel.setBounds(188, 95, 56, 16);
        addOrderPanel.add(clientIDLabel);

        JLabel productIDLabel = new JLabel("Product ID");
        productIDLabel.setBounds(188, 145, 56, 16);
        addOrderPanel.add(productIDLabel);

        JLabel quantityOrderLabel = new JLabel("Quantity");
        quantityOrderLabel.setBounds(188, 195, 56, 16);
        addOrderPanel.add(quantityOrderLabel);

        clientIDTextField = new JTextField();
        clientIDTextField.setBounds(283, 95, 116, 22);
        addOrderPanel.add(clientIDTextField);

        productIDTextField = new JTextField();
        productIDTextField.setBounds(283, 145, 116, 22);
        addOrderPanel.add(productIDTextField);

        quantityOrderTextField = new JTextField();
        quantityOrderTextField.setBounds(283, 195, 116, 22);
        addOrderPanel.add(quantityOrderTextField);

        enterOrderButton = new JButton("Enter");
        enterOrderButton.setBounds(290, 255, 97, 25);
        addOrderPanel.add(enterOrderButton);

        backAddOrderButton = new JButton("Back");
        backAddOrderButton.setBounds(12, 13, 97, 25);
        addOrderPanel.add(backAddOrderButton);
        backAddOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addOrderPanel.setVisible(false);
                orderPanel.setVisible(true);
            }
        });

        //Delete order
        deleteOrderPanel.setBounds(0, 0, 640, 450);
        this.add(deleteOrderPanel);
        deleteOrderPanel.setLayout(null);
        deleteOrderPanel.setVisible(false);

        JLabel idOrderLabel = new JLabel("ID");
        idOrderLabel.setBounds(317, 125, 71, 16);
        deleteOrderPanel.add(idOrderLabel);

        idOrderTextField = new JTextField();
        idOrderTextField.setBounds(268, 165, 116, 22);
        deleteOrderPanel.add(idOrderTextField);

        delOrderButton = new JButton("Delete");
        delOrderButton.setBounds(275, 205, 97, 25);
        deleteOrderPanel.add(delOrderButton);

        JLabel deleteOrderLabel = new JLabel("Introduceti id-ul comenzii pe care doriti sa o stergeti");
        deleteOrderLabel.setBounds(170, 85, 310, 16);
        deleteOrderPanel.add(deleteOrderLabel);

        backDelOrderButton = new JButton("Back");
        backDelOrderButton.setBounds(12, 13, 97, 25);
        deleteOrderPanel.add(backDelOrderButton);
        backDelOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteOrderPanel.setVisible(false);
                orderPanel.setVisible(true);
            }
        });

        //Update order
        editOrderPanel.setBounds(0, 0, 640, 450);
        this.add(editOrderPanel);
        editOrderPanel.setLayout(null);
        editOrderPanel.setVisible(false);

        updateOrderIDTextField = new JTextField();
        updateOrderIDTextField.setBounds(283, 95, 116, 22);
        editOrderPanel.add(updateOrderIDTextField);

        updateOrderClientIDTextField = new JTextField();
        updateOrderClientIDTextField.setBounds(283, 145, 116, 22);
        editOrderPanel.add(updateOrderClientIDTextField);

        updateOrderProductIDTextField = new JTextField();
        updateOrderProductIDTextField.setBounds(283, 195, 116, 22);
        editOrderPanel.add(updateOrderProductIDTextField);

        updateOrderQuantityTextField = new JTextField();
        updateOrderQuantityTextField.setBounds(283, 245, 116, 22);
        editOrderPanel.add(updateOrderQuantityTextField);

        updateOrderButton = new JButton("Update");
        updateOrderButton.setBounds(290, 321, 97, 25);
        editOrderPanel.add(updateOrderButton);

        JLabel updateOrderIDLabel = new JLabel("OrderID");
        updateOrderIDLabel.setBounds(188, 95, 56, 16);
        editOrderPanel.add(updateOrderIDLabel);

        JLabel updateOrderClientIDLabel = new JLabel("Client ID");
        updateOrderClientIDLabel.setBounds(188, 145, 56, 16);
        editOrderPanel.add(updateOrderClientIDLabel);

        JLabel updateOrderProductIDLabel = new JLabel("Product ID");
        updateOrderProductIDLabel.setBounds(188, 195, 56, 16);
        editOrderPanel.add(updateOrderProductIDLabel);

        JLabel updateOrderQuantityLabel = new JLabel("Quantity");
        updateOrderQuantityLabel.setBounds(188, 245, 56, 16);
        editOrderPanel.add(updateOrderQuantityLabel);

        backEditOrderButton = new JButton("Back");
        backEditOrderButton.setBounds(12, 13, 97, 25);
        editOrderPanel.add(backEditOrderButton);
        backEditOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editOrderPanel.setVisible(false);
                orderPanel.setVisible(true);
            }
        });

        //View Order
        viewOrdersPanel.setBounds(0, 0, 640, 450);
        this.add(viewOrdersPanel);
        viewOrdersPanel.setLayout(null);
        viewOrdersPanel.setVisible(false);

        viewOrdersPanel.getViewButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewOrdersPanel.printTable();
            }

        });

        backViewOrderButton = new JButton("Back");
        backViewOrderButton.setBounds(12, 13, 97, 25);
        viewOrdersPanel.add(backViewOrderButton);
        backViewOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewOrdersPanel.setVisible(false);
                orderPanel.setVisible(true);
            }
        });
    }

    public void addClientListener(ActionListener cal) {
        enterClientButton.addActionListener(cal);
    }

    public void deleteClientListener(ActionListener dal) {
        deleteButton.addActionListener(dal);
    }

    public void updateClientListener(ActionListener ual) {
        updateClientButton.addActionListener(ual);
    }

    public void addProductListener(ActionListener cal) {
        enterProductButton.addActionListener(cal);
    }

    public void deleteProductListener(ActionListener dal) {
        delProductButton.addActionListener(dal);
    }

    public void updateProductListener(ActionListener ual) {
        updateProductButton.addActionListener(ual);
    }

    public void addOrderListener(ActionListener oal) {
        enterOrderButton.addActionListener(oal);
    }

    public void delOrderListener(ActionListener dal) {
        delOrderButton.addActionListener(dal);
    }

    public void updateOrderListener(ActionListener ual) {
        updateOrderButton.addActionListener(ual);
    }

}