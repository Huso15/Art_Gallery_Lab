import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("John", 1000.0);
    }

    @Test
    public void hasName() {
        assertThat(customer.getName()).isEqualTo("Huso");
    }

    @Test
    public void testGetWallet() {
        assertEquals(1000.0, customer.getWallet());
    }

    @Test
    public void testDeductFromWallet() {
        customer.deductFromWallet(500.0);
        assertEquals(500.0, customer.getWallet());
    }
}
