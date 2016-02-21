/**
 * Created by User on 21.02.2016.
 */
public enum Stone {
    NONE(6), AGATE(0), CORAL(1), TURQUOISE(5), MALACHITE(3), CHRYSOPRASE(4), GARNET(2) ;
    private int id;

    Stone() {
    }

    Stone(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
