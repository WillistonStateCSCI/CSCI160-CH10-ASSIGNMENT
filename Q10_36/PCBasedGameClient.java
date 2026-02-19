/* PCBasedGameClient class
   Anderson, Franceschi
*/

public class PCBasedGameClient
{
  public static void main( String [] args )
  {
    System.out.println("Creating and printing Game 1: Counterstrike, requiring 256MB ram, 3000MB hd, and 1.8Ghz cpu");
    PCBasedGame pcbg1 = new PCBasedGame( "CounterStrike", 256, 3000, 1.8 );
    System.out.println( pcbg1 );
    System.out.println();
    
    System.out.println("Creating and printing Game 1: NFL, requiring 128MB ram, 1500MB hd, and 1.5Ghz cpu");
    PCBasedGame pcbg2 = new PCBasedGame( "NFL", 128, 1500, 1.5 );
    System.out.println( pcbg2 );
    System.out.println();

    System.out.println("Updating Game 2 to require 256MB ram, 3000MB hd, and 1.8 Ghz cpu");
    pcbg2.setRamMB( 256 );
    pcbg2.setHdMB( 3000 );
    pcbg2.setCpuGhz( 1.8 );

    System.out.println("Checking if the two games are equal.");
    if ( pcbg1.equals( pcbg2 ) )
      System.out.println( "pcbg1 and pcbg2 are equal" );
    else
      System.out.println( "pcbg1 and pcbg2 are not equal" );
    System.out.println();

    System.out.println("Updating Game 2 description to CounterStrike");
    pcbg2.setDescription( "CounterStrike" );
    System.out.println();

    System.out.println("Checking if the two games are equal.");
    if ( pcbg1.equals( pcbg2 ) )
      System.out.println( "pcbg1 and pcbg2 are now equal" );
    else
      System.out.println( "pcbg1 and pcbg2 are still not equal" );
  }
}
