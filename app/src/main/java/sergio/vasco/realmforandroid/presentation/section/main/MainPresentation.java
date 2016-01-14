package sergio.vasco.realmforandroid.presentation.section.main;

import android.content.Context;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.List;
import sergio.vasco.realmforandroid.domain.model.Contact;

/**
 * Name: Sergio Vasco
 * Date: 14/1/16.
 */
public class MainPresentation {
  private MainView view;

  public MainPresentation(MainView view) {
    this.view = view;
  }

  public void createDBAndDataFirsTime(){
    Realm realm = Realm.getInstance((Context) view);
    realm.beginTransaction();
    Contact contact = realm.createObject(Contact.class);

    //... add or update objects here ...
    realm.commitTransaction();
  }

  public void getContactsFromDataBase(){
    List<Contact> contactsList = new ArrayList<>();
    view.loadContacts(contactsList);
  }
}
