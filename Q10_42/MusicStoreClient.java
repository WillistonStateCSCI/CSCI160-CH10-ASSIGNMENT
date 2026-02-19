/* MusicStoreClient class
   Anderson, Franceschi
*/

public class MusicStoreClient
{
  public static void main( String [] args )
  {
    System.out.println("Generating new store ms1 named Records, Inc. with 1000 titles located at 123 Elm Street");
    MusicStore ms1 = new MusicStore( "Records, Inc.", 1000, "123 Elm Street" );
    System.out.println("Generating new store ms2 named All Records Unlimited with 1200 titles located at 999 Green Street");
    MusicStore ms2 = new MusicStore( "All Records Unlimited", 1200, "999 Green Street" );
    System.out.println();

    System.out.println("Printing both music stores:");
    System.out.println( ms1 );
    System.out.println( ms2 );
    System.out.println();

    System.out.println("Setting ms2 to have 1000 titles and be located at 123 Elm Street");
    ms2.setNumberOfTitles( 1000 );
    ms2.setAddress( "123 Elm Street" );

    System.out.println("Checking if the two stores are equal: ");
    if ( ms1.equals( ms2 ) )
      System.out.println( "ms1 and ms2 are equal" );
    else
      System.out.println( "ms1 and ms2 are not equal" );
    System.out.println();

    System.out.println("Setting the name of ms2 to Records, Inc");
    ms2.setName( "Records, Inc." );

    System.out.println("Checking if the two stores are equal");
    if ( ms1.equals( ms2 ) )
      System.out.println( "ms1 and ms2 are now equal" );
    else
      System.out.println( "ms1 and ms2 are still not equal" );
  }
}