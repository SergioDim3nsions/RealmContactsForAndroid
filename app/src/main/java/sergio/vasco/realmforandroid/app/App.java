package sergio.vasco.realmforandroid.app;

import android.app.Application;

import sergio.vasco.realmforandroid.app.di.components.AppComponent;

import sergio.vasco.realmforandroid.app.di.components.DaggerAppComponent;
import sergio.vasco.realmforandroid.app.di.modules.AppModule;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
public class App extends Application {

  private AppComponent appComponent;

  @Override public void onCreate() {
    super.onCreate();
    initDI();
  }

  private void initDI() {
    initAppComponent();
  }

  private void initAppComponent() {
    appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    appComponent.inject(this);
  }

  public AppComponent getAppComponent() {
    return appComponent;
  }
}
