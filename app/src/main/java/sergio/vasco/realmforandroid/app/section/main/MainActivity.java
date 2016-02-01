package sergio.vasco.realmforandroid.app.section.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Bind;
import com.carlosdelachica.easyrecycleradapters.adapter.EasyRecyclerAdapter;
import com.carlosdelachica.easyrecycleradapters.adapter.EasyViewHolder;
import com.carlosdelachica.easyrecycleradapters.decorations.DividerItemDecoration;
import java.util.List;
import javax.inject.Inject;
import sergio.vasco.androidforexample.presentation.model.PresentationContact;
import sergio.vasco.androidforexample.presentation.sections.main.MainPresenter;
import sergio.vasco.realmforandroid.R;
import sergio.vasco.realmforandroid.app.di.injectableelements.BaseInjectionActivity;

import sergio.vasco.realmforandroid.app.section.main.di.DaggerMainActivityComponent;
import sergio.vasco.realmforandroid.app.section.main.di.MainActivityComponent;
import sergio.vasco.realmforandroid.app.section.main.di.MainActivityModule;
import sergio.vasco.realmforandroid.app.section.profile.create.CreateContactActivity;
import sergio.vasco.realmforandroid.app.ui.recyclerview.factories.CustomViewHolderFactory;
import sergio.vasco.realmforandroid.app.ui.recyclerview.viewholders.ContactViewHolder;
import sergio.vasco.androidforexample.presentation.sections.main.MainView;

public class MainActivity extends BaseInjectionActivity<MainActivityComponent> implements MainView,
    EasyViewHolder.OnItemClickListener, View.OnClickListener {

  @Inject MainPresenter presenter;

  private EasyRecyclerAdapter adapter;
  @Bind(R.id.recyclerView) RecyclerView recyclerView;
  @Bind(R.id.fab) FloatingActionButton fab;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    initUI();
  }

  @Override protected void initToolbar() {
    toolbar.setTitle(getString(R.string.app_name));
    setSupportActionBar(toolbar);
  }

  private void initUI() {
    initListeners();
    initAdapter();
    initRecyclerView();
  }

  private void initListeners() {
    fab.setOnClickListener(this);
  }

  @Override protected void onResume() {
    super.onResume();
    presenter.onResume();
    presenter.getContactsFromDataBase();
  }

  @Override protected void onPause() {
    super.onPause();
    presenter.onPause();
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

  @Override public void showLoader() {

  }

  @Override public void hideLoader() {

  }

  @Override public void loadContacts(List<PresentationContact> contactList) {
    adapter.addAll(contactList);
  }

  @Override public void onItemClick(int position, View view) {

  }

  @Override protected void initDI() {
    activityComponent = DaggerMainActivityComponent.builder()
        .appComponent(getAppComponent())
        .mainActivityModule(new MainActivityModule(this))
        .build();
    activityComponent.inject(this);
  }

  @Override public void onClick(View v) {
    Intent i = new Intent(this,CreateContactActivity.class);
    startActivity(i);
  }
}
