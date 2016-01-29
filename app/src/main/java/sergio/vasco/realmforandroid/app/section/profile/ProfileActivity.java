package sergio.vasco.realmforandroid.app.section.profile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import butterknife.Bind;
import javax.inject.Inject;
import sergio.vasco.androidforexample.presentation.sections.profile.ProfilePresenter;
import sergio.vasco.androidforexample.presentation.sections.profile.ProfileView;
import sergio.vasco.realmforandroid.R;
import sergio.vasco.realmforandroid.app.di.injectableelements.BaseInjectionActivity;
import sergio.vasco.realmforandroid.app.section.profile.di.DaggerProfileActivityComponent;
import sergio.vasco.realmforandroid.app.section.profile.di.ProfileActivityComponent;
import sergio.vasco.realmforandroid.app.section.profile.di.ProfileActivityModule;

public class ProfileActivity extends BaseInjectionActivity<ProfileActivityComponent> implements ProfileView {

  @Inject ProfilePresenter presenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_profile);
  }

  @Override protected void onResume() {
    super.onResume();
    presenter.onResume();
  }

  @Override protected void onPause() {
    super.onPause();
    presenter.onPause();
  }

  @Override protected void initDI() {
    activityComponent = DaggerProfileActivityComponent.builder()
        .appComponent(getAppComponent())
        .profileActivityModule(new ProfileActivityModule(this))
        .build();
    activityComponent.inject(this);
  }

  @Override protected void initToolbar() {
    toolbar.setTitle(R.string.new_contact_title);
    setSupportActionBar(toolbar);
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_profile, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_accept) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
