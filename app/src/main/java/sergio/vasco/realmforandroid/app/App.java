package sergio.vasco.realmforandroid.app;

import android.app.Application;
import sergio.vasco.realmforandroid.app.di.components.DaggerSectionActivityComponent;
import sergio.vasco.realmforandroid.app.di.components.SectionActivityComponent;
import sergio.vasco.realmforandroid.app.di.components.AppComponent;
import sergio.vasco.realmforandroid.app.di.components.DaggerAppComponent;
import sergio.vasco.realmforandroid.app.di.modules.SectionActivityModule;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
public class App extends Application {

  private AppComponent appComponent;
  private SectionActivityComponent sectionActivityComponent;

  @Override public void onCreate() {
    super.onCreate();
    initDI();
  }

  private void initDI() {
    initAppComponent();
    initActivityComponent();
  }

  private void initActivityComponent() {
    sectionActivityComponent = DaggerSectionActivityComponent.builder()
        .appComponent(appComponent).sectionActivityModule(new SectionActivityModule())
        .build();
    sectionActivityComponent.inject(this);
  }

  private void initAppComponent() {
    appComponent = DaggerAppComponent.create();
    appComponent.inject(this);
  }

  public AppComponent getAppComponent() {
    return appComponent;
  }

  public SectionActivityComponent getSectionActivityComponent() {
    return sectionActivityComponent;
  }
}
