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
        assertThat(customer.getName()).isEqualTo("John");
    }

    @Test
    public void testGetWallet() {
        assertEquals(1000.0, customer.getWallet());
    }

    @Test
    public void testPay() {
        Customer customer = new Customer("John", 1000);
        customer.pay(500);
        assertEquals(500, customer.getWallet());
    }
}
