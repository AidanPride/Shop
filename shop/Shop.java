package shop;

import shop.product.*;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Jewelry> productAll = new ArrayList<>();
    private Jewelry[][] productByClass;
    private Buyer buyer;
    private Buyer[] customers = new Buyer[4];
    private ArrayList<Purchase> history = new ArrayList<Purchase>();

    public Shop() {
        shopInit();
    }

    public void shopInit(){
        productAll.add(new Band("OS1", "band1", Stone.AGATE, Color.BLACK, 100, 20));
        productAll.add(new Band("OS2", "band2", Stone.AGATE, Color.BLACK, 101, 21));
        productAll.add(new Band("OS3", "band3", Stone.AGATE, Color.BLACK, 101, 21));
        productAll.add(new Band("OS4", "band4", Stone.AGATE, Color.BLACK, 150, 27));
        productAll.add(new Band("OS5", "band5", Stone.AGATE, Color.BLACK, 201, 121));
        productAll.add(new Chaplet("AS1", "chaplet1", Stone.CORAL, Color.RED, 50, 21));
        productAll.add(new Chaplet("AS2", "chaplet2", Stone.CORAL, Color.RED, 52, 211));
        productAll.add(new Chaplet("AS3", "chaplet3", Stone.CORAL, Color.RED, 50, 11));
        productAll.add(new Chaplet("AS4", "chaplet4", Stone.CORAL, Color.RED, 50, 21));
        productAll.add(new Chaplet("AS5", "chaplet5", Stone.CORAL, Color.RED, 50, 21));
        productAll.add(new Earrings("IS1", "earrning1", Stone.GARNET, Color.LIGHT_GREEN, 50, 21));
        productAll.add(new Earrings("IS2", "earrning2", Stone.GARNET, Color.LIGHT_GREEN, 50, 21));
        productAll.add(new Earrings("IS3", "earrning3", Stone.MALACHITE, Color.BLUE, 50, 21));
        productAll.add(new Earrings("IS4", "earrning4", Stone.MALACHITE, Color.BLUE, 50, 21));
        productAll.add(new Earrings("IS4", "earrning5", Stone.MALACHITE, Color.BLUE, 50, 21));
        productAll.add(new Pendant("SS1", "pendant1", Stone.CORAL, Color.GREEN, 50, 21));
        productAll.add(new Pendant("SS2", "pendant2", Stone.CORAL, Color.GREEN, 50, 21));
        productAll.add(new Pendant("SS3", "pendant3", Stone.CORAL, Color.GREEN, 50, 21));
        productAll.add(new Pendant("SS4", "pendant4", Stone.CORAL, Color.GREEN, 50, 21));
        productAll.add(new Pendant("SS5", "pendant5", Stone.CORAL, Color.GREEN, 50, 21));

        customers[0] = new Buyer("Andrey");
        customers[1] = new Buyer("Natasha");
        customers[2] = new Buyer("Nastia");
        customers[3] = new Buyer("Oleg");

        history.add(new Purchase(customers[0], productAll.get(1), 10));
        history.add(new Purchase(customers[1], productAll.get(14), 7));
        history.add(new Purchase(customers[1], productAll.get(19), 8));
        history.add(new Purchase(customers[3], productAll.get(19), 8));
        history.add(new Purchase(customers[2], productAll.get(0), 10));
        history.add(new Purchase(customers[2], productAll.get(2), 5));
        history.add(new Purchase(customers[0], productAll.get(10), 1));

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

    public ArrayList<Purchase> getHistory() {
        return history;
    }

    public void setHistory(Purchase purchase) {
        history.add(purchase);
    }
     public Jewelry getProduct(int i){
         return productAll.get(i);
     }
    public ArrayList<Jewelry> getProductAll() {
        return productAll;
    }

    public void setProductAll(ArrayList<Jewelry> productAll) {
        this.productAll = productAll;
    }

    public Jewelry[][] getProductByClass() {
        return productByClass;
    }

    public void setProductByClass(Jewelry[][] productByClass) {
        this.productByClass = productByClass;
    }
}
