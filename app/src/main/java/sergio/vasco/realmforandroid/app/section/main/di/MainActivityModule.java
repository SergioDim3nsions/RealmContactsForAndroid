package sergio.vasco.realmforandroid.app.section.main.di;

import dagger.Module;
import dagger.Provides;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.InteractorInvoker;
import sergio.vasco.androidforexample.domain.interactors.main.GetContactsFromDataBaseInteractor;
import sergio.vasco.androidforexample.domain.interactors.main.InsertContactsIntoDataBaseInteractor;
import sergio.vasco.androidforexample.presentation.mappers.PresentationContactMapper;
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

  @PerActivity @Provides MainPresenter providedMainPresenter(Bus bus,InteractorInvoker interactorInvoker, InsertContactsIntoDataBaseInteractor insertContactsIntoDataBaseInteractor,GetContactsFromDataBaseInteractor getContactsFromDataBaseInteractor,  PresentationContactMapper presentationContactMapper){
    return new MainPresenter(mainActivity,bus,interactorInvoker,insertContactsIntoDataBaseInteractor,getContactsFromDataBaseInteractor, presentationContactMapper);
  }
}
