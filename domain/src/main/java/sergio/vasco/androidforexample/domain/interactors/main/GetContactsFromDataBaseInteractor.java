package sergio.vasco.androidforexample.domain.interactors.main;

import sergio.vasco.androidforexample.domain.abstractions.Bus;
import sergio.vasco.androidforexample.domain.interactors.Interactor;

/**
 * Name: Sergio Vasco
 * Date: 15/1/16.
 */
public class GetContactsFromDataBaseInteractor implements Interactor {

  private Bus bus;

  public GetContactsFromDataBaseInteractor(Bus bus) {
    this.bus = bus;
  }

  @Override public void execute() throws Throwable {

  }
}
