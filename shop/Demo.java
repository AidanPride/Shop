package shop;

import shop.gui.MainWindow;
import shop.gui.ShopGUI;
import shop.product.Jewelry;

public class Demo{

    public static void main(String[] args) {
        Jewelry test = new Jewelry();
        Buyer t = new Buyer();
        Purchase purchase = new Purchase(t, test, 10);
        System.out.println(test.getCount());
        Shop shop = new Shop();
        shop.printProduct(shop.getProductByClass());
        Service service = new Service();
        service.prices(shop);
        service.store(shop);

//        shop.gui.ShopGUI shopGUI = new shop.gui.ShopGUI(shop);
//        service.sellInDay(shop, new Date());
        MainWindow mainWindow = new MainWindow(shop);
//        shop.gui.SimpleTableDemo tableDemo = new shop.gui.SimpleTableDemo(shop);
//        tableDemo.createAndShowGUI();


    }

}
