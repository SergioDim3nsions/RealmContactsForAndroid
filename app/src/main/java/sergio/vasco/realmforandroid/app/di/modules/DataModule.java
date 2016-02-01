package sergio.vasco.realmforandroid.app.di.modules;

import android.app.Application;
import com.path.android.jobqueue.JobManager;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.InteractorInvoker;
import sergio.vasco.realmforandroid.app.domain.BusImp;
import sergio.vasco.realmforandroid.app.domain.InteractorInvokerImp;
import sergio.vasco.realmforandroid.app.domain.InteractorJobImp;
import sergio.vasco.realmforandroid.data.repository.database.DataBaseService;
import sergio.vasco.realmforandroid.data.repository.database.DataBaseServiceImp;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
@Module
public class DataModule {

  @Singleton @Provides Bus provideEventBus(){
    return new BusImp();
  }

  @Singleton @Provides InteractorInvoker provideInteractorInvoker(JobManager jobManager){
    return new InteractorInvokerImp(jobManager);
  }

  @Singleton @Provides JobManager provideJobManager(Application app){
    return new JobManager(app);
  }

  @Singleton @Provides DataBaseService provideDataBaseService(Application app){
    return new DataBaseServiceImp(app);
  }
}
