package sergio.vasco.realmforandroid.app.ui.recyclerview.viewholders;

import android.content.Context;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.carlosdelachica.easyrecycleradapters.adapter.EasyViewHolder;
import sergio.vasco.androidforexample.presentation.model.PresentationContact;
import sergio.vasco.realmforandroid.R;

public class ContactViewHolder extends EasyViewHolder<PresentationContact> {

    private Context context;

    public ContactViewHolder(Context context, ViewGroup parent) {
        super(context, parent, R.layout.view_contact);
        this.context = context;
        ButterKnife.bind(this, itemView);
    }

    @Override public void bindTo(PresentationContact value) {

    }

}
