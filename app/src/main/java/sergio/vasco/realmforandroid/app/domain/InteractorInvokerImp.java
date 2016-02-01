package sergio.vasco.realmforandroid.app.domain;

import com.path.android.jobqueue.Job;
import com.path.android.jobqueue.JobManager;
import com.path.android.jobqueue.Params;
import sergio.vasco.androidforexample.domain.interactors.Interactor;
import sergio.vasco.androidforexample.domain.interactors.InteractorInvoker;
import sergio.vasco.androidforexample.domain.interactors.InteractorPriority;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 31/3/15.
 */
public class InteractorInvokerImp implements InteractorInvoker {

  private JobManager jobManager;

  public InteractorInvokerImp(JobManager jobManager) {
    this.jobManager = jobManager;
  }

  @Override public void execute(Interactor interactor) {
    execute(interactor, InteractorPriority.MEDIUM);
  }

  @Override public void execute(Interactor interactor, InteractorPriority priority) {
    jobManager.addJob(interactorToJob(interactor, priority));
  }

  private Job interactorToJob(Interactor interactor, InteractorPriority priority) {
    Params params = new Params(priority.getPriorityValue());
    return new InteractorJobImp(params, interactor);
  }
}
