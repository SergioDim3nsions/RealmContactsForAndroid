package sergio.vasco.androidforexample.domain.repository;

import java.util.List;
import sergio.vasco.androidforexample.domain.model.Contact;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public interface ContactsRepository {
  List<Contact> getContacts();
  void insertContact(Contact contact);
}
