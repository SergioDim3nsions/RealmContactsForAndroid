package sergio.vasco.realmforandroid.app.di.components;

import sergio.vasco.androidforexample.repository.datasources.ContactsDataSource;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public interface DataSourceComponent {
  ContactsDataSource provideDataBaseDataSource();
}
