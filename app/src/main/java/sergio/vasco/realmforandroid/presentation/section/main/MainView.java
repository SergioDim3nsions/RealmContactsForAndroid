package sergio.vasco.realmforandroid.presentation.section.main;

import java.util.List;
import sergio.vasco.realmforandroid.domain.model.Contact;

/**
 * Name: Sergio Vasco
 * Date: 14/1/16.
 */
public interface MainView {
  void showLoader();
  void hideLoader();
  void loadContacts(List<Contact> contactsList);
}
