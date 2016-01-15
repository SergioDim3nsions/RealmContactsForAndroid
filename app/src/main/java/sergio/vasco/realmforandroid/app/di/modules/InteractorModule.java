package sergio.vasco.realmforandroid.app.di.modules;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.main.GetContactsFromDataBaseInteractor;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
@Module
public class InteractorModule {

  @Singleton @Provides GetContactsFromDataBaseInteractor provideGetContactsFromDataBaseInteractor(Bus bus){
    return new GetContactsFromDataBaseInteractor(bus);
  }
}
