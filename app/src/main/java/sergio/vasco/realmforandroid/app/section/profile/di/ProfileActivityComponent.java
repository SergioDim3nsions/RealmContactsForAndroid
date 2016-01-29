package sergio.vasco.realmforandroid.app.section.profile.di;

import dagger.Component;
import sergio.vasco.realmforandroid.app.di.components.AppComponent;
import sergio.vasco.realmforandroid.app.di.scopes.PerActivity;
import sergio.vasco.realmforandroid.app.section.profile.ProfileActivity;

/**
 * Name: Sergio Vasco
 * Date: 29/1/16.
 */
@PerActivity @Component(dependencies = AppComponent.class, modules = ProfileActivityModule.class)
public interface ProfileActivityComponent {
  void inject(ProfileActivity profileActivity);
}
