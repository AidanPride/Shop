import java.util.Date;

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

//        ShopGUI shopGUI = new ShopGUI(shop);
//        service.sellInDay(shop, new Date());
        SimpleTableDemo tableDemo = new SimpleTableDemo(shop);
        tableDemo.createAndShowGUI();


    }

}
