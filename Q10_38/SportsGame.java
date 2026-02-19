/* SportsGame Class
   Anderson, Franceschi
*/

public class SportsGame extends Game
{
  private boolean team;
  private boolean canTie;

  /**
  * Constructor:<BR>
  * Allows client to set beginning value for team, canTie and cpuGhz
  * This constructor takes three parameters<BR>
  * Calls super constructor
  * Calls mutator methods
  * @param description the new description for the game
  * @param team true if the game is played by a team; false if an individual game
  * @param canTie true if the game can end in a tie; false otherwise
  */
  public SportsGame( String description, boolean team, boolean canTie )
  {
    //Add code for constructor here
  }

  /** getTeam method
  * @return true if the game is a team game, false otherwise
  */
  public boolean getTeam( )
  {
    //Add code here to return whether or not it is a team sport
    return false;
  }

  /** getCanTie method
  * @return true if the game can end in a tie, false otherwise
  */
  public boolean getCanTie( )
  {
   //Add code here to return whether or not the team can tie
   return false;
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of team
  * @param team the new value of whether the game is a team game
  */
  public void setTeam( boolean team )
  {
    //Add code here to change whether or not the game is a team game
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of canTie
  * @param canTie the new value of whether the game can end in a tie
  */
  public void setCanTie( boolean canTie )
  {
    //Add code here to change whether or not the game can tie
  }

  /**
  * @return a string representation of the sports game
  */
  public String toString( )
  {
  //Add code here to properly print the game as shown in the example
  return "null";
  }

  /**
  * equals method
  * Compares two SportsGame objects for the same field value
  * @param  o another SportsGame object
  * @return a boolean, true if this object
  * has the same field values as the parameter sg
  */
  public boolean equals( Object o )
  {
    //Add code here to compare the two game objects
    return false;
  }
}