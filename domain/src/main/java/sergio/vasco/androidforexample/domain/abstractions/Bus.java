package sergio.vasco.androidforexample.domain.abstractions;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 31/3/15.
 */
public interface Bus {
  void post(Object object);
  void postInmediate(Object object);
  void register(Object object);
  void unregister(Object object);
}
