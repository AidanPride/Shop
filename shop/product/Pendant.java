package shop.product;

import shop.Color;
import shop.Stone;

public class Pendant extends Jewelry {
    public Pendant() {
    }

    public Pendant(String article, String name, Stone stone, Color color, int price, int count) {
        super(article, name, stone, color, price, count);
    }
}
