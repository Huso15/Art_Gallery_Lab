import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class GalleryTest {

    private Gallery gallery;

    @Before
    public void setUp() {
        gallery = new Gallery("Test Gallery", 1000); // Assuming initial till amount is 1000
    }

    @Test
    public void testGetName() {
        assertEquals("Test Gallery", gallery.getName());
    }

    @Test
    public void testGetTill() {
        assertEquals(1, gallery.getTill());
    }

    @Test
    public void testSetName() {
        gallery.setName("New Gallery Name");
        assertEquals("New Gallery Name", gallery.getName());
    }

    @Test
    public void testSetTill() {
        gallery.setTill(2000);
        assertEquals(2000, gallery.getTill());
    }


//    @Test
//    public void testAddArtwork() {
//        Artwork artwork = new Artwork("Utopia", "Huncho", "500"); // Assuming artwork with price 500
//        gallery.addArtwork(artwork);
//        assertEquals(1, gallery.getStock().size());
//        assertEquals(artwork, gallery.getStock().get(0));
    //}


//    @Test
//    public void testSetStock() {
//        Gallery gallery = new Gallery("Test Gallery",1);
//        List<Artwork> newStock = new ArrayList<>();
//        newStock.add(new Artwork("Test Artwork", new Artist("Test Artist"));
//        }
//        gallery.addArtwork(new Artwork("Utopia", "Huncho", "500" ));
//        gallery.addArtwork(new Artwork("Grand Canyon", "Huncho", "300"));
//        gallery.setStock();
//        assertEquals(0, gallery.getStock().size());

}
