package sergio.vasco.androidforexample.domain.interactors.main;

import java.util.List;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.Interactor;
import sergio.vasco.androidforexample.domain.interactors.main.events.GetContactsEvent;
import sergio.vasco.androidforexample.domain.model.Contact;
import sergio.vasco.androidforexample.domain.repository.ContactsRepository;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
public class GetContactsFromDataBaseInteractor implements Interactor {

  private Bus bus;
  private GetContactsEvent event;
  private ContactsRepository contactsRepository;

  public GetContactsFromDataBaseInteractor(Bus bus, ContactsRepository contactsRepository) {
    this.bus = bus;
    this.contactsRepository = contactsRepository;
    this.event = new GetContactsEvent();
  }

  @Override public void execute() throws Throwable {
    List<Contact> contactList = contactsRepository.getContacts();
    event.setContactList(contactList);
    bus.post(event);
  }
}
