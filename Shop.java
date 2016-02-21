/**
 * Created by User on 21.02.2016.
 */
public class Shop {
    private Jewelry[] productAll = new Jewelry[20];
    private Jewelry[][] productByClass;
    private Buyer buyer;
    private Buyer[] customers = new Buyer[4];
    private Purchase[] history = new Purchase[7];

    public Shop() {
        shopInit();
    }

    public void shopInit(){
        productAll[0] = new Band("OS1", "band1", Stone.AGATE, Color.BLACK, 100, 20);
        productAll[1] = new Band("OS2", "band2", Stone.AGATE, Color.BLACK, 101, 21);
        productAll[2] = new Band("OS3", "band3", Stone.AGATE, Color.BLACK, 101, 21);
        productAll[3] = new Band("OS4", "band4", Stone.AGATE, Color.BLACK, 150, 27);
        productAll[4] = new Band("OS5", "band5", Stone.AGATE, Color.BLACK, 201, 121);
        productAll[5] = new Chaplet("AS1", "chaplet1", Stone.CORAL, Color.RED, 50, 21);
        productAll[6] = new Chaplet("AS2", "chaplet2", Stone.CORAL, Color.RED, 52, 211);
        productAll[7] = new Chaplet("AS3", "chaplet3", Stone.CORAL, Color.RED, 50, 11);
        productAll[8] = new Chaplet("AS4", "chaplet4", Stone.CORAL, Color.RED, 50, 21);
        productAll[9] = new Chaplet("AS5", "chaplet5", Stone.CORAL, Color.RED, 50, 21);
        productAll[10] = new Earrings("IS1", "earrning1", Stone.GARNET, Color.LIGHT_GREEN, 50, 21);
        productAll[11] = new Earrings("IS2", "earrning2", Stone.GARNET, Color.LIGHT_GREEN, 50, 21);
        productAll[12] = new Earrings("IS3", "earrning3", Stone.MALACHITE, Color.BLUE, 50, 21);
        productAll[13] = new Earrings("IS4", "earrning4", Stone.MALACHITE, Color.BLUE, 50, 21);
        productAll[14] = new Earrings("IS4", "earrning5", Stone.MALACHITE, Color.BLUE, 50, 21);
        productAll[15] = new Pendant("SS1", "pendant1", Stone.CORAL, Color.GREEN, 50, 21);
        productAll[16] = new Pendant("SS2", "pendant2", Stone.CORAL, Color.GREEN, 50, 21);
        productAll[17] = new Pendant("SS3", "pendant3", Stone.CORAL, Color.GREEN, 50, 21);
        productAll[18] = new Pendant("SS4", "pendant4", Stone.CORAL, Color.GREEN, 50, 21);
        productAll[19] = new Pendant("SS5", "pendant5", Stone.CORAL, Color.GREEN, 50, 21);

        customers[0] = new Buyer("Andrey");
        customers[1] = new Buyer("Natasha");
        customers[2] = new Buyer("Nastia");
        customers[3] = new Buyer("Oleg");

        history[0] = new Purchase(customers[0], productAll[1], 10, 20160212);
        history[1] = new Purchase(customers[1], productAll[14], 7, 20160213);
        history[2] = new Purchase(customers[1], productAll[19], 8, 20160214);
        history[3] = new Purchase(customers[3], productAll[19], 8, 20160214);
        history[4] = new Purchase(customers[2], productAll[0], 10, 20160215);
        history[5] = new Purchase(customers[2], productAll[2], 5, 20160216);
        history[6] = new Purchase(customers[0], productAll[10], 1, 20160216);

    }

    public void productByClassInit(Jewelry[] productAll){
        int b=0;
        int c=0;
        int e=0;
        int p=0;
        for (int i=0; i< productAll.length; i++){
            if (productAll[i] instanceof Band){
                productByClass[0][b] = productAll[i];
                b++;
            }else if(productAll[i] instanceof Chaplet){
                productByClass[1][c] = productAll[i];
                c++;
            }else if(productAll[i] instanceof Earrings){
                productByClass[2][e] = productAll[i];
            }else
            {
                productByClass[3][p] = productAll[i];
                p++;
            }
        }
    }

    public void printProduct(Jewelry[] productAll){
        for (Jewelry i: productAll) {
            System.out.println(i.getClass() + " " +i.getArticle()+ " "+i.getName()+ " " + i.getStone() + " " + i.getColor()+
                    " " + i.getPrice() + " " +i.getCount());
        }
    }

    public void printProduct(Jewelry[][] productByClass){
        for (Jewelry i: productAll) {
            System.out.println(i.getClass() + " " +i.getArticle()+ " "+i.getName()+ " " + i.getStone() + " " + i.getColor()+
                    " " + i.getPrice() + " " +i.getCount());
        }
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Buyer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Buyer[] customers) {
        this.customers = customers;
    }

    public Purchase[] getHistory() {
        return history;
    }

    public void setHistory(Purchase[] history) {
        this.history = history;
    }

    public Jewelry[] getProductAll() {
        return productAll;
    }

    public void setProductAll(Jewelry[] productAll) {
        this.productAll = productAll;
    }

    public Jewelry[][] getProductByClass() {
        return productByClass;
    }

    public void setProductByClass(Jewelry[][] productByClass) {
        this.productByClass = productByClass;
    }
}
