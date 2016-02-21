public class Jewelry {
    private String article;
    private String name;
    private Stone stone;
    private Color color;
    private int price;
    private int count;

    public Jewelry() {
    }

    public Jewelry(String article,  String name, Stone stone, Color color, int price, int count) {
        this.article=article;
        this.count = count;
        this.name = name;
        this.price = price;
        this.stone=stone;
        this.color=color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if(count <0){
            if(this.count<-count){
                System.out.println("You have only " + this.count +". You can't sell it");
                return;
            }
        }
        this.count = +count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Stone getStone() {
        return stone;
    }

    public void setStone(Stone stone) {
        this.stone = stone;
    }
}
