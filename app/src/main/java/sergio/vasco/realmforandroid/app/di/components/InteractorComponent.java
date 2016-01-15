package sergio.vasco.realmforandroid.app.di.components;

import sergio.vasco.androidforexample.domain.interactors.main.GetContactsFromDataBaseInteractor;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
public interface InteractorComponent {
  GetContactsFromDataBaseInteractor provideGetContactsFromDataBaseInteractor();
}
