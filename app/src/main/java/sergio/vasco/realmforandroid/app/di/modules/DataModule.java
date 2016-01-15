package sergio.vasco.realmforandroid.app.di.modules;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.realmforandroid.app.domain.BusImp;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
@Module
public class DataModule {
  @Singleton @Provides Bus provideEventBus(){
    return new BusImp();
  }
}
