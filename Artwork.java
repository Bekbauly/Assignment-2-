import java.util.Objects;

abstract class Artwork {
    private String title;
    private String artist;
    private int year;
    private double price;

    public Artwork(String title, String artist, int year, double price) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Artwork: '" + title + "' by " + artist + " (" + year + ") - $" + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artwork artwork = (Artwork) obj;
        return year == artwork.year &&
                Double.compare(artwork.price, price) == 0 &&
                Objects.equals(title, artwork.title) &&
                Objects.equals(artist, artwork.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, year, price);
    }
}
