package sergio.vasco.realmforandroid.app.di.components;

import sergio.vasco.androidforexample.domain.repository.ContactsRepository;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public interface RepositoryComponent {
  ContactsRepository provideContactsRepository();
}
