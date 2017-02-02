package palmosanalysis.android.ypologismosmoriwn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Win10 on 4/1/2017.
 */

public class MoriodotisiActivity extends FragmentActivity {
    private static final String EXTRA_PASSING_DATA =
            "Ta dedomena pou xreiazomaste gia ta moria";
    private static final String EXTRA_PASSING_DATA_TO_FRAGMENT =
            "Ta dedomena pou xreiazomaste gia ta moria (fragment)";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moriodotisi);

        Bundle b = getIntent().getExtras();
        PassingData data =
                b.getParcelable(EXTRA_PASSING_DATA);
        Bundle args = new Bundle();
        args.putParcelable(EXTRA_PASSING_DATA_TO_FRAGMENT, data);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

    }
}
