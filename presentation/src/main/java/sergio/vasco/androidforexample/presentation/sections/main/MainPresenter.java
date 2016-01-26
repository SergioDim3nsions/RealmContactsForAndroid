package sergio.vasco.androidforexample.presentation.sections.main;

import java.util.ArrayList;
import java.util.List;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.InteractorInvoker;
import sergio.vasco.androidforexample.domain.interactors.main.GetContactsFromDataBaseInteractor;
import sergio.vasco.androidforexample.domain.interactors.main.InsertContactsIntoDataBaseInteractor;
import sergio.vasco.androidforexample.domain.interactors.main.events.GetContactsEvent;
import sergio.vasco.androidforexample.domain.model.Contact;
import sergio.vasco.androidforexample.presentation.Presenter;
import sergio.vasco.androidforexample.presentation.mappers.ContactMapper;
import sergio.vasco.androidforexample.presentation.model.PresentationContact;

/**
 * Name: Sergio Vasco
 * Date: 14/1/16.
 */
public class MainPresenter extends Presenter{
  private MainView view;
  private Bus bus;
  private InteractorInvoker interactorInvoker;
  private InsertContactsIntoDataBaseInteractor insertContactsIntoDataBaseInteractor;
  private GetContactsFromDataBaseInteractor getContactsFromDataBaseInteractor;
  private ContactMapper contactMapper;

  public MainPresenter(MainView view, Bus bus,InteractorInvoker interactorInvoker,InsertContactsIntoDataBaseInteractor insertContactsIntoDataBaseInteractor, GetContactsFromDataBaseInteractor getContactsFromDataBaseInteractor) {
    this.view = view;
    this.bus = bus;
    this.interactorInvoker = interactorInvoker;
    this.insertContactsIntoDataBaseInteractor = insertContactsIntoDataBaseInteractor;
    this.getContactsFromDataBaseInteractor = getContactsFromDataBaseInteractor;
    this.contactMapper = new ContactMapper();
  }

  public void insertContactIntoDataBase(PresentationContact presentationContact){
    Contact contact = contactMapper.presentationContactToContact(presentationContact);
    insertContactsIntoDataBaseInteractor.setContact(contact);
    interactorInvoker.execute(insertContactsIntoDataBaseInteractor);
  }

  public void getContactsFromDataBase(){
    interactorInvoker.execute(getContactsFromDataBaseInteractor);
  }

  @Override public void onResume() {
    bus.register(this);
  }

  @Override public void onPause() {
    bus.unregister(this);
  }

  public void onEvent(GetContactsEvent event){
    if(event.getError() == null){

      List<PresentationContact> presentationContactList = new ArrayList<>();

      List<Contact> contactList = event.getContactList();
      for (Contact contact : contactList) {
        PresentationContact presentationContact = contactMapper.contactToPresentationContact(contact);
        presentationContactList.add(presentationContact);
      }

      view.loadContacts(presentationContactList);
    }
  }

}
