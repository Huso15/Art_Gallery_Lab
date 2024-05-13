import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistTest {
    Artist huncho;
    private String name;


    @BeforeEach
    public void setUp() {
        huncho = new Artist("Huncho");
    }

    @Test
    public void hasName() {
        assertThat(huncho.getName()).isEqualTo("Huncho");

    }
    @Test
    public void testSetName() {
        Artist artist = new Artist("Initial Name");
        artist.setName("New Name");
        assertEquals("New Name", artist.getName());
    }

}
