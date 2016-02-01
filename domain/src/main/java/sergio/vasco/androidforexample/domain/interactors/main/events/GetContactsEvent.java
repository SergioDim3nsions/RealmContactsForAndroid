package sergio.vasco.androidforexample.domain.interactors.main.events;

import java.util.List;
import sergio.vasco.androidforexample.domain.interactors.BaseEvent;
import sergio.vasco.androidforexample.domain.model.Contact;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public class GetContactsEvent extends BaseEvent {
  private List<Contact> contactList;

  public List<Contact> getContactList() {
    return contactList;
  }

  public void setContactList(List<Contact> contactList) {
    this.contactList = contactList;
  }
}
