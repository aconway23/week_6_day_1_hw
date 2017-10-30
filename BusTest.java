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

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.personCount());
  }


  @Test
  public void canAddPassenger() {
    bus.add(passenger);
    assertEquals(1, bus.personCount());
  }

  @Test
  public void cannotAddPassengerWhenBusFull() {
    for(int i = 0; i < 20; i++){
      bus.add(passenger);
    }
    assertEquals(10, bus.personCount());
  }

  @Test
  public void busIsFull() {
    for(int i = 0; i < 10; i++){
      bus.add(passenger);
    }
    assertEquals(true, bus.isBusFull());
  }



}
