import java.util.ArrayList;

public class Customer {
    private String name;
    private int wallet;
    private ArrayList<Artwork> collectedArt;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.collectedArt = new ArrayList<>();
    }

// Other methods

//    canBuy(Artwork artwork): Checks if the customer can buy a particular artwork based on whether they have enough money in their wallet.

    public boolean canBuy(Artwork artwork){
        if (artwork.getPrice() <= this.wallet) return true;
        else return false;
    }

//    Method to purchase artwork --> Subtracts the price of the artwork from the customer's wallet.
    public void buyArtwork(Artwork artwork){
        this.wallet -= artwork.getPrice();
        this.collectedArt.add(artwork);
    }

    public int getArtworkCount(){
        return this.collectedArt.size();
    }


// Getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getCustomerArtwork() {
        return this.collectedArt;
    }

//    The primary purpose of this method is to update the artCollection field of a Customer object. This field holds the list of artworks that a customer owns. By using this setter method, you can replace the current collection of artworks with a new one.

//    See mac --> Notes for further explanation of this setter

    public void setCustomerArtwork(ArrayList<Artwork> customerArtwork) {
        this.collectedArt = customerArtwork;
    }
}


