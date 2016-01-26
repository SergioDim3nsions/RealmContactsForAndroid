package sergio.vasco.realmforandroid.data.repository.database.model.mappers;

import sergio.vasco.androidforexample.domain.model.Contact;
import sergio.vasco.realmforandroid.data.repository.database.model.DataBaseContact;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public class ContactMapper {

  public Contact dataBaseContactToContact(DataBaseContact dataBaseContact){
    Contact contact = new Contact();
    contact.setIdContact(dataBaseContact.getIdContact());
    contact.setFirstName(dataBaseContact.getFirstName());
    contact.setLastName(dataBaseContact.getLastName());
    contact.setEmail(dataBaseContact.getEmail());
    contact.setPhone(dataBaseContact.getPhone());
    return contact;
  }

  public DataBaseContact contactToDataBaseContact(Contact contact){
    DataBaseContact dataBaseContact = new DataBaseContact();
    dataBaseContact.setIdContact(contact.getIdContact());
    dataBaseContact.setFirstName(contact.getFirstName());
    dataBaseContact.setLastName(contact.getLastName());
    dataBaseContact.setEmail(contact.getEmail());
    dataBaseContact.setPhone(contact.getPhone());
    return dataBaseContact;
  }
}
