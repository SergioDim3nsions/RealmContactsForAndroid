package sergio.vasco.realmforandroid.app.section.main.di;

import dagger.Module;
import dagger.Provides;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.presentation.sections.main.MainPresenter;
import sergio.vasco.realmforandroid.app.di.scopes.PerActivity;
import sergio.vasco.realmforandroid.app.domain.BusImp;
import sergio.vasco.realmforandroid.app.section.main.MainActivity;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
@Module
public class MainActivityModule {

  private final MainActivity mainActivity;

  public MainActivityModule(MainActivity mainActivity) {
    this.mainActivity = mainActivity;
  }

  @PerActivity @Provides MainPresenter providedMainPresenter(Bus bus){
    return new MainPresenter(mainActivity,bus);
  }
}
