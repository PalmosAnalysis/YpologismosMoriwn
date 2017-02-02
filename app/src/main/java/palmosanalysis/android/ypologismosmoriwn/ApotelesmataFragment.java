package palmosanalysis.android.ypologismosmoriwn;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.UUID;

import palmosanalysis.android.ypologismosmoriwn.database.ApotelesmataDbSchema;

/**
 * Created by Win10 on 24/1/2017.
 */

public class ApotelesmataFragment extends Fragment {
    public static final String YPOLOGISMOS_DATA =
            "palmosanalysis.android.ypologismosmoriwn.apotelesmata_data";

    private YpologismosData mData;
    private String mSelectedProsanatolismos;
    private String mSelected4Mathima;
    private String mSelected5Mathima;
    private double mVathmos_1;
    private double mVathmos_2;
    private double mVathmos_3;
    private double mVathmos_4;
    private double mVathmos_5;
    private double mVathmos_eidikou;
    private int mSyntelestisEidikou;


    private LinearLayout mPedio_1o;
    private LinearLayout mPedio_2o;
    private LinearLayout mPedio_3o;
    private LinearLayout mPedio_4o;
    private LinearLayout mPedio_5o;
    private LinearLayout mPedio_Eidiko;
    private TextView mPedio_1o_moria;
    private TextView mPedio_2o_moria;
    private TextView mPedio_3o_moria;
    private TextView mPedio_4o_moria;
    private TextView mPedio_5o_moria;
    private TextView mPedio_Ediko_moria;

    private String pedio;
    private savingData mSavingData;

    public static ApotelesmataFragment newInstance(YpologismosData mYpologismosData){
        Bundle args = new Bundle();
        args.putParcelable(YPOLOGISMOS_DATA, mYpologismosData);

        ApotelesmataFragment neosYpologismosFragment = new ApotelesmataFragment();
        neosYpologismosFragment.setArguments(args);
        return neosYpologismosFragment;
    }

    private static ContentValues getContentValues(savingData data){
        ContentValues values = new ContentValues();
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.UUID, UUID.randomUUID().toString());
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.PROSANATOLISMOS, data.getProsanatolismos());
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.MATHIMA4O, data.get4Mathima());
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.MATHIMA5O, data.get5Mathima());
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.VATHMOS1, data.getVathmos_1());
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.VATHMOS2, data.getVathmos_2());
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.VATHMOS3, data.getVathmos_3());
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.VATHMOS4, data.getVathmos_4());
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.VATHMOS5, data.getVathmos_5());
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.VATHMOSEIDIKOU, data.getVathmos_eidikou());
        values.put(ApotelesmataDbSchema.ApotelesmataTable.Cols.SYNTELESTISEIDIKOU, data.getSyntelestisEidikou());
        return values;
    }
    public void addSavingData(savingData d) {
        ContentValues values = getContentValues(d);
        d.mDatabase.insert(ApotelesmataDbSchema.ApotelesmataTable.NAME, null, values);
    }
//    public void updateSavingData(savingData d) {
//        String uuidString = crime.getId().toString();
//        ContentValues values = getContentValues(crime);
//        mDatabase.update(CrimeTable.NAME, values,
//                CrimeTable.Cols.UUID + " = ?",
//                new String[] { uuidString });
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        double tempVathmos;
        View v = inflater.inflate(R.layout.fragment_apotelesmata, container, false);

        mPedio_1o_moria = (TextView) v.findViewById(R.id.pedio_1o_moria);
        mPedio_2o_moria = (TextView) v.findViewById(R.id.pedio_2o_moria);
        mPedio_3o_moria = (TextView) v.findViewById(R.id.pedio_3o_moria);
        mPedio_4o_moria = (TextView) v.findViewById(R.id.pedio_4o_moria);
        mPedio_5o_moria = (TextView) v.findViewById(R.id.pedio_5o_moria);
        mPedio_Ediko_moria = (TextView) v.findViewById(R.id.pedio_eidiko_moria);

        YpologismosData mData = getArguments().getParcelable(YPOLOGISMOS_DATA);
