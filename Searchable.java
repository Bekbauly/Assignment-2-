import java.util.List;

interface Searchable {
    List<Artwork> searchByArtist(String artist);
    List<Artwork> filterByYear(int year);
    List<Artwork> sortByPrice();
}
