package palmosanalysis.android.ypologismosmoriwn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Win10 on 23/1/2017.
 */

public class ApotelesmataActivity extends SingleFragmentActivity {
    public YpologismosData mData;
    public static final String APOTELESMATA_DATA =
            "palmosanalysis.android.ypologismosmoriwn.apotelesmata_data";
    public static final String APOTELESMATA_DATA_FRAGMENT =
            "palmosanalysis.android.ypologismosmoriwn.apotelesmata_data(fragment)";


    public static Intent newIntent(Context packageContext, YpologismosData mData){
        Intent intent = new Intent(packageContext, ApotelesmataActivity.class);
        intent.putExtra(APOTELESMATA_DATA_FRAGMENT, mData);
        return intent;
    }

    @Override
    protected ApotelesmataFragment createFragment() {
        YpologismosData data = (YpologismosData) getIntent()
                .getExtras().getParcelable(APOTELESMATA_DATA_FRAGMENT);
        return ApotelesmataFragment.newInstance(data);
    }
}
