package sergio.vasco.realmforandroid.app.base;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import butterknife.Bind;
import butterknife.ButterKnife;
import sergio.vasco.realmforandroid.R;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
public abstract class BaseUIActivity extends AppCompatActivity {

  protected @Bind(R.id.toolbar) Toolbar toolbar;

  @Override public void setContentView(int layoutResID) {
    super.setContentView(layoutResID);
    ButterKnife.bind(this);
  }

  @Override protected void onStart() {
    super.onStart();
    initToolbar();
  }

  protected abstract void initToolbar();
}
