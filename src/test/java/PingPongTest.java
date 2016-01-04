import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void pingPongOutput_forNumberDivisibleByThree_ping() {
      PingPong pingpong = new PingPong();

      assertEquals("ping", pingpong.pingPongOutput(3));
  }

}
