package sergio.vasco.realmforandroid.app.di.modules;

import android.app.Application;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import sergio.vasco.realmforandroid.app.App;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */

@Module
public class AppModule {

  private final App app;

  public AppModule(App app) {
    this.app = app;
  }

  @Singleton @Provides Application provideApplication(){
    return app;
  }
}
