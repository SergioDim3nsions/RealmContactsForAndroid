package sergio.vasco.realmforandroid.data.repository.database;

import io.realm.RealmObject;
import io.realm.RealmResults;

/**
 * Name: Sergio Vasco
 * Date: 26/1/16.
 */
public interface DataBaseService {
  void getInstance();
  void insert(RealmObject table);
  <E extends RealmObject> RealmResults<E> query (Class<E> genericClass);
  void beginTransaction();
  void commitTransaction();
}
