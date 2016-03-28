import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 28.03.2016.
 */
public class ShopGUI{
    public ShopGUI() {
        JFrame f = new JFrame("Shop");
        f.setLocation(100,100);
        f.setMinimumSize(new Dimension(400,400));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(createPanel());
        f.pack();
        f.setVisible(true);
    }

    private JPanel createPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10,5));
        JLabel buyerName = new JLabel("Name");
        JTextField bName = new JTextField("enter buyer's name", 20);
        JLabel productList = new JLabel("product");
        JRadioButton pList = new JRadioButton();
        JTextField pCount = new JTextField("enter count", 15);
        JButton btnBuy = new JButton("Buy");
        panel.add(buyerName, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));
        panel.add(bName, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));

        panel.add(productList, new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));
        panel.add(pList, new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));
        panel.add(pCount, new GridBagConstraints(2, 0, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));

        panel.add(btnBuy, new GridBagConstraints(3, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(50,50,50,50), 0 ,0));
        btnBuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Transaction done");
            }
        });
        return panel;
    }
}
