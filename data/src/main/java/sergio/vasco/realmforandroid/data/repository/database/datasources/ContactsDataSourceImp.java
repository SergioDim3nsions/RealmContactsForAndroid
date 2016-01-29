package sergio.vasco.realmforandroid.data.repository.database.datasources;

import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.List;
import sergio.vasco.androidforexample.domain.model.Contact;
import sergio.vasco.androidforexample.repository.datasources.ContactsDataSource;
import sergio.vasco.realmforandroid.data.repository.database.DataBaseService;
import sergio.vasco.realmforandroid.data.repository.database.model.DataBaseContact;
import sergio.vasco.realmforandroid.data.repository.database.model.mappers.ContactMapper;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public class ContactsDataSourceImp implements ContactsDataSource {

  private DataBaseService dataBaseService;
  private ContactMapper contactMapper;

  public ContactsDataSourceImp(DataBaseService dataBaseService) {
    this.dataBaseService = dataBaseService;
    this.contactMapper = new ContactMapper();
  }

  @Override public void insertContact(Contact contact) {
    DataBaseContact dataBaseContact = contactMapper.contactToDataBaseContact(contact);
    int nextId = dataBaseService.getNextId("idContact", DataBaseContact.class);
    dataBaseContact.setIdContact(nextId);
    dataBaseService.insert(dataBaseContact);
  }

  @Override public void deleteContact() {

  }

  @Override public void updateContact() {

  }

  @Override public List<Contact> getContacts() {
    List<Contact> contactList = new ArrayList<>();

    RealmResults<DataBaseContact> resultsList = dataBaseService.query(DataBaseContact.class);
    for (DataBaseContact dataBaseContact : resultsList) {
      Contact contact = contactMapper.dataBaseContactToContact(dataBaseContact);
      contactList.add(contact);
    }

    return contactList;
  }
}
