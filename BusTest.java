import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BusTest {

  Bus bus;
  Passenger passenger;

  @Before
  public void before() {
    this.bus = new Bus(6);
    this.passenger = new Passenger();
  }

  @Test
  public void hasNumber() {
    int number = bus.getNumber();
    assertEquals(6, number);
  }
}
