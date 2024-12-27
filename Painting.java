class Painting extends Artwork {
    private String medium;

    public Painting(String title, String artist, int year, double price, String medium) {
        super(title, artist, year, price);
        this.medium = medium;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        return super.toString() + " [Medium: " + medium + "]";
    }
}
