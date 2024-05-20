public class Artwork {

    private String title;
//    This below should be private Artist artist as artist is an object we created from the previous class
    private Artist artist;
    private int price;

    public Artwork(String title, Artist artist, int price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }


// Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }


    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


