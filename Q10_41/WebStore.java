/* WebStore Class
   Anderson, Franceschi
*/

public class WebStore extends Store
{
  private String domainName;
  private String language;

  /**
  * Constructor:<BR>
  * Allows client to set beginning value for domainName, language
  * This constructor takes three parameters<BR>
  * Calls super constructor
  * Calls mutator methods
  * @param name the new name for the store
  * @param domainName the new domain name
  * @param language the new language
  */
  public WebStore( String name, String domainName, String language )
  {
    //Add constructor code here
  }

  /** getDomainName method
  * @return a String, the domain name
  */
  public String getDomainName( )
  {
    //Add code here to return domain name
    return "null";
  }

  /** getLanguage method
  * @return a String, the language in which the web site was written
  */
  public String getLanguage( )
  {
    //Add code here to return the language used
    return "null";
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of domainName
  * @param domainName the new domain name
  */
  public void setDomainName( String domainName )
  {
    //Add code here to set the domain name
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of language
  * @param language the new language
  */
  public void setLanguage( String language )
  {
    //Add code here to set the language
  }

  /**
  * @return a string representation of the web store
  */
  public String toString( )
  {
    //Add code here to print as shown in the example code.
    return "null";
  }

  /**
  * equals method
  * Compares two WebStore objects for the same field values
  * @param  o another WebStore object
  * @return a boolean, true if this object
  * has the same field values as the parameter ws
  */
  public boolean equals( Object o )
  {
    //Add code here to determine if two objects are equal
    return false;
  }
}