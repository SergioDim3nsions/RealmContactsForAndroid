package sergio.vasco.androidforexample.domain.interactors;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
public interface InteractorInvoker {
  void execute(Interactor interactor);
  void execute(Interactor interactor, InteractorPriority priority);
}
