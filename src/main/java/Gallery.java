import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> stock;

    public Gallery(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    //    GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Artwork> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Artwork> artworks) {
        this.stock = artworks;
    }
}


//Other methods

// Purpose: This method calculates and returns the total value of all Artwork objects in the collection this.stock.
    public int calculateArtworkValue(){
        int total = 0;
        for(Artwork artwork : this.stock) {
            total += artwork.getPrice();
        }
        return total;
    }

//    Steps Explained
//Initialize Total: It starts by initializing a variable total to 0. This variable will accumulate the sum of the prices of all artworks.
//Iterate Through Collection: The for loop iterates over each Artwork object in the collection this.stock.
//Artwork artwork : this.stock is a for-each loop that goes through each Artwork object in the collection.
//Accumulate Prices: Inside the loop, it adds the price of the current Artwork object to total. The price is obtained by calling the getPrice() method on the Artwork object.
//Return Total: After the loop has processed all artworks, it returns the accumulated total.

//    Purpose: This method returns the number of Artwork objects in the collection this.stock.

    public int artworkCount(){
        return this.stock.size();
    }

//    Purpose: This method adds a new Artwork object to the collection this.stock.

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }



//    Sell Artwork method
//Overall, this method facilitates the process of selling artwork to customers. It ensures that the customer has enough funds to make the purchase, updates the relevant data (customer's balance, gallery's stock, and gallery's till), and completes the transaction if all conditions are met.
    public void sellArtwork(Customer customer, Artwork artwork){ //This method takes two parameters: a Customer object representing the customer who wants to buy the artwork, and an Artwork object representing the artwork being sold.
        if(customer.canBuy(artwork)){ // This condition checks if the customer has enough funds to buy the artwork. It calls the canBuy method of the Customer class, passing the artwork as an argument. Presumably, the canBuy method returns true if the customer has enough funds to buy the artwork, and false otherwise.
            customer.buyArtwork(artwork); // If the customer can buy the artwork (i.e., if the canBuy method returns true), the artwork is sold to the customer. This typically involves deducting the artwork's price from the customer's balance or updating some other relevant information to reflect the purchase.
            this.stock.remove(artwork); // Once the artwork is sold, it is removed from the gallery's stock. Presumably, stock is a collection (e.g., a list or a set) containing the available artworks for sale in the gallery.

            setTill(this.till + artwork.getPrice()); // The price of the artwork is added to the gallery's till. This presumably represents the total revenue earned by the gallery from selling the artwork. setTill is a method used to update the till balance.
        }
    }
