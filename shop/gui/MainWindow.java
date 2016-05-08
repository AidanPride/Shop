package shop.gui;

import shop.Shop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainWindow extends JPanel{

    ShopGUI shopGUI;
    SimpleTableDemo tableDemo;
    Shop shop;

    public MainWindow(Shop shop) {
        tableDemo = new SimpleTableDemo(shop);
        JFrame main = new JFrame("Shop");
        main.setLocation(100 , 100);
        main.setMinimumSize(new Dimension(800 , 800));
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu);
        JMenuItem buy = new JMenuItem("Buy");
        menu.add(buy);
        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shopGUI = new ShopGUI(shop);
                tableDemo.repaint();
            }
        });

        main.setJMenuBar(menuBar);
        main.setContentPane(tableDemo);
        main.pack();
        main.setVisible(true);
    }
}
