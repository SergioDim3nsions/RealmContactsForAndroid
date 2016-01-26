package sergio.vasco.androidforexample.domain.interactors.main;

import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.Interactor;
import sergio.vasco.androidforexample.domain.model.Contact;
import sergio.vasco.androidforexample.domain.repository.ContactsRepository;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public class InsertContactsIntoDataBaseInteractor implements Interactor {

  private Contact contact;
  private ContactsRepository contactsRepository;
  private Bus bus;

  public InsertContactsIntoDataBaseInteractor(Bus bus,ContactsRepository contactsRepository) {
    this.bus = bus;
    this.contactsRepository = contactsRepository;
  }

  @Override public void execute() throws Throwable {
    contactsRepository.insertContact(contact);
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }
}
