package sergio.vasco.realmforandroid.data.model;

/**
 * Name: Sergio Vasco
 * Date: 14/1/16.
 */
public class DBContact {

  private int idContact;
  private String firstName;
  private String lastName;
  private int phone;
  private String email;

  public int getIdContact() {
    return idContact;
  }

  public void setIdContact(int idContact) {
    this.idContact = idContact;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
