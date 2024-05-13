import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class GalleryTest {

    private Gallery gallery;

    @Before
    public void setUp() {
        gallery = new Gallery("Test Gallery", 1); // Assuming initial till amount is 1000
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

}
