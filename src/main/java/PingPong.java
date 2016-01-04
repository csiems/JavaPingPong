import java.util.ArrayList;
import java.util.List;

public class PingPong {

  List<String> returnArray = new ArrayList<String>();

  public List<String> pingPongOutput(Integer number) {

    for( int i = 1; i <= number; i++ ) {

      if( i % 3 == 0 && i % 5 == 0 ) {
        returnArray.add("pingpong");
      } else if ( i % 5 == 0 ) {
        returnArray.add("pong");
      } else if ( i % 3 == 0 ){
        returnArray.add("ping");
      } else {
        returnArray.add(Integer.toString(i));
      }
    }
    return returnArray;
  }
}
