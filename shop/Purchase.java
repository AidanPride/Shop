package shop;

import shop.product.Jewelry;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Purchase {
    private Buyer buyer;
    private Jewelry jewelry;
    private int count;
    private Date buyDate;
    private int profit;

    public Purchase() {
    }

    public Purchase(Buyer buyer, Jewelry jewelry, int count) {
        this.buyer = buyer;
        this.jewelry = jewelry;
        this.count=count;
        jewelry.setCount(count);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        buyDate = new Date();
        profit = count*jewelry.getPrice();
    }

    public int getCount() {
        return count;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Jewelry getJewelry() {
        return jewelry;
    }

}
