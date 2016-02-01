package sergio.vasco.androidforexample.presentation.sections.main;

import java.util.List;
import sergio.vasco.androidforexample.domain.model.Contact;
import sergio.vasco.androidforexample.presentation.model.PresentationContact;

/**
 * Name: Sergio Vasco
 * Date: 14/1/16.
 */
public interface MainView {
  void showLoader();
  void hideLoader();
  void loadContacts(List<PresentationContact> contactList);
}
