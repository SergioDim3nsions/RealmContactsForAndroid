package sergio.vasco.realmforandroid.app.di.components;

import dagger.Component;
import javax.inject.Singleton;
import sergio.vasco.realmforandroid.app.App;
import sergio.vasco.realmforandroid.app.di.modules.AppModule;
import sergio.vasco.realmforandroid.app.di.modules.DataModule;
import sergio.vasco.realmforandroid.app.di.modules.DataSourceComponent;
import sergio.vasco.realmforandroid.app.di.modules.InteractorModule;
import sergio.vasco.realmforandroid.app.di.modules.RepositoryModule;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */

@Singleton @Component(modules = {AppModule.class, DataModule.class, InteractorModule.class,
    RepositoryModule.class, DataSourceComponent.class})
public interface AppComponent extends InteractorComponent, DataComponent,
    sergio.vasco.realmforandroid.app.di.components.DataSourceComponent, RepositoryComponent {
  void inject(App app);
}
