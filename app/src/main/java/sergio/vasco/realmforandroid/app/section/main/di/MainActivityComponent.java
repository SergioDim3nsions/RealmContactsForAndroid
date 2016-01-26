package sergio.vasco.realmforandroid.app.section.main.di;

import dagger.Component;
import sergio.vasco.realmforandroid.app.di.components.AppComponent;
import sergio.vasco.realmforandroid.app.di.scopes.PerActivity;
import sergio.vasco.realmforandroid.app.section.main.MainActivity;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
@PerActivity @Component(dependencies = AppComponent.class, modules = MainActivityModule.class)
public interface MainActivityComponent {
  void inject(MainActivity mainActivity);
}
