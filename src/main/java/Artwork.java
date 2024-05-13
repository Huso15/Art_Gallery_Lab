public class Artwork {

    private String title;
    private String artist;
    private int price;

    public Artwork(String title, String artist, int price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }



    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPrice() {
        return price;
    }
}
