import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtworkTest {
    @Test
    public void testGetTitle() {
        String artist = new String("Huncho");
        Artwork artwork = new Artwork("Utopia", artist, 500);
        assertEquals("Utopia", artwork.getTitle());
    }

    @Test

    public void testGetArtist() {
        String artist = new String("Huncho");
        Artwork artwork = new Artwork("Utopia", "Utopia", 500);
        assertEquals("Utopia", artwork.getArtist());
    }

    @Test

    public void testGetPrice() {
        String artist = new String("Huncho");
        Artwork artwork = new Artwork("Utopia", artist, 500);
        assertEquals(500, artwork.getPrice());
    }

}
