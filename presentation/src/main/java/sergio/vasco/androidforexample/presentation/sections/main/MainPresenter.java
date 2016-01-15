package sergio.vasco.androidforexample.presentation.sections.main;

import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.presentation.Presenter;

/**
 * Name: Sergio Vasco
 * Date: 14/1/16.
 */
public class MainPresenter extends Presenter{
  private MainView view;
  private Bus bus;

  public MainPresenter(MainView view, Bus bus) {
    this.view = view;
    this.bus = bus;
  }

  public void getContactsFromDataBase(){
    //List<DBContact> contactsList = new ArrayList<>();
    //view.loadContacts(contactsList);
  }

  @Override public void onResume() {
    //bus.register(this);
  }

  @Override public void onPause() {
    //bus.unregister(this);
  }
}
