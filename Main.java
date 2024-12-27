public class Main {
    public static void main(String[] args) {
        // Create gallery
        Gallery gallery = new Gallery("Modern Art Gallery", "New York");

        // Add artworks
        gallery.addArtwork(new Painting("The Weeping Woman", "Pablo Picasso", 1937, 2000000, "Oil on canvas"));
        gallery.addArtwork(new Painting("Starry Night", "Vincent van Gogh", 1889, 100000000, "Oil on canvas"));
        gallery.addArtwork(new Painting("Girl with a Pearl Earring", "Johannes Vermeer", 1665, 50000000, "Oil on canvas"));

        // Display gallery
        System.out.println(gallery);

        // Search by artist
        System.out.println("Search by artist 'Vincent van Gogh':");
        gallery.searchByArtist("Vincent van Gogh").forEach(System.out::println);

        // Filter by year
        System.out.println("\nFilter by year 1937:");
        gallery.filterByYear(1937).forEach(System.out::println);

        // Sort by price
        System.out.println("\nSort by price:");
        gallery.sortByPrice().forEach(System.out::println);
    }
}
