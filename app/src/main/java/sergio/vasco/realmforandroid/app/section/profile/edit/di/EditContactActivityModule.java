package sergio.vasco.realmforandroid.app.section.profile.edit.di;

import dagger.Module;
import dagger.Provides;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.InteractorInvoker;
import sergio.vasco.androidforexample.domain.interactors.main.InsertContactsIntoDataBaseInteractor;
import sergio.vasco.androidforexample.presentation.mappers.PresentationContactMapper;
import sergio.vasco.androidforexample.presentation.sections.profile.ProfilePresenter;
import sergio.vasco.realmforandroid.app.di.scopes.PerActivity;
import sergio.vasco.realmforandroid.app.section.profile.create.CreateContactActivity;
import sergio.vasco.realmforandroid.app.section.profile.edit.EditContactActivity;

/**
 * Name: Sergio Vasco
 * Date: 29/1/16.
 */
@Module
public class EditContactActivityModule {

  private final EditContactActivity editContactActivity;

  public EditContactActivityModule(EditContactActivity editContactActivity) {
    this.editContactActivity = editContactActivity;
  }

  @PerActivity @Provides ProfilePresenter provideProfilePresenter(Bus bus, InteractorInvoker interactorInvoker, InsertContactsIntoDataBaseInteractor insertContactsIntoDataBaseInteractor, PresentationContactMapper presentationContactMapper){
    return new ProfilePresenter(editContactActivity,bus,interactorInvoker,insertContactsIntoDataBaseInteractor, presentationContactMapper);
  }
}
