package dataAccessLayer;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ViewProduct extends JPanel {

    private Connection connection;
    private Statement statement;
    private JButton viewButton;
    private JTable viewTable;

    public JButton getViewButton() {
        return viewButton;
    }

    public ViewProduct() {
        this.setLayout(null);

        this.setVisible(false);

        viewButton = new JButton("View");
        viewButton.setBounds(325, 300, 97, 25);
        this.add(viewButton);

        viewTable = new JTable();
        viewTable.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(3, 74, 17)));
        viewTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Product ID", "Product Name", "Price", "Quantity"}));

        viewTable.setBounds(165, 10, 400, 279);
        this.add(viewTable);

    }

    public void printTable() {
        String SQL1 = "SELECT * FROM product;";
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL1);
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
            model.setRowCount(0);
            int colCount = rsmd.getColumnCount();
            int i;
            Object[] row = new Object[4];
            for (i = 1; i <= colCount; i++)
                row[i - 1] = rsmd.getColumnName(i).toUpperCase();
            model.addRow(row);
            while (rs.next()) {
                for (i = 1; i <= colCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
        } catch (Exception ex1) {
            JOptionPane.showMessageDialog(null, "Visualisation Error !");
        }
    }
}