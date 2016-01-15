package sergio.vasco.realmforandroid.app.di.components;

import dagger.Component;
import javax.inject.Singleton;
import sergio.vasco.realmforandroid.app.App;
import sergio.vasco.realmforandroid.app.di.modules.AppModule;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */

@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
  void inject(App app);
}
