package sergio.vasco.androidforexample.presentation.mappers;

import java.util.ArrayList;
import java.util.List;
import sergio.vasco.androidforexample.domain.model.Contact;
import sergio.vasco.androidforexample.presentation.model.PresentationContact;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public class ContactMapper {

  public Contact presentationContactToContact(PresentationContact presentationContact){
    Contact contact = new Contact();
    contact.setIdContact(presentationContact.getIdContact());
    contact.setFirstName(presentationContact.getFirstName());
    contact.setLastName(presentationContact.getLastName());
    contact.setEmail(presentationContact.getEmail());
    contact.setPhone(presentationContact.getPhone());
    return contact;
  }

  public PresentationContact contactToPresentationContact(Contact contact){
    PresentationContact presentationContact = new PresentationContact();
    presentationContact.setIdContact(contact.getIdContact());
    presentationContact.setFirstName(contact.getFirstName());
    presentationContact.setLastName(contact.getLastName());
    presentationContact.setEmail(contact.getEmail());
    presentationContact.setPhone(contact.getPhone());
    return presentationContact;
  }

  public List<PresentationContact> ContactsListToPresentationContactList(List<Contact> contactList){
    List<PresentationContact> presentationContactList = new ArrayList<>();

    for (Contact contact : contactList) {
      PresentationContact presentationContact = contactToPresentationContact(contact);
      presentationContactList.add(presentationContact);
    }
    return presentationContactList;
  }
}
