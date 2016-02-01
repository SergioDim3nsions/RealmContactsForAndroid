package sergio.vasco.realmforandroid.app.section.profile.edit.di;

import dagger.Component;
import sergio.vasco.realmforandroid.app.di.components.AppComponent;
import sergio.vasco.realmforandroid.app.di.scopes.PerActivity;
import sergio.vasco.realmforandroid.app.section.profile.create.CreateContactActivity;
import sergio.vasco.realmforandroid.app.section.profile.edit.EditContactActivity;

/**
 * Name: Sergio Vasco
 * Date: 29/1/16.
 */
@PerActivity @Component(dependencies = AppComponent.class, modules = EditContactActivityModule.class)
public interface EditContactActivityComponent {
  void inject(EditContactActivity editContactActivity);
}
