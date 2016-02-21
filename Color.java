public enum Color {
    BLACK(0), RED(1), GREEN(2), LIGHT_GREEN(3), BLUE(4), TURQUOISE(5), VINOUS(6), PINK(7), YELLOW(8), BEIGE(9),
    PURPLE(10), WHITE(11);

    int id;

    Color(int id) {
        this.id = id;
    }

    Color() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
