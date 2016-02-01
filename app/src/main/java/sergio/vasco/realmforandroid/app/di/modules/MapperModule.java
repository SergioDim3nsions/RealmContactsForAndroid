package sergio.vasco.realmforandroid.app.di.modules;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import sergio.vasco.androidforexample.presentation.mappers.PresentationContactMapper;
import sergio.vasco.realmforandroid.data.repository.database.model.mappers.DataContactMapper;

/**
 * Name: Sergio Vasco
 * Date: 1/2/16.
 */

@Module
public class MapperModule {

  @Singleton @Provides DataContactMapper provideDataContactMapper(){
    return new DataContactMapper();
  }

  @Singleton @Provides PresentationContactMapper providePresentationContactMapper(){
    return new PresentationContactMapper();
  }
}
