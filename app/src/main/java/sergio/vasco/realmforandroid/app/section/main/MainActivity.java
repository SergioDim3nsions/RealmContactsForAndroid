package sergio.vasco.realmforandroid.app.section.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.carlosdelachica.easyrecycleradapters.adapter.EasyRecyclerAdapter;
import com.carlosdelachica.easyrecycleradapters.adapter.EasyViewHolder;
import com.carlosdelachica.easyrecycleradapters.decorations.DividerItemDecoration;
import sergio.vasco.androidforexample.presentation.model.PresentationContact;
import sergio.vasco.realmforandroid.R;
import sergio.vasco.realmforandroid.app.ui.recyclerview.factories.CustomViewHolderFactory;
import sergio.vasco.realmforandroid.app.ui.recyclerview.viewholders.ContactViewHolder;
import sergio.vasco.androidforexample.presentation.sections.main.MainView;

public class MainActivity extends AppCompatActivity implements MainView,
    EasyViewHolder.OnItemClickListener {

  private EasyRecyclerAdapter adapter;
  @Bind(R.id.recyclerView) RecyclerView recyclerView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    initToolbar();

    initAdapter();
    initRecyclerView();
  }

  private void initToolbar() {
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }

  private void initAdapter() {
    adapter = new EasyRecyclerAdapter(
        new CustomViewHolderFactory(this),
        PresentationContact.class,
        ContactViewHolder.class);
    adapter.setOnClickListener(this);
  }

  private void initRecyclerView() {
    recyclerView.setLayoutManager(
        new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    recyclerView.setAdapter(adapter);
    recyclerView.addItemDecoration(new DividerItemDecoration(this));
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  @Override public void showLoader() {

  }

  @Override public void hideLoader() {

  }

  @Override public void onItemClick(int position, View view) {

  }
}
