package sergio.vasco.realmforandroid.app.di.components;

import dagger.Component;
import javax.inject.Singleton;
import sergio.vasco.realmforandroid.app.App;
import sergio.vasco.realmforandroid.app.di.modules.AppModule;
import sergio.vasco.realmforandroid.app.di.modules.DataModule;
import sergio.vasco.realmforandroid.app.di.modules.InteractorModule;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */

@Singleton @Component(modules = {AppModule.class, DataModule.class, InteractorModule.class})
public interface AppComponent extends InteractorComponent, DataComponent{
  void inject(App app);
}
