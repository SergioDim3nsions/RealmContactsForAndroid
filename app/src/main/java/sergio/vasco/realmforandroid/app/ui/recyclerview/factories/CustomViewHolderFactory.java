package sergio.vasco.realmforandroid.app.ui.recyclerview.factories;

import android.content.Context;
import android.view.ViewGroup;
import com.carlosdelachica.easyrecycleradapters.adapter.BaseEasyViewHolderFactory;
import com.carlosdelachica.easyrecycleradapters.adapter.EasyViewHolder;
import sergio.vasco.realmforandroid.app.ui.recyclerview.viewholders.ContactViewHolder;
import sergio.vasco.realmforandroid.domain.model.Contact;

public class CustomViewHolderFactory extends BaseEasyViewHolderFactory {

    public CustomViewHolderFactory(Context context) {
        super(context);
    }

    @Override
    public EasyViewHolder create(Class valueClass, ViewGroup parent) {
        if (valueClass == Contact.class) {
            return new ContactViewHolder(context, parent);
        }
        return null;
    }
}
