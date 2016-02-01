package sergio.vasco.realmforandroid.app.di.components;

import sergio.vasco.androidforexample.presentation.mappers.PresentationContactMapper;
import sergio.vasco.realmforandroid.data.repository.database.model.mappers.DataContactMapper;

/**
 * Name: Sergio Vasco
 * Date: 1/2/16.
 */
public interface MapperComponent {
  DataContactMapper provideDataContactMapper();
  PresentationContactMapper providePresentationContact();
}
