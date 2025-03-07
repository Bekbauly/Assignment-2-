import java.util.Objects;

public class Artist {
    private String name;
    private int birthYear;
    private String nationality;

    public Artist(String name, int birthYear, String nationality) {
        this.name = name;
        this.birthYear = birthYear;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Artist: " + name + " (" + birthYear + "), Nationality: " + nationality;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artist artist = (Artist) obj;
        return birthYear == artist.birthYear &&
                Objects.equals(name, artist.name) &&
                Objects.equals(nationality, artist.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear, nationality);
    }
}
