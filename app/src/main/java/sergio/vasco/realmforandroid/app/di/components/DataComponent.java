package sergio.vasco.realmforandroid.app.di.components;

import com.path.android.jobqueue.JobManager;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.InteractorInvoker;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
public interface DataComponent {
  Bus provideEventBus();
  JobManager provideJobManager();
  InteractorInvoker provideInteractorInvoker();
}
