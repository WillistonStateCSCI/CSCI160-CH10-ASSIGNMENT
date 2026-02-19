/* WebStoreClient class
   Anderson, Franceschi
*/

public class WebStoreClient
{
  public static void main( String [] args )
  {
    System.out.println("Generating new WebStore ws1 named Computer Books, Inc. at domain name www.cbi.inc written in java");
    WebStore ws1 = new WebStore( "Computer Books, Inc.", "www.cbi.inc", "java" );

    System.out.println("Generating new Webstore ws2 named Bikes Unlimited at domain name www.bikeshop.com written in perl");
    WebStore ws2 = new WebStore( "Bikes Unlimited", "www.bikeshop.com", "perl" );
    System.out.println();

    System.out.println("Printing both WebStores");
    System.out.println( ws1 );
    System.out.println( ws2 );
    System.out.println();

    System.out.println("Setting ws2 domain to www.cbi.inc and language to JAVA");
    ws2.setDomainName( "www.cbi.inc" );
    ws2.setLanguage( "Java" );

    System.out.println("Checking if the two stores are equal");
    if ( ws1.equals( ws2 ) )
      System.out.println( "ws1 and ws2 are equal" );
    else
      System.out.println( "ws1 and ws2 are not equal" );
    System.out.println();

    System.out.println("Updating ws2 name to Computer Books, Inc.");
    ws2.setName( "Computer Books, Inc." );

    System.out.println("Checking if the two stores are equal");
    if ( ws1.equals( ws2 ) )
      System.out.println( "ws1 and ws2 are now equal" );
    else
      System.out.println( "ws1 and ws2 are still not equal" );
  }
}