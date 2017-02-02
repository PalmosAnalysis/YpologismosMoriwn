package palmosanalysis.android.ypologismosmoriwn;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Win10 on 25/1/2017.
 */

public abstract class SingleFragmentActivity extends FragmentActivity {
    protected abstract ApotelesmataFragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apotelesmata);

        FragmentManager fm = getSupportFragmentManager();
        ApotelesmataFragment fragment = (ApotelesmataFragment)
                fm.findFragmentById(R.id.fragment_container2);

        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container2, fragment)
                    .commit();
        }
    }
}
