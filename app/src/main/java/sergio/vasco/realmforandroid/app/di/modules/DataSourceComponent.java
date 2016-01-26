package sergio.vasco.realmforandroid.app.di.modules;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import sergio.vasco.androidforexample.repository.datasources.ContactsDataSource;
import sergio.vasco.realmforandroid.data.repository.database.DataBaseService;
import sergio.vasco.realmforandroid.data.repository.database.datasources.ContactsDataSourceImp;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
@Module
public class DataSourceComponent {

  @Singleton @Provides ContactsDataSource provideContactsDataSource(DataBaseService dataBaseService){
    return new ContactsDataSourceImp(dataBaseService);
  }
}
