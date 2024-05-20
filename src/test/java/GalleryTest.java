import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist huncho;
    Artist chunkz;
    Artwork utopia;
    Artwork landlock;
    Customer customer;
}

@BeforeEach
public void setUp(){
    gallery = new Gallery("The Auditorium");
    huncho = new Artist("Huncho");
    utopia = new Artwork("Utopia", huncho, 50);
    chunkz = new Artist("Chunkz");
    landlock = new Artwork("Landlock", chunkz, 200);
    gallery.addArtwork(utopia);
    gallery.addArtwork(landlock);
    customer = new Customer("Zuhair Khan", 500);
}

@Test
public void galleryIsAbleToSellArt(){
    gallery.sellArtwork(customer, flowersInAVase);
    assertThat(gallery.artworkCount()).isEqualTo(1); // check no. of artwork has reduced by 1
    assertThat(gallery.getTill()).isEqualTo(50); // check gallery till is up to 50 - price of artwork when till set to 0
    assertThat(customer.getWallet()).isEqualTo(450); // check customer wallet has reduced to by 50
    assertThat(customer.getArtworkCount()).isEqualTo(1); //check customer artwork count has increased by 1
}


@Test
public void canCalculateArtValue(){
    int result = gallery.calculateArtworkValue();
    assertThat(result).isEqualTo(250);
}

@Test
public void hasName(){
    assertThat(gallery.getName()).isEqualTo("The Auditorium");
}

@Test
public void tillStartsAtZero(){
    assertThat(gallery.getTill()).isEqualTo(0);
}

