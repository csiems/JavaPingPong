import java.util.ArrayList;
import java.util.Arrays;

import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void pingPongOutput_forNumberDivisibleByFiveAndThree_pingpong() {
    PingPong pingpong = new PingPong();

    assertEquals("pingpong", pingpong.pingPongOutput(15).get(14));
  }

  @Test
  public void pingPongOutput_forNumberDivisibleByThree_ping() {
      PingPong pingpong = new PingPong();

      assertEquals(new ArrayList<>(Arrays.asList("1", "2", "ping")), pingpong.pingPongOutput(3));
  }

  @Test
  public void pingPongOutput_forNumberDivisibleByFive_pong() {
      PingPong pingpong = new PingPong();

      assertEquals(new ArrayList<>(Arrays.asList("1", "2", "ping", "4", "pong")), pingpong.pingPongOutput(5));
  }
}
