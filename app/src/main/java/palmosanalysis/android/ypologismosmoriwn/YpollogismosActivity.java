package palmosanalysis.android.ypologismosmoriwn;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class YpollogismosActivity extends Activity
implements YpologismosFragment.OnYpologismosClickListener {
    private CheckBox mEidikoMathima;
    private CheckBox m5oMathima;
    private RadioGroup mepilogi_prosanatolismou;
    private RadioGroup mAnthropistikwn_4o_mathima;
    private RadioGroup mThetikwn_4o_mathima;
    private RadioGroup mOikonomias_4o_mathima;
    private RadioGroup mAnthropistikwn_5o_mathima;
    private RadioGroup mThetikwn_5o_mathima;
    private RadioGroup mOikonomias_5o_mathima;
    private RadioGroup mSyntelestisEidikwn;
    private LinearLayout mSyntelestesEidikwn;
    private LinearLayout m4aMathimata;
    private LinearLayout m5aMathimata;
    private PassingData mData;

    private int m4oMathimaEpilogi;
    private int m5oMathimaEpilogi;
    private int mEidikoMathimaEpilogi;

    private YpologismosFragment mYpologismosFragment;

    private Button mYpologiseButton;

    private static final String TAG = "ypologismosLog";
    private static final String EXTRA_PASSING_DATA =
            "Ta dedomena pou xreiazomaste gia ta moria";
    private static final String EXTRA_PASSING_DATA_TO_FRAGMENT =
            "Ta dedomena pou xreiazomaste gia ta moria (fragment)";

    /**
     * Dimiourgoume tin klasi PassingData gia na perasoume ta data tou mathiti
     * gia ton ypologismo twn mwriwn sto activity me to fragment ypologismou
      */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);
        if (getResources().getBoolean(R.bool.twoPaneMode)) {
            // all good, we use the fragments defined in the layout
            return;
        }
        // if savedInstanceState is null we do some cleanup
        if (savedInstanceState != null) {
            // cleanup any existing fragments in case we are in detailed mode
            getFragmentManager().executePendingTransactions();
            android.app.Fragment fragmentById = getFragmentManager()
                    .findFragmentById(R.id.fragmentContainer);
            if (fragmentById!=null) {
                getFragmentManager().beginTransaction()
                        .remove(fragmentById).commit();
            }
        }
        YpologismosFragment ypologismosFragment = new YpologismosFragment();
        FrameLayout viewById = (FrameLayout) findViewById(R.id.fragmentContainer);
        getFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, ypologismosFragment).commit();
    }

    @Override
    public void onYpologismosClick(PassingData mData) {
        if (getResources().getBoolean(R.bool.twoPaneMode)) {
            MoriodotisiFragment newMoriodotisiFragment = (MoriodotisiFragment) getFragmentManager()
                    .findFragmentById(R.id.moriodotisifragment);
            newMoriodotisiFragment.setData(mData);
        } else {
            MoriodotisiFragment newMoriodotisiFragment = new MoriodotisiFragment();
            Bundle args = new Bundle();
            args.putParcelable(EXTRA_PASSING_DATA_TO_FRAGMENT, mData);

            newMoriodotisiFragment.setArguments(args);
            android.app.FragmentTransaction transaction = getFragmentManager()
                    .beginTransaction();
            transaction.replace(R.id.fragmentContainer, newMoriodotisiFragment);
            transaction.addToBackStack(null);

            // Commit the transaction
            transaction.commit();


        }

    }
}
