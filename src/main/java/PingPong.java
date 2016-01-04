public class PingPong {

  //private Integer userNumber;

  public String pingPongOutput(Integer number) {
  /*  for( i = 0; i <= number; i++ ) {

  } */
    if( number % 3 == 0 ) {
      return "ping";
    }

    return "x";

  }
}
