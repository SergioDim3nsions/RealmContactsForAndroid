package sergio.vasco.androidforexample.repository.contacts;

import java.util.List;
import sergio.vasco.androidforexample.domain.model.Contact;
import sergio.vasco.androidforexample.domain.repository.ContactsRepository;
import sergio.vasco.androidforexample.repository.datasources.ContactsDataSource;

public class ContactsRepositoryImp implements ContactsRepository{

  private ContactsDataSource contactsDataBaseDataSource;

  public ContactsRepositoryImp(ContactsDataSource contactsDataBaseDataSource) {
    this.contactsDataBaseDataSource = contactsDataBaseDataSource;
  }

  @Override public List<Contact> getContacts() {
    return contactsDataBaseDataSource.getContacts();
  }

  @Override public void insertContact(Contact contact) {
    contactsDataBaseDataSource.insertContact(contact);
  }
}
