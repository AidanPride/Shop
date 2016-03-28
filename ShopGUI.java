import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 28.03.2016.
 */
public class ShopGUI{
    public ShopGUI() {
        JFrame f = new JFrame("Shop");
        f.setLocation(100,100);
        f.setMinimumSize(new Dimension(800,800));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(createPanel());
        f.pack();
        f.setVisible(true);
    }

    private JPanel createPanel(){
        JPanel panel = new JPanel();
        JLabel buyerName = new JLabel("Name");
        JTextField bName = new JTextField("enter buyer's name", 20);
        JLabel productList = new JLabel("product");
        JRadioButton pList = new JRadioButton();
        JTextField pCount = new JTextField("enter count", 15);
        JButton buy = new JButton("Buy");
        panel.add(buyerName);
        panel.add(bName);
        panel.add(productList);
        panel.add(pList);
        panel.add(pCount);
        panel.add(buy);
        return panel;
    }
}
