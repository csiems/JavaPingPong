public class PingPong {

  //private Integer userNumber;

  public String pingPongOutput(Integer number) {
  /*  for( i = 0; i <= number; i++ ) {

  } */
    if( number % 3 == 0 && number % 5 == 0 ) {
      return "pingpong";
    } else if ( number % 5 == 0 ) {
      return "pong";
    } else if ( number % 3 == 0 ){
      return "ping";
    }



    return "x";

  }
}
