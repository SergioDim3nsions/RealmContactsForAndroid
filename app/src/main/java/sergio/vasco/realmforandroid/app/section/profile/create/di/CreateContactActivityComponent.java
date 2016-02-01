package sergio.vasco.realmforandroid.app.section.profile.create.di;

import dagger.Component;
import sergio.vasco.realmforandroid.app.di.components.AppComponent;
import sergio.vasco.realmforandroid.app.di.scopes.PerActivity;
import sergio.vasco.realmforandroid.app.section.profile.create.CreateContactActivity;

/**
 * Name: Sergio Vasco
 * Date: 29/1/16.
 */
@PerActivity @Component(dependencies = AppComponent.class, modules = CreateContactActivityModule.class)
public interface CreateContactActivityComponent {
  void inject(CreateContactActivity createContactActivity);
}
