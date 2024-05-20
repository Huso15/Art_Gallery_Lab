import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ArtworkTest {

    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Huncho");
        artwork = new Artwork("Utopia", artist, 50);
    }

    @Test
    public void testGetTitle() {
        assertThat(artwork.getTitle()).isEqualTo("Utopia");

    }

    @Test
    public void getArtist(){
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }

    @Test
    public void getPrice(){
        assertThat(artwork.getPrice()).isEqualTo(50);
    }

}
