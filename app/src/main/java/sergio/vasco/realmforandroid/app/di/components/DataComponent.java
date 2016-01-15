package sergio.vasco.realmforandroid.app.di.components;

import sergio.vasco.androidforexample.domain.abstractions.Bus;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
public interface DataComponent {
  Bus provideEventBus();
}
