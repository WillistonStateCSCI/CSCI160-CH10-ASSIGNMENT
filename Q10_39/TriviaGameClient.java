/* TriviaGameClient class
   Anderson, Franceschi
*/

public class TriviaGameClient
{
  public static void main( String [] args )
  {
    System.out.println("Generating tg1 with description Millionaire, prize of 1000000, 10 questions");
    TriviaGame tg1 = new TriviaGame( "Millionaire", 1000000, 10 );

    System.out.println("Generating tg2 with description Jeopardy, prize of 10000, 50 questions");
    TriviaGame tg2 = new TriviaGame( "Jeopardy", 10000, 50 );
    System.out.println();

    System.out.println("Printing both games: ");
    System.out.println( tg1 );
    System.out.println( tg2 );
    System.out.println();

    System.out.println("Setting tg2 prize to 1000000 and number of questions to 10");
    tg2.setPrize( 1000000 );
    tg2.setNumberOfQuestions( 10 );

    System.out.println("Checking if the games are equal");
    if ( tg1.equals( tg2 ) )
      System.out.println( "tg1 and tg2 are equal" );
    else
      System.out.println( "tg1 and tg2 are not equal" );
    System.out.println();

    System.out.println("Updating tg2 description to millionaire.");
    tg2.setDescription( "Millionaire" );

    System.out.println("Checking if the games are equal");
    if ( tg1.equals( tg2 ) )
      System.out.println( "tg1 and tg2 are now equal" );
    else
      System.out.println( "tg1 and tg2 are still not equal" );
  }
}