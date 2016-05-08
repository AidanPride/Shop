package shop.gui;

import shop.Shop;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleTableDemo extends JPanel {
    private boolean DEBUG = false;
    private Shop shop;

    public SimpleTableDemo(Shop shop) {
        super(new GridLayout(1,0));
        this.shop = shop;

        String[] columnNames = {"Article",
                "Name",
                "shop.Buyer Name",
                "amount",
                "data"};
        Object[][] data = new Object[shop.getHistory().size()][5];
        for (int i=0; i< shop.getHistory().size(); i++) {
            data[i] = new Object[]{shop.getHistory().get(i).getJewelry().getArticle(), shop.getHistory().get(i).getJewelry().getName(),
                    shop.getHistory().get(i).getBuyer().getName(),
                    shop.getHistory().get(i).getCount(), shop.getHistory().get(i).getBuyDate()};
        }

        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);

        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }

    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();

        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public  void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("shop.gui.SimpleTableDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        SimpleTableDemo newContentPane = new SimpleTableDemo(shop);
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

}
