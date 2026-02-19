/* MusicStore Class
   Anderson, Franceschi
*/

public class MusicStore extends Store
{
  private int numberOfTitles;
  private String address;

  /**
  * Constructor:<BR>
  * Allows client to set beginning value for numberOfTitles, address
  * This constructor takes three parameters<BR>
  * Calls super constructor
  * Calls mutator methods
  * @param name the new name for the store
  * @param numberOfTitles the new number of titles
  * @param address the new address
  */
  public MusicStore( String name, int numberOfTitles, String address )
  {
    //Add constructor code here
  }

  /** getNumberOfTitles method
  * @return an int, the number of titles
  */
  public int getNumberOfTitles( )
  {
    //Add code to return number of titles here
    return 0;
  }

  /** getAddress method
  * @return a String, the address of the store
  */
  public String getAddress( )
  {
    //Add code here to return address
    return "null";
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of numberOfTitles
  * @param numberOfTitles the new number of titles
  *        if numberOfTitles is negative, then numberOfTitles is not changed
  */
  public void setNumberOfTitles( int numberOfTitles )
  {
    //Add code here to set the number of titles
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of address
  * @param address the new address
  */
  public void setAddress( String address )
  {
    //Add code here to set the address
  }

  /**
  * @return a string representation of the music store
  */
  public String toString( )
  {
    //Add code here to return as a string as shown in the example code
    return "null";
  }

  /**
  * equals method
  * Compares two MusicStore objects for the same field values
  * @param  o another MusicStore object
  * @return a boolean, true if this object
  * has the same field values as the parameter ms
  */
  public boolean equals( Object o )
  {
    //Add code here to determine if the two options are equal;
  }
}