/* SportsGameClient class
   Anderson, Franceschi
*/

public class SportsGameClient
{
  public static void main( String [] args )
  {
    System.out.println("Generating sg1 with description Soccer, a team sport, a tie is possible.");
    SportsGame sg1 = new SportsGame( "Soccer", true, true );

    System.out.println("Generating sg2 with description 100 yards, not a team sport, a tie is not possible.");
    SportsGame sg2 = new SportsGame( "100 yards", false, true );
    System.out.println();

    System.out.println("Printing sg1 and sg2: ");
    System.out.println( sg1 );
    System.out.println( sg2 );
    System.out.println();

    System.out.println("Setting sg2 as a team sport");
    sg2.setTeam( true );
    System.out.println("Checking if the two games are equal");
    if ( sg1.equals( sg2 ) )
      System.out.println( "sg1 and sg2 are equal" );
    else
      System.out.println( "sg1 and sg2 are not equal" );
    System.out.println();

    System.out.println("Setting sg2 description to Soccer");
    sg2.setDescription( "Soccer" );
    System.out.println();

    System.out.println("Checking if the two games are equal:");
    if ( sg1.equals( sg2 ) )
      System.out.println( "sg1 and sg2 are now equal" );
    else
      System.out.println( "sg1 and sg2 are still not equal" );
  }
}