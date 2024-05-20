import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Huncho");
    }

    @Test
    public void testGetArtist() {
        assertThat(artist.getName()).isEqualTo("Huncho");

    }
    @Test
    public void testSetArtist() {
        // Arrange
        Artist artist = new Artist("Chunkz");

        // Act
        artist.setName("Chunkz");

        // Assert
        assertThat(artist.getName()).isEqualTo("Chunkz");

    }

}
