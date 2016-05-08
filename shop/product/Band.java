package shop.product;

import shop.Color;
import shop.Stone;

public class Band extends Jewelry {
    public Band() {
    }

    public Band(String article, String name, Stone stone, Color color, int price, int count) {
        super(article, name, stone, color, price, count);
    }
}

