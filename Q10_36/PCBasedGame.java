/* PCBasedGame Class
   Anderson, Franceschi
*/

public class PCBasedGame extends Game
{
  private int ramMB;
  private int hdMB;
  private double cpuGhz;

  /**
  * Constructor:<BR>
  * Allows client to set beginning value for ramMB, hdMB and cpuGhz
  * This constructor takes four parameters<BR>
  * Calls super constructor
  * Calls mutator methods
  * @param description the new description for the game
  * @param ramMB the minimum number of megabytes of RAM to play the game
  * @param hdMB the minimum number of megabytes needed on the hard disk to install the game
  * @param cpuGhz the minimum CPU performance in Ghz needed to play the game
  */
  public PCBasedGame( String description, int ramMB, int hdMB, 
                                     double cpuGhz )
  {
      //Add code here to complete the constructor
      //the program will not run until you do this...
  }

  /** getRamMB method
  * @return an int, the number of megabytes of RAM needed to play the game
  */
  public int getRamMB( )
  {
    //Add code here to return number of mb of ram
    return 0;
  }

  /** getHdMB method
  * @return an int, the number of megabytes needed on the hard disk to install the game
  */
  public int getHdMB( )
  {
    //Add code here to return number of mb on the hard disk
    return 0;
  }

  /** getCpuGhz method
  * @return a double, the minimum CPU performance in Ghz needed to play the game
  */
  public double getCpuGhz( )
  {
    //Add code here to return minimum CPU performance
    return 0.0;
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of ramMB
  * @param ramMB the new number of megabytes of RAM needed to play the game
  *        if ramMB is negative, ramMB is not changed
  */
  public void setRamMB( int ramMB )
  {
    //add code here to set the required ram
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of hdMB
  * @param newHdMB the new number of megabytes needed on the hard disk to install the game
  *        if hdMB is negative, hdMB is not changed
  */
  public void setHdMB( int hdMB )
  {
    //Add code here to reset the required hard disk space
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of cpuGhz
  * @param newCpuGhz the new minimum CPU performance in Ghz needed to play the game
  *        if cpuGhz is negative, cpuGhz is not changed
  */
  public void setCpuGhz( double cpuGhz )
  {
    //Add code here to set the new minimum CPU performance value
  }

  /**
  * @return a string representation of the pc based game
  */
  public String toString( )
  {
    //Add code here to return the proper string as shown in the test output.
    return "null";
  }

  /**
  * equals method
  * Compares two PCBasedGame objects for the same field value
  * @param  o another PCBasedGame object
  * @return a boolean, true if this object
  * has the same field values as the parameter pcbg
  */
  public boolean equals( Object o )
  {
    //Write code here to compare the two games for equality.
    return false;
  }
}