//        mSavingData = new savingData(mData, getActivity());
//        addSavingData(mSavingData);

        mSelectedProsanatolismos = mData.getselectedProsanatolismos();
        mSelected4Mathima = mData.getMathima4o();
        mSelected5Mathima = mData.getMathima5o();
        mVathmos_1 = mData.getVathmos_1();
        mVathmos_2 = mData.getVathmos_2();
        mVathmos_3 = mData.getVathmos_3();
        mVathmos_4 = mData.getVathmos_4();
        mVathmos_5 = mData.getVathmos_5();
        mVathmos_eidikou = mData.getVathmos_Eidiko();
        mSyntelestisEidikou = mData.getSyntelestisEidikou();


        LinearLayout mPedio_1o = (LinearLayout)
                v.findViewById(R.id.pedio_1o);
        LinearLayout mPedio_2o = (LinearLayout)
                v.findViewById(R.id.pedio_2o);
        LinearLayout mPedio_3o = (LinearLayout)
                v.findViewById(R.id.pedio_3o);
        LinearLayout mPedio_4o = (LinearLayout)
                v.findViewById(R.id.pedio_4o);
        LinearLayout mPedio_5o = (LinearLayout)
                v.findViewById(R.id.pedio_5o);
        LinearLayout mPedio_Eidiko = (LinearLayout)
                v.findViewById(R.id.pedio_eidiko);

        if(mSelectedProsanatolismos.equals("Anthrwpistikwn")){
            if((mSelected4Mathima.equals("latinika_anthropistikwn")) ||
                    (mSelected5Mathima.equals("latinika_anthropistikwn"))){
                pedio = "1ο Pedio";
                mPedio_1o.setVisibility(View.VISIBLE);
                for ( int i = 0; i < mPedio_1o.getChildCount();  i++ ){
                    View view = mPedio_1o.getChildAt(i);
                    view.setVisibility(View.VISIBLE);
                }
                if(mSelected4Mathima.equals("latinika_anthropistikwn")){
                    tempVathmos = (2 * mVathmos_1 + 3.3 * mVathmos_2 + 2.7 * mVathmos_3 + 2 * mVathmos_4) * 100;
                } else{
                    tempVathmos = (2 * mVathmos_1 + 3.3 * mVathmos_2 + 2.7 * mVathmos_3 + 2 * mVathmos_5) * 100;
                }

                tempVathmos = Math.round(tempVathmos);
                mPedio_1o_moria.setText(String.valueOf(tempVathmos));
            }
            if(mSelected4Mathima.equals("mathimatika_anthropistikwn") ||
                    (mSelected5Mathima.equals("mathimatika_anthropistikwn"))){
                pedio = "4o Pedio";
                mPedio_4o.setVisibility(View.VISIBLE);
                for ( int i = 0; i < mPedio_4o.getChildCount();  i++ ){
                    View view = mPedio_4o.getChildAt(i);
                    view.setVisibility(View.VISIBLE);
                }
                if(mSelected4Mathima.equals("mathimatika_anthropistikwn")){
                    tempVathmos = (2 * mVathmos_2 + 3.3 * mVathmos_1 + 2.7 * mVathmos_4 + 2 * mVathmos_3) * 100;
                } else{
                    tempVathmos = (2 * mVathmos_2 + 3.3 * mVathmos_1 + 2.7 * mVathmos_5 + 2 * mVathmos_3) * 100;
                }

                tempVathmos = Math.round(tempVathmos);
                mPedio_4o_moria.setText(String.valueOf(tempVathmos));
            }
            if(mSelected4Mathima.equals("viologia_anthropistikwn") ||
                    (mSelected5Mathima.equals("viologia_anthropistikwn"))){
                pedio = "3o Pedio";
                mPedio_3o.setVisibility(View.VISIBLE);
                for ( int i = 0; i < mPedio_3o.getChildCount();  i++ ){
                    View view = mPedio_3o.getChildAt(i);
                    view.setVisibility(View.VISIBLE);
                }
                if(mSelected4Mathima.equals("viologia_anthropistikwn")){
                    tempVathmos = (2 * mVathmos_2 + 2.9 * mVathmos_4 + 2.4 * mVathmos_1 + 2 * mVathmos_3) * 100;
                } else {
                    tempVathmos = (2 * mVathmos_2 + 2.9 * mVathmos_5 + 2.4 * mVathmos_1 + 2 * mVathmos_3) * 100;
                }

                tempVathmos = Math.round(tempVathmos);
                mPedio_3o_moria.setText(String.valueOf(tempVathmos));
            }

        } else if(mSelectedProsanatolismos.equals("Thetikwn")){
            if(mSelected4Mathima.equals("mathimatika_thetikwn") ||
                    (mSelected5Mathima.equals("mathimatika_thetikwn"))){
                pedio = "2ο Pedio";
                mPedio_2o.setVisibility(View.VISIBLE);
                for ( int i = 0; i < mPedio_2o.getChildCount();  i++ ){
                    View view = mPedio_2o.getChildAt(i);
                    view.setVisibility(View.VISIBLE);
                }
                if(mSelected4Mathima.equals("mathimatika_thetikwn")){
                    tempVathmos = (2 * mVathmos_1 + 3.3 * mVathmos_4 + 2.7 * mVathmos_2 + 2 * mVathmos_3) * 100;
                } else {
                    tempVathmos = (2 * mVathmos_1 + 3.3 * mVathmos_5 + 2.7 * mVathmos_2 + 2 * mVathmos_3) * 100;
                }

                tempVathmos = Math.round(tempVathmos);
                mPedio_2o_moria.setText(String.valueOf(tempVathmos));
            }
            if(mSelected4Mathima.equals("viologia_thetikwn") ||
                    (mSelected5Mathima.equals("viologia_thetikwn"))){
                pedio = "3o Pedio";
                mPedio_3o.setVisibility(View.VISIBLE);
                for ( int i = 0; i < mPedio_3o.getChildCount();  i++ ){
                    View view = mPedio_3o.getChildAt(i);
                    view.setVisibility(View.VISIBLE);
                }
                if(mSelected4Mathima.equals("viologia_thetikwn")){
                    tempVathmos = (2 * mVathmos_1 + 3.3 * mVathmos_4 + 2.7 * mVathmos_3 + 2 * mVathmos_2) * 100;
                } else {
                    tempVathmos = (2 * mVathmos_1 + 3.3 * mVathmos_5 + 2.7 * mVathmos_3 + 2 * mVathmos_2) * 100;
                }

                tempVathmos = Math.round(tempVathmos);
                mPedio_3o_moria.setText(String.valueOf(tempVathmos));
            }
            if(mSelected4Mathima.equals("istoria_thetikwn") ||
                    (mSelected5Mathima.equals("istoria_thetikwn"))){
                pedio = "4o Pedio";
                mPedio_4o.setVisibility(View.VISIBLE);
                for ( int i = 0; i < mPedio_4o.getChildCount();  i++ ){
                    View view = mPedio_4o.getChildAt(i);
                    view.setVisibility(View.VISIBLE);
                }
                if(mSelected4Mathima.equals("istoria_thetikwn")){
                    tempVathmos = (2 * mVathmos_2 + 3.3 * mVathmos_1 + 2.7 * mVathmos_4 + 2 * mVathmos_3) * 100;
                } else {
                    tempVathmos = (2 * mVathmos_2 + 3.3 * mVathmos_1 + 2.7 * mVathmos_5 + 2 * mVathmos_3) * 100;
                }

                tempVathmos = Math.round(tempVathmos);
                mPedio_4o_moria.setText(String.valueOf(tempVathmos));
            }

        } else if(mSelectedProsanatolismos.equals("Oikonomias")){
            if(mSelected4Mathima.equals("aoth_oikonomias") ||
                    (mSelected5Mathima.equals("aoth_oikonomias"))){
                pedio = "5ο Pedio";
                mPedio_5o.setVisibility(View.VISIBLE);
                for ( int i = 0; i < mPedio_5o.getChildCount();  i++ ){
                    View view = mPedio_5o.getChildAt(i);
                    view.setVisibility(View.VISIBLE);
                }
                if(mSelected4Mathima.equals("aoth_oikonomias")){
                    tempVathmos = (2 * mVathmos_1 + 3.3 * mVathmos_2 + 2.7 * mVathmos_4 + 2 * mVathmos_3) * 100;
                } else {
                    tempVathmos = (2 * mVathmos_1 + 3.3 * mVathmos_2 + 2.7 * mVathmos_5 + 2 * mVathmos_3) * 100;
                }

                tempVathmos = Math.round(tempVathmos);
                mPedio_5o_moria.setText(String.valueOf(tempVathmos));
            }
            if(mSelected4Mathima.equals("istoria_oikonomias") ||
                    (mSelected5Mathima.equals("istoria_oikonomias"))){
                pedio = "4o Pedio";
                mPedio_4o.setVisibility(View.VISIBLE);
                for ( int i = 0; i < mPedio_4o.getChildCount();  i++ ){
                    View view = mPedio_4o.getChildAt(i);
                    view.setVisibility(View.VISIBLE);
                }
                if(mSelected4Mathima.equals("istoria_oikonomias")){
                    tempVathmos = (2 * mVathmos_2 + 3.3 * mVathmos_1 + 2.7 * mVathmos_4 + 2 * mVathmos_3) * 100;
                } else {
                    tempVathmos = (2 * mVathmos_2 + 3.3 * mVathmos_1 + 2.7 * mVathmos_5 + 2 * mVathmos_3) * 100;
                }

                tempVathmos = Math.round(tempVathmos);
                mPedio_4o_moria.setText(String.valueOf(tempVathmos));
            }
            if(mSelected4Mathima.equals("viologia_oikonomias") ||
                    (mSelected5Mathima.equals("viologia_oikonomias"))){
                pedio = "3o Pedio";
                mPedio_3o.setVisibility(View.VISIBLE);
                for ( int i = 0; i < mPedio_3o.getChildCount();  i++ ){
                    View view = mPedio_3o.getChildAt(i);
                    view.setVisibility(View.VISIBLE);
                }
                if(mSelected4Mathima.equals("viologia_oikonomias")){
                    tempVathmos = (2 * mVathmos_2 + 2.9 * mVathmos_4 + 2.4 * mVathmos_1 + 2 * mVathmos_3) * 100;
                } else {
                    tempVathmos = (2 * mVathmos_2 + 2.9 * mVathmos_5 + 2.4 * mVathmos_1 + 2 * mVathmos_3) * 100;
                }

                tempVathmos = Math.round(tempVathmos);
                mPedio_3o_moria.setText(String.valueOf(tempVathmos));
            }
        }

        if(mSyntelestisEidikou != 0){
            mPedio_Eidiko.setVisibility(View.VISIBLE);
            for ( int i = 0; i < mPedio_Eidiko.getChildCount();  i++ ){
                View view = mPedio_Eidiko.getChildAt(i);
                view.setVisibility(View.VISIBLE);
            }
            tempVathmos = mSyntelestisEidikou * mVathmos_eidikou * 100;
            tempVathmos = Math.round(tempVathmos);
            mPedio_Ediko_moria.setText(String.valueOf(tempVathmos));
        }
        return v;
    }
}
