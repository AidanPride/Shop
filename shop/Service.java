package shop;

import shop.product.Jewelry;

import java.util.Date;

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

public void sellInDay(Shop shop,Date nowDate){
    System.out.println("                  printTransToday               ");
    System.out.println("------------------------------------------------");
    System.out.println("№ Cusomer     Product            Price   Amount");
    int n =1;
    int ollAmount = 0;
    int daySale = 0;
    System.out.println("------------------------------------------------");
    for(int i=0;i<shop.getHistory().size();i++){
        if(shop.getHistory().get(i).getBuyDate()==nowDate){
            System.out.println(n +" |"+shop.getHistory().get(i).getBuyer().getName()+"     |"+shop.getHistory().get(i).getJewelry().getName()
                    +" "+shop.getHistory().get(i).getJewelry().getStone()+" |"+shop.getHistory().get(i).getJewelry().getPrice()+
                    "    |"+shop.getHistory().get(i).getCount()+" |");
            n++;
            daySale+=shop.getHistory().get(i).getJewelry().getPrice()*shop.getHistory().get(i).getCount();
            ollAmount+=shop.getHistory().get(i).getCount();
        }
    }
    System.out.println("------------------------------------------------");
    System.out.println("in total "+(n-1)+" purchases                "+daySale+"    "+ollAmount);

}
//    public static void saleLast7Days(shop.Shop shop, Date nowDay){
//        System.out.println("Sale last 7 days");
//        int count = 0;
//        for(int i = nowDay-7; i<nowDay; i++){
//            for(int k = 0;k<shop.getHistory().size();k++){
//                if(shop.getHistory().get(k).getBuyDate()== i){
//                    count+=shop.getHistory().get(k).getCount();
//
//                }
//
//
//            }
//            System.out.println(i+"-"+count);
//            count=0;
//        }
//    }
}
