package sergio.vasco.realmforandroid.app.di.components;

import dagger.Component;
import javax.inject.Singleton;
import sergio.vasco.realmforandroid.app.App;
import sergio.vasco.realmforandroid.app.di.modules.AppModule;
import sergio.vasco.realmforandroid.app.di.modules.DataModule;
import sergio.vasco.realmforandroid.app.di.modules.DataSourceModule;
import sergio.vasco.realmforandroid.app.di.modules.InteractorModule;
import sergio.vasco.realmforandroid.app.di.modules.MapperModule;
import sergio.vasco.realmforandroid.app.di.modules.RepositoryModule;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */

@Singleton @Component(modules = {AppModule.class, DataModule.class, InteractorModule.class,
    RepositoryModule.class, DataSourceModule.class, MapperModule.class})
public interface AppComponent extends InteractorComponent, DataComponent,
    DataSourceComponent, RepositoryComponent, MapperComponent {
  void inject(App app);
}
