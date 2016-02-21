public class Purchase {
    private Buyer buyer;
    private Jewelry jewelry;
    private int count;
    private int buyDate;
    private int profit;

    public Purchase() {
    }

    public Purchase(Buyer buyer, Jewelry jewelry, int count, int buyDate) {
        this.buyer = buyer;
        this.jewelry = jewelry;
        this.count=count;
        jewelry.setCount(-count);
        this.buyDate=buyDate;
        profit = count*jewelry.getPrice();
    }

    public int getCount() {
        return count;
    }

    public int getBuyDate() {
        return buyDate;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Jewelry getJewelry() {
        return jewelry;
    }
}
