package sergio.vasco.realmforandroid.app.di.modules;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import sergio.vasco.androidforexample.domain.repository.ContactsRepository;
import sergio.vasco.androidforexample.repository.contacts.ContactsRepositoryImp;
import sergio.vasco.androidforexample.repository.datasources.ContactsDataSource;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
@Module
public class RepositoryModule {

  @Singleton @Provides ContactsRepository provideContactsRepository(ContactsDataSource contactsDataSource){
    return new ContactsRepositoryImp(contactsDataSource);
  }
}
