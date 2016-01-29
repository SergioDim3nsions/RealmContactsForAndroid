package sergio.vasco.androidforexample.presentation.sections.profile;

import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.InteractorInvoker;
import sergio.vasco.androidforexample.domain.interactors.main.InsertContactsIntoDataBaseInteractor;
import sergio.vasco.androidforexample.presentation.Presenter;
import sergio.vasco.androidforexample.presentation.sections.main.MainView;

/**
 * Name: Sergio Vasco
 * Date: 29/1/16.
 */
public class ProfilePresenter extends Presenter {
  private ProfileView view;
  private Bus bus;
  private InteractorInvoker interactorInvoker;
  private InsertContactsIntoDataBaseInteractor insertContactsIntoDataBaseInteractor;

  public ProfilePresenter(ProfileView view, Bus bus, InteractorInvoker interactorInvoker,
      InsertContactsIntoDataBaseInteractor insertContactsIntoDataBaseInteractor) {
    this.view = view;
    this.bus = bus;
    this.interactorInvoker = interactorInvoker;
    this.insertContactsIntoDataBaseInteractor = insertContactsIntoDataBaseInteractor;
  }

  @Override public void onResume() {

  }

  @Override public void onPause() {

  }
}
