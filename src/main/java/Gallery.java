import java.util.ArrayList;

public class Gallery {

    private String name;
    private ArrayList<Artwork> stock;
    private int till;

    public Gallery(String name, int till) {
        this.name = name;
        this.till = 1;
        this.stock = new ArrayList<>();
    }

    // Add Artwork to Stock
    public void addArtwork(Artwork artwork) {
        stock.add(artwork);
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public int getTill() {
        return this.till;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void setTill(int amount) {
        this.till = amount;
    }

    public String getSize() {
        return Integer.toString(stock.size());

    }

    public ArrayList<Artwork> getStock() {
        return stock;
    }
}
//    public String getStock () {
//        return this.getStock();
//
//    }
//
//    public void setStock () {
//        this.stock = new ArrayList<>();
//    }

