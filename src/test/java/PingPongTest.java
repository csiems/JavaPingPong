import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void pingPongOutput_forNumberDivisibleByFiveAndThree_pingpong() {
    PingPong pingpong = new PingPong();

    assertEquals("pingpong", pingpong.pingPongOutput(15));
  }

  @Test
  public void pingPongOutput_forNumberDivisibleByThree_ping() {
      PingPong pingpong = new PingPong();

      assertEquals("ping", pingpong.pingPongOutput(3));
  }

  @Test
  public void pingPongOutput_forNumberDivisibleByFive_pong() {
      PingPong pingpong = new PingPong();

      assertEquals("pong", pingpong.pingPongOutput(5));
  }
}
