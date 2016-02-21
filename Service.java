/**
 * Created by User on 21.02.2016.
 */
public class Service {
    private Jewelry jewelry;
     private Buyer buyer;

    public Service() {
    }

    public void prices(Shop shop){
        System.out.println("_____Prices_______");
       for(Jewelry i: shop.getProductAll()){
           System.out.println(i.getName() + ": " + i.getPrice());
       }
    }

    public void store(Shop shop){
        System.out.println("_____Counts_______");
        for(Jewelry i: shop.getProductAll()){
            System.out.println(i.getName() + ": " + i.getCount());
        }
    }

public void sellInDay(Shop shop,int nowDate){
    System.out.println("                  printTransToday               ");
    System.out.println("------------------------------------------------");
    System.out.println("№ Cusomer     Product            Price   Amount");
    int n =1;
    int ollAmount = 0;
    int daySale = 0;
    System.out.println("------------------------------------------------");
    for(int i=0;i<shop.getHistory().length;i++){
        if(shop.getHistory()[i].getBuyDate()==nowDate){
            System.out.println(n +" |"+shop.getHistory()[i].getBuyer().getName()+"     |"+shop.getHistory()[i].getJewelry().getName()
                    +" "+shop.getHistory()[i].getJewelry().getStone()+" |"+shop.getHistory()[i].getJewelry().getPrice()+
                    "    |"+shop.getHistory()[i].getCount()+" |");
            n++;
            daySale+=shop.getHistory()[i].getJewelry().getPrice()*shop.getHistory()[i].getCount();
            ollAmount+=shop.getHistory()[i].getCount();
        }
    }
    System.out.println("------------------------------------------------");
    System.out.println("in total "+(n-1)+" purchases                "+daySale+"    "+ollAmount);

}
    public static void saleLast7Days(Shop shop,int nowDay){
        System.out.println("Sale last 7 days");
        int count = 0;
        for(int i = nowDay-7; i<nowDay; i++){
            for(int k = 0;k<shop.getHistory().length;k++){
                if(shop.getHistory()[k].getBuyDate()== i){
                    count+=shop.getHistory()[k].getCount();

                }


            }
            System.out.println(i+"-"+count);
            count=0;
        }
    }
}
