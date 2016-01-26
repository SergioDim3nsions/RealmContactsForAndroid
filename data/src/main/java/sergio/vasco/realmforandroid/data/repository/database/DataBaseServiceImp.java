package sergio.vasco.realmforandroid.data.repository.database;

import android.content.Context;
import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmQuery;
import io.realm.RealmResults;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public class DataBaseServiceImp implements DataBaseService {

  private Context context;
  private Realm realm;

  public DataBaseServiceImp(Context context) {
    this.context = context;
  }

  @Override public void getInstance() {
    realm = Realm.getInstance(context);
  }

  @Override public void insert(RealmObject table) {
    getInstance();
    beginTransaction();
    realm.copyToRealm(table);
    commitTransaction();
  }

  @Override public <E extends RealmObject> RealmResults<E> query(Class<E> genericClass) {
    getInstance();
    RealmQuery<E> query = realm.where(genericClass);
    return query.findAll();
  }

  @Override public void beginTransaction() {
    realm.beginTransaction();
  }

  @Override public void commitTransaction() {
    realm.commitTransaction();
  }
}
