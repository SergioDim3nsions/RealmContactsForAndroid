package sergio.vasco.realmforandroid.app.section.profile.di;

import dagger.Module;
import dagger.Provides;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.InteractorInvoker;
import sergio.vasco.androidforexample.domain.interactors.main.InsertContactsIntoDataBaseInteractor;
import sergio.vasco.androidforexample.presentation.sections.profile.ProfilePresenter;
import sergio.vasco.realmforandroid.app.di.scopes.PerActivity;
import sergio.vasco.realmforandroid.app.section.profile.ProfileActivity;

/**
 * Name: Sergio Vasco
 * Date: 29/1/16.
 */
@Module
public class ProfileActivityModule {

  private final ProfileActivity profileActivity;

  public ProfileActivityModule(ProfileActivity profileActivity) {
    this.profileActivity = profileActivity;
  }

  @PerActivity @Provides ProfilePresenter provideProfilePresenter(Bus bus, InteractorInvoker interactorInvoker, InsertContactsIntoDataBaseInteractor insertContactsIntoDataBaseInteractor){
    return new ProfilePresenter(profileActivity,bus,interactorInvoker,insertContactsIntoDataBaseInteractor);
  }
}
