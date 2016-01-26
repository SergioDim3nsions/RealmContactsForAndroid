package sergio.vasco.androidforexample.repository.datasources;

import java.util.List;
import sergio.vasco.androidforexample.domain.model.Contact;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public interface ContactsDataSource {
  void insertContact(Contact contact);
  void deleteContact();
  void updateContact();
  List<Contact> getContacts();
}
