package sergio.vasco.realmforandroid.app.di.injectableelements;

import android.os.Bundle;
import sergio.vasco.realmforandroid.app.App;
import sergio.vasco.realmforandroid.app.base.BaseUIActivity;
import sergio.vasco.realmforandroid.app.di.components.SectionActivityComponent;
import sergio.vasco.realmforandroid.app.di.components.AppComponent;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
public abstract class BaseInjectionActivity<T> extends BaseUIActivity {

  protected T activityComponent;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initDI();
  }

  protected abstract void initDI();

  public AppComponent getAppComponent() {
    AppComponent appComponent = ((App) getApplication()).getAppComponent();
    return appComponent;
  }

  public SectionActivityComponent getSectionActivityComponent() {
    SectionActivityComponent
        sectionActivityComponent = ((App) getApplication()).getSectionActivityComponent();
    return sectionActivityComponent;
  }

  protected Object getActivityComponent() {
    return activityComponent;
  }
}
