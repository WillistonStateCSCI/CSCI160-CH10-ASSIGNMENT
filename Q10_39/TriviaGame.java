/* TriviaGame Class
   Anderson, Franceschi
*/

import java.text.DecimalFormat;

public class TriviaGame extends Game
{
  public final DecimalFormat MONEY = new DecimalFormat( "$#,###.00" );
  private double prize;
  private int numberOfQuestions;

  /**
  * Constructor:<BR>
  * Allows client to set beginning value for prize and numberOfQuestions
  * This constructor takes three parameters<BR>
  * Calls super constructor
  * Calls mutator methods
  * @param description the new description for the game
  * @param prize the prize money
  * @param numberOfQuestions whether the game can end in a tie
  */
  public TriviaGame( String description, double prize, int numberOfQuestions )
  {
    //Add code for constructor here
  }

  /** getPrize method
  * @return a double, the prize money
  */
  public double getPrize( )
  {
    //Add code here to return the prize
    return 0.0;
  }

  /** getNumberOfQuestions method
  * @return an int, the number of questions to be answered
  */
  public int getNumberOfQuestions( )
  {
    //Add code here to return the number of questions
    return 0;
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of prize
  * @param prize the new prize money
  *        if prize is negative, prize is not changed
  */
  public void setPrize( double prize )
  {
    //Add code here to set the value of the prize
  }
  
  /**
  * Mutator method:<BR>
  * Allows client to set value of numberOfQuestions
  * @param numberOfQuestions the new number of questions
  */
  public void setNumberOfQuestions( int numberOfQuestions )
  {
  //Add code here to set the number of questions
  }

  /**
  * @return a string representation of the trivia game
  */
  public String toString( )
  {
    //Add code here to print the game as shown in the example code.
    return "null";
  }

  /**
  * equals method
  * Compares two TriviaGame objects for the same field value
  * @param  o another TriviaGameobject
  * @return a boolean, true if this object
  * has the same field values as the parameter tg
  */
  public boolean equals( Object o ){
  //Add code here to determine if the two games are equal.
  return false;
  }
}