package sergio.vasco.realmforandroid.app.di.components;

import dagger.Component;
import sergio.vasco.realmforandroid.app.App;
import sergio.vasco.realmforandroid.app.di.modules.SectionActivityModule;
import sergio.vasco.realmforandroid.app.di.scopes.PerSectionInActivity;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
@PerSectionInActivity @Component(dependencies = AppComponent.class, modules = SectionActivityModule.class)
public interface SectionActivityComponent {
  void inject(App app);
}
