package sergio.vasco.androidforexample.presentation.sections.profile;

import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.InteractorInvoker;
import sergio.vasco.androidforexample.domain.interactors.main.InsertContactsIntoDataBaseInteractor;
import sergio.vasco.androidforexample.presentation.Presenter;
import sergio.vasco.androidforexample.presentation.mappers.PresentationContactMapper;
import sergio.vasco.androidforexample.presentation.model.PresentationContact;
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
  private PresentationContactMapper presentationContactMapper;

  public ProfilePresenter(ProfileView view, Bus bus, InteractorInvoker interactorInvoker,
      InsertContactsIntoDataBaseInteractor insertContactsIntoDataBaseInteractor,  PresentationContactMapper presentationContactMapper) {
    this.view = view;
    this.bus = bus;
    this.interactorInvoker = interactorInvoker;
    this.insertContactsIntoDataBaseInteractor = insertContactsIntoDataBaseInteractor;
    this.presentationContactMapper = presentationContactMapper;
  }

  @Override public void onResume() {
    //bus.register(this);
  }

  @Override public void onPause() {
    //bus.unregister(this);
  }

  public void createNewContact(PresentationContact presentationContact){

    //insertContactsIntoDataBaseInteractor.setContact();
    interactorInvoker.execute(insertContactsIntoDataBaseInteractor);
  }
}
