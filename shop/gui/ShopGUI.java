package shop.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Vector;
import shop.*;
import shop.product.Jewelry;


public class ShopGUI{
    Shop shop;
    Vector<Jewelry> vector;

    public ShopGUI(Shop shop) {
        this.shop=shop;
        vector = new Vector<>();
        vector.addAll(shop.getProductAll());
        JFrame f = new JFrame("shop.Shop");
        f.setLocation(100,100);
        f.setMinimumSize(new Dimension(400,400));
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.setContentPane(createPanel());
        f.pack();
        f.setVisible(true);
    }

    JPanel createPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        JLabel buyerName = new JLabel("Name");
        JTextField bName = new JTextField();
        bName.setColumns(20);

        JLabel productList = new JLabel("product");
        JComboBox<Jewelry> JeweleryComboBox = new JComboBox(vector);
        JeweleryComboBox.setSelectedIndex(0);
        JeweleryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox)e.getSource();
                String jewName = cb.getSelectedItem().toString();
            }
        });

        JComboBox<Jewelry> ProductComboBox = new JComboBox();

        JRadioButton pList = new JRadioButton();

        JLabel lCount = new JLabel("count");
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        JFormattedTextField pCount = new JFormattedTextField(numberFormat);
        pCount.setValue(1);
        pCount.setColumns(3);

        JButton btnBuy = new JButton("Buy");

        panel.add(buyerName, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));
        panel.add(bName, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));

        panel.add(productList, new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));
        panel.add(JeweleryComboBox, new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));
        panel.add(ProductComboBox, new GridBagConstraints(2, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));

        panel.add(lCount, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));
        panel.add(pCount, new GridBagConstraints(1, 2, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));

        panel.add(btnBuy, new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));
        btnBuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               shop.setHistory(new Purchase(new Buyer(bName.getText()) , shop.getProduct(6),Integer.parseInt(pCount.getText())));
                Service service = new Service();
                service.sellInDay(shop, new Date());
            }
        });
        return panel;
    }
}
