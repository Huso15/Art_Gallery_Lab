import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artist huncho;
    Artwork utopia;
    Artist chunkz;
    Artwork landlock;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Husseyin", 100);
        huncho = new Artist("Huncho");
        utopia = new Artwork("Utopia", huncho, 50);

        chunkz = new Artist("Chunkz");
        landlock = new Artwork("Landlock", chunkz, 200);
    }

    @Test //--> used to test if customer can purchase artwork - test case utopia
    public void canAffordArtworkWhenCustomerHasEnoughFunds(){
        assertThat(customer.canBuy(utopia)).isEqualTo(true);
    }

//  See Mac --> notes --> Lab reviews for detailed explanation of methods used below

    @Test
    public void cannotAffordArtworkWhenCustomerDoesNotHaveEnoughFunds(){
        assertThat(customer.canBuy(landlock)).isEqualTo(false);
    }

    @Test
    public void customerArtworkCountStartsEmpty(){
        assertThat(customer.getArtworkCount()).isEqualTo(0);
    }

    @Test
    public void canBuyArtwork(){
        customer.buyArtwork(utopia);
        assertThat(customer.getWallet()).isEqualTo(50);
        assertThat(customer.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void customerName(){
        assertThat(customer.getName()).isEqualTo("Husseyin");
    }

    @Test
    public void customerWallet(){
        assertThat(customer.getWallet()).isEqualTo(100);
    }

}