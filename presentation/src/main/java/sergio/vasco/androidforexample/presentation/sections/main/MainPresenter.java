package sergio.vasco.androidforexample.presentation.sections.main;

import sergio.vasco.androidforexample.presentation.Presenter;

/**
 * Name: Sergio Vasco
 * Date: 14/1/16.
 */
public class MainPresenter extends Presenter{
  private MainView view;

  public MainPresenter(MainView view) {
    this.view = view;
  }

  public void getContactsFromDataBase(){
    //List<DBContact> contactsList = new ArrayList<>();
    //view.loadContacts(contactsList);
  }

  @Override public void onResume() {

  }

  @Override public void onPause() {

  }
}
