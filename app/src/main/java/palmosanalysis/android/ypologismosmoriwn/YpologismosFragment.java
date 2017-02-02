package palmosanalysis.android.ypologismosmoriwn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Win10 on 17/1/2017.
 */

public class YpologismosFragment extends Fragment {
    private OnYpologismosClickListener listener;

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

    private Button mYpologiseButton;

    private static final String EXTRA_PASSING_DATA =
            "Ta dedomena pou xreiazomaste gia ta moria";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ypollogismos, container, false);


        mAnthropistikwn_4o_mathima = (RadioGroup)
                v.findViewById(R.id.anthropistikwn_4o_mathima);
        mAnthropistikwn_5o_mathima = (RadioGroup)
                v.findViewById(R.id.anthropistikwn_5o_mathima);
        mSyntelestisEidikwn = (RadioGroup)
                v.findViewById(R.id.syntelestes_eidikwn_radio);
        mAnthropistikwn_4o_mathima.setVisibility(View.VISIBLE);
        mAnthropistikwn_5o_mathima.setVisibility(View.VISIBLE);
        mThetikwn_4o_mathima = (RadioGroup) v.findViewById(R.id.thetikwn_4o_mathima);
        mThetikwn_5o_mathima = (RadioGroup) v.findViewById(R.id.thetikwn_5o_mathima);
        mThetikwn_4o_mathima.setVisibility(View.GONE);
        mThetikwn_5o_mathima.setVisibility(View.GONE);
        mOikonomias_4o_mathima = (RadioGroup) v.findViewById(R.id.oikonomias_4o_mathima);
        mOikonomias_5o_mathima = (RadioGroup) v.findViewById(R.id.oikonomias_5o_mathima);
        mOikonomias_4o_mathima.setVisibility(View.GONE);
        mOikonomias_5o_mathima.setVisibility(View.GONE);

        mepilogi_prosanatolismou = (RadioGroup)
                v.findViewById(R.id.epilogi_prosanatolismou);
        mepilogi_prosanatolismou.setOnCheckedChangeListener
                (new RadioGroup.OnCheckedChangeListener(){
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId){
                        if(checkedId == R.id.anthropistikwn_spoudwn){
                            mAnthropistikwn_4o_mathima.setVisibility(View.VISIBLE);
                            mAnthropistikwn_5o_mathima.setVisibility(View.VISIBLE);
                            mThetikwn_4o_mathima.setVisibility(View.GONE);
                            mThetikwn_5o_mathima.setVisibility(View.GONE);
                            mOikonomias_4o_mathima.setVisibility(View.GONE);
                            mOikonomias_5o_mathima.setVisibility(View.GONE);
                        } else if(checkedId == R.id.thetikwn_epistimwn){
                            mAnthropistikwn_4o_mathima.setVisibility(View.GONE);
                            mAnthropistikwn_5o_mathima.setVisibility(View.GONE);
                            mThetikwn_4o_mathima.setVisibility(View.VISIBLE);
                            mThetikwn_5o_mathima.setVisibility(View.VISIBLE);
                            mOikonomias_4o_mathima.setVisibility(View.GONE);
                            mOikonomias_5o_mathima.setVisibility(View.GONE);
                        } else if(checkedId == R.id.oikonomias_pliroforikis){
                            mAnthropistikwn_4o_mathima.setVisibility(View.GONE);
                            mAnthropistikwn_5o_mathima.setVisibility(View.GONE);
                            mThetikwn_4o_mathima.setVisibility(View.GONE);
                            mThetikwn_5o_mathima.setVisibility(View.GONE);
                            mOikonomias_4o_mathima.setVisibility(View.VISIBLE);
                            mOikonomias_5o_mathima.setVisibility(View.VISIBLE);
                        }
                        mAnthropistikwn_4o_mathima.clearCheck();
                        mAnthropistikwn_5o_mathima.clearCheck();
                        mThetikwn_4o_mathima.clearCheck();
                        mThetikwn_5o_mathima.clearCheck();
                        mOikonomias_4o_mathima.clearCheck();
                        mOikonomias_5o_mathima.clearCheck();
                    }
                });

        mSyntelestesEidikwn = (LinearLayout) v.findViewById(R.id.syntelestes_eidikwn);
        mSyntelestesEidikwn.setVisibility(View.GONE);
        m4aMathimata = (LinearLayout) v.findViewById(R.id.mathimata_4a);
        m4aMathimata.setVisibility(View.VISIBLE);
        m5aMathimata = (LinearLayout) v.findViewById(R.id.mathimata_5a);
        m5aMathimata.setVisibility(View.GONE);

        m5oMathima = (CheckBox) v.findViewById(R.id.pempto_mathima);
        m5oMathima.setOnCheckedChangeListener
                (new CompoundButton.OnCheckedChangeListener(){
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                        if(isChecked){
                            m5aMathimata.setVisibility(buttonView.VISIBLE);
                        } else {
                            m5aMathimata.setVisibility(buttonView.GONE);
                        }
                    }
                });

        mEidikoMathima = (CheckBox) v.findViewById(R.id.eidiko_mathima);
        mEidikoMathima.setOnCheckedChangeListener
                (new CompoundButton.OnCheckedChangeListener(){
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                        if(isChecked){
                            mSyntelestesEidikwn.setVisibility(buttonView.VISIBLE);
                        } else {
                            mSyntelestesEidikwn.setVisibility(buttonView.GONE);
                        }
                    }
                });
        checkIdiaMathimata(mAnthropistikwn_4o_mathima, mAnthropistikwn_5o_mathima);
        checkIdiaMathimata(mThetikwn_4o_mathima, mThetikwn_5o_mathima);
        checkIdiaMathimata(mOikonomias_4o_mathima, mOikonomias_5o_mathima);

        mYpologiseButton = (Button) v.findViewById(R.id.ypologismos_button);
        mYpologiseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int prosanatolismosID = mepilogi_prosanatolismou.getCheckedRadioButtonId();
                boolean mathima_5o_exists = m5oMathima.isChecked();
                boolean mathima_eidiko_exists = mEidikoMathima.isChecked();
                if(mepilogi_prosanatolismou.getCheckedRadioButtonId() ==
                        R.id.anthropistikwn_spoudwn){

                    m4oMathimaEpilogi = mAnthropistikwn_4o_mathima
                            .getCheckedRadioButtonId();
                    m5oMathimaEpilogi = mAnthropistikwn_5o_mathima
                            .getCheckedRadioButtonId();
                } else if(mepilogi_prosanatolismou.getCheckedRadioButtonId() ==
                        R.id.thetikwn_epistimwn){

                    m4oMathimaEpilogi = mThetikwn_4o_mathima
                            .getCheckedRadioButtonId();
                    m5oMathimaEpilogi = mThetikwn_5o_mathima
                            .getCheckedRadioButtonId();
                } else if(mepilogi_prosanatolismou.getCheckedRadioButtonId() ==
                        R.id.oikonomias_pliroforikis){

                    m4oMathimaEpilogi = mOikonomias_4o_mathima
                            .getCheckedRadioButtonId();
                    m5oMathimaEpilogi = mOikonomias_5o_mathima
                            .getCheckedRadioButtonId();
                }
                if(mEidikoMathima.isChecked()){
                    mEidikoMathimaEpilogi = mSyntelestisEidikwn
                            .getCheckedRadioButtonId();
                }
                if((mAnthropistikwn_4o_mathima.getCheckedRadioButtonId() == -1) &&
                        (mThetikwn_4o_mathima.getCheckedRadioButtonId() == -1) &&
                        (mOikonomias_4o_mathima.getCheckedRadioButtonId() == -1)){
                    Toast.makeText(getActivity(),
                            "Πρέπει να διαλέξετε 4ο μάθημα!",
                            Toast.LENGTH_SHORT)
                            .show();
                } else if(m5oMathima.isChecked()&&
                        (mAnthropistikwn_5o_mathima.getCheckedRadioButtonId() == -1) &&
                        (mThetikwn_5o_mathima.getCheckedRadioButtonId() == -1) &&
                        (mOikonomias_5o_mathima.getCheckedRadioButtonId() == -1)) {
                    Toast.makeText(getActivity(),
                            "Πρέπει να διαλέξετε 5ο μάθημα!",
                            Toast.LENGTH_SHORT)
                            .show();
                } else if(mEidikoMathima.isChecked()&&
                        (mSyntelestisEidikwn.getCheckedRadioButtonId() == -1)) {
                    Toast.makeText(getActivity(),
                            "Πρέπει να διαλέξετε Συντελεστή Ειδικού Μαθήματος!",
                            Toast.LENGTH_SHORT)
                            .show();
                } else{
                    PassingData mData = new PassingData(prosanatolismosID,
                            m4oMathimaEpilogi,  m5oMathimaEpilogi, mathima_5o_exists,
                            mathima_eidiko_exists, mEidikoMathimaEpilogi);
                    listener.onYpologismosClick(mData);
                }
            }
        });
        return v;
    }
    public void checkIdiaMathimata(final RadioGroup group1, final RadioGroup group2){
        group1.setOnCheckedChangeListener
                (new RadioGroup.OnCheckedChangeListener(){
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId){
                        int radioButtonID = group1.getCheckedRadioButtonId();
                        View radioButton = group1.findViewById(radioButtonID);
                        int idx = group1.indexOfChild(radioButton);
                        int radioButtonID2 = group2.getCheckedRadioButtonId();
                        View radioButton2 = group2.findViewById(radioButtonID2);
                        int idx2 = group2.indexOfChild(radioButton2);
                        if((idx == idx2)&&(radioButtonID != -1)){
                            Toast.makeText(getActivity(),
                                    R.string.pemtpo_mathima_toast,
                                    Toast.LENGTH_SHORT).show();
                            group1.clearCheck();
                        }
                    }
                });
        group2.setOnCheckedChangeListener
                (new RadioGroup.OnCheckedChangeListener(){
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId){
                        int radioButtonID = group1.getCheckedRadioButtonId();
                        View radioButton = group1.findViewById(radioButtonID);
                        int idx = group1.indexOfChild(radioButton);
                        int radioButtonID2 = group2.getCheckedRadioButtonId();
                        View radioButton2 = group2.findViewById(radioButtonID2);
                        int idx2 = group2.indexOfChild(radioButton2);
                        if((idx == idx2)&&(radioButtonID != -1)){
                            Toast.makeText(getActivity(),
                                    R.string.pemtpo_mathima_toast,
                                    Toast.LENGTH_SHORT).show();
                            group2.clearCheck();
                        }
                    }
                });
    }
    public interface OnYpologismosClickListener{
        void onYpologismosClick(PassingData mData);
    }
    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        if(activity instanceof OnYpologismosClickListener){
            listener = (OnYpologismosClickListener) activity;
        } else {
            throw new
            ClassCastException(activity.toString()
                + " must implement YpologismosFragment.OnYpologismosClickListener");
        }
    }
    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
