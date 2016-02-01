package sergio.vasco.realmforandroid.app.section.profile.edit;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import butterknife.Bind;
import javax.inject.Inject;
import sergio.vasco.androidforexample.presentation.sections.profile.ProfilePresenter;
import sergio.vasco.androidforexample.presentation.sections.profile.ProfileView;
import sergio.vasco.realmforandroid.R;
import sergio.vasco.realmforandroid.app.section.profile.BaseContactActivity;

import sergio.vasco.realmforandroid.app.section.profile.create.di.DaggerCreateContactActivityComponent;
import sergio.vasco.realmforandroid.app.section.profile.edit.di.DaggerEditContactActivityComponent;
import sergio.vasco.realmforandroid.app.section.profile.edit.di.EditContactActivityComponent;
import sergio.vasco.realmforandroid.app.section.profile.edit.di.EditContactActivityModule;

public class EditContactActivity extends BaseContactActivity<EditContactActivityComponent>
    implements ProfileView {

  @Inject ProfilePresenter presenter;
  @Bind(R.id.firstName) EditText firstName;
  @Bind(R.id.lastName) EditText lastName;
  @Bind(R.id.phone) EditText phone;
  @Bind(R.id.email) EditText email;

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

  @Override protected void initToolbar() {
    toolbar.setTitle(R.string.edit_contact_title);
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

  @Override protected void initDI() {
    activityComponent = DaggerEditContactActivityComponent.builder()
        .appComponent(getAppComponent())
        .editContactActivityModule(new EditContactActivityModule(this))
        .build();
    activityComponent.inject(this);
  }
}
