public class Demo{

    public static void main(String[] args) {
        Jewelry test = new Jewelry();
        Buyer t = new Buyer();
        Purchase purchase = new Purchase(t, test, 10 , 1);
        System.out.println(test.getCount());
        Shop shop = new Shop();
        shop.printProduct(shop.getProductByClass());
        Service service = new Service();
        service.prices(shop);
        service.store(shop);
        service.saleLast7Days(shop, 20160217);
        service.sellInDay(shop, 20160216);

    }

}
