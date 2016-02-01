package sergio.vasco.realmforandroid.app.section.profile.create.di;

import dagger.Module;
import dagger.Provides;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.InteractorInvoker;
import sergio.vasco.androidforexample.domain.interactors.main.InsertContactsIntoDataBaseInteractor;
import sergio.vasco.androidforexample.presentation.mappers.PresentationContactMapper;
import sergio.vasco.androidforexample.presentation.sections.profile.ProfilePresenter;
import sergio.vasco.realmforandroid.app.di.scopes.PerActivity;
import sergio.vasco.realmforandroid.app.section.profile.create.CreateContactActivity;

/**
 * Name: Sergio Vasco
 * Date: 29/1/16.
 */
@Module
public class CreateContactActivityModule {

  private final CreateContactActivity createContactActivity;

  public CreateContactActivityModule(CreateContactActivity createContactActivity) {
    this.createContactActivity = createContactActivity;
  }

  @PerActivity @Provides ProfilePresenter provideProfilePresenter(Bus bus, InteractorInvoker interactorInvoker, InsertContactsIntoDataBaseInteractor insertContactsIntoDataBaseInteractor,  PresentationContactMapper presentationContactMapper){
    return new ProfilePresenter(createContactActivity,bus,interactorInvoker,insertContactsIntoDataBaseInteractor, presentationContactMapper);
  }
}
