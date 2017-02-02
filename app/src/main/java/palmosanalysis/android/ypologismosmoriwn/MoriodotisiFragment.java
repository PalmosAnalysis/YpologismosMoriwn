package palmosanalysis.android.ypologismosmoriwn;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Win10 on 4/1/2017.
 */

public class MoriodotisiFragment extends Fragment{
    private static final String EXTRA_PASSING_DATA_TO_FRAGMENT =
            "Ta dedomena pou xreiazomaste gia ta moria (fragment)";
    private Moriodotisi mMoriodotisi;
    private TextView m1oMathimaTitlos;
    private TextView m2oMathimaTitlos;
    private TextView m3oMathimaTitlos;
    private TextView m4oMathimaTitlos;
    private TextView m5oMathimaTitlos;
    private EditText m1oMathimaVathmos;
    private EditText m2oMathimaVathmos;
    private EditText m3oMathimaVathmos;
    private EditText m4oMathimaVathmos;
    private EditText m5oMathimaVathmos;
    private EditText mEidikoMathimaVathmos;
    private LinearLayout mGrammi5ouMathimatos;
    private LinearLayout mGrammiEidikouMathimatos;

    private String selectedProsanatolismos = "";
    private String selected4Mathima = "";
    private String selected5Mathima = "";
    private double vathmos_1 = 0;
    private double vathmos_2 = 0;
    private double vathmos_3 = 0;
    private double vathmos_4 = 0;
    private double vathmos_5 = 0;
    private double vathmos_eidikou = 0;

    private int syntelestisEidikou = 0;

    private Button mButton;

    private YpologismosData mYpologismosData;
    private PassingData mPassingData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        mMoriodotisi = new Moriodotisi();
        View v = inflater.inflate(R.layout.fragment_moriodotisi, container, false);
// globally
        m1oMathimaTitlos = (TextView) v.findViewById(R.id.mathima_1o_titlos);
        m2oMathimaTitlos = (TextView) v.findViewById(R.id.mathima_2o_titlos);
        m3oMathimaTitlos = (TextView) v.findViewById(R.id.mathima_3o_titlos);
        m4oMathimaTitlos = (TextView) v.findViewById(R.id.mathima_4o_titlos);
        m5oMathimaTitlos = (TextView) v.findViewById(R.id.mathima_5o_titlos);
        m1oMathimaVathmos = (EditText) v.findViewById(R.id.mathima_1o_vathmos);
        m2oMathimaVathmos = (EditText) v.findViewById(R.id.mathima_2o_vathmos);
        m3oMathimaVathmos = (EditText) v.findViewById(R.id.mathima_3o_vathmos);
        m4oMathimaVathmos = (EditText) v.findViewById(R.id.mathima_4o_vathmos);
        m5oMathimaVathmos = (EditText) v.findViewById(R.id.mathima_5o_vathmos);
        mEidikoMathimaVathmos = (EditText) v.findViewById(R.id.eidiko_mathima_vathmos);

        mButton = (Button) v.findViewById(R.id.ypologismos_button);

        m1oMathimaVathmos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0){
                    String vathmos = s.toString();
                    double d = Double.valueOf(vathmos.trim()).doubleValue();
                    checkValidVathmos(d, m1oMathimaVathmos);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //do nothing
            }
        });
        m2oMathimaVathmos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0){
                    String vathmos = s.toString();
                    double d = Double.valueOf(vathmos.trim()).doubleValue();
                    checkValidVathmos(d, m2oMathimaVathmos);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //do nothing
            }
        });
        m3oMathimaVathmos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0){
                    String vathmos = s.toString();
                    double d = Double.valueOf(vathmos.trim()).doubleValue();
                    checkValidVathmos(d, m3oMathimaVathmos);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //do nothing
            }
        });
        m4oMathimaVathmos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0){
                    String vathmos = s.toString();
                    double d = Double.valueOf(vathmos.trim()).doubleValue();
                    checkValidVathmos(d, m4oMathimaVathmos);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //do nothing
            }
        });
        m5oMathimaVathmos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0){
                    String vathmos = s.toString();
                    double d = Double.valueOf(vathmos.trim()).doubleValue();
                    checkValidVathmos(d, m5oMathimaVathmos);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //do nothing
            }
        });
        mEidikoMathimaVathmos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0){
                    String vathmos = s.toString();
                    double d = Double.valueOf(vathmos.trim()).doubleValue();
                    checkValidVathmos(d, mEidikoMathimaVathmos);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                //do nothing
            }
        });

        LinearLayout mGrammi5ouMathimatos = (LinearLayout)
                v.findViewById(R.id.grammi_5ou_mathimatos);
        LinearLayout mGrammiEidikouMathimatos = (LinearLayout)
                v.findViewById(R.id.grammi_eidikou_mathimatos);

        if (!getResources().getBoolean(R.bool.twoPaneMode)) {
            mPassingData = getArguments().getParcelable(EXTRA_PASSING_DATA_TO_FRAGMENT);
        } else {
            mPassingData = new PassingData();
        }

        if(mPassingData.getselectedProsanatolismos() == R.id.anthropistikwn_spoudwn){
            selectedProsanatolismos = "Anthrwpistikwn";
            m1oMathimaTitlos.setText(R.string.text_ekthesi_anthropistikwn);
            m2oMathimaTitlos.setText(R.string.text_arxaia_anthropistikwn);
            m3oMathimaTitlos.setText(R.string.text_istoria_anthropistikwn);
            if(mPassingData.getMathima4o() == R.id.latinika_anthropistikwn){
                selected4Mathima = "latinika_anthropistikwn";
                m4oMathimaTitlos.setText(R.string.text_latinika_anthropistikwn);
            } else if(mPassingData.getMathima4o() == R.id.mathimatika_anthropistikwn){
                selected4Mathima = "mathimatika_anthropistikwn";
                m4oMathimaTitlos.setText(R.string.text_mathimatika_anthropistikwn);
            } else if(mPassingData.getMathima4o() == R.id.viologia_anthropistikwn){
                selected4Mathima = "viologia_anthropistikwn";
                m4oMathimaTitlos.setText(R.string.text_viologia_anthropistikwn);
            }
            if(mPassingData.getMathima5o() == R.id.latinika_anthropistikwn2){
                selected5Mathima = "latinika_anthropistikwn";
                m5oMathimaTitlos.setText(R.string.text_latinika_anthropistikwn);
            } else if(mPassingData.getMathima5o() == R.id.mathimatika_anthropistikwn2){
                selected5Mathima = "mathimatika_anthropistikwn";
                m5oMathimaTitlos.setText(R.string.text_mathimatika_anthropistikwn);
            } else if(mPassingData.getMathima5o() == R.id.viologia_anthropistikwn2){
                selected5Mathima = "viologia_anthropistikwn";
                m5oMathimaTitlos.setText(R.string.text_viologia_anthropistikwn);
            }
        }else if(mPassingData.getselectedProsanatolismos() == R.id.thetikwn_epistimwn){
            selectedProsanatolismos = "Thetikwn";
            m1oMathimaTitlos.setText(R.string.text_ekthesi_anthropistikwn);
            m2oMathimaTitlos.setText(R.string.text_fysiki_thetikwn);
            m3oMathimaTitlos.setText(R.string.text_ximeia_thetikwn);
            if(mPassingData.getMathima4o() == R.id.mathimatika_thetikwn){
                selected4Mathima = "mathimatika_thetikwn";
                m4oMathimaTitlos.setText(R.string.text_mathimatika_thetikwn);
            } else if(mPassingData.getMathima4o() == R.id.viologia_thetikwn){
                selected4Mathima = "viologia_thetikwn";
                m4oMathimaTitlos.setText(R.string.text_viologia_thetikwn);
            } else if(mPassingData.getMathima4o() == R.id.istoria_thetikwn){
                selected4Mathima = "istoria_thetikwn";
                m4oMathimaTitlos.setText(R.string.text_istoria_thetikwn);
            }
            if(mPassingData.getMathima5o() == R.id.mathimatika_thetikwn2){
                selected5Mathima = "mathimatika_thetikwn";
                m5oMathimaTitlos.setText(R.string.text_mathimatika_thetikwn);
            } else if(mPassingData.getMathima5o() == R.id.viologia_thetikwn2){
                selected5Mathima = "viologia_thetikwn";
                m5oMathimaTitlos.setText(R.string.text_viologia_thetikwn);
            } else if(mPassingData.getMathima5o() == R.id.istoria_thetikwn2){
                selected5Mathima = "istoria_thetikwn";
                m5oMathimaTitlos.setText(R.string.text_istoria_thetikwn);
            }
        }else{
            selectedProsanatolismos = "Oikonomias";
            m1oMathimaTitlos.setText(R.string.text_ekthesi_anthropistikwn);
            m2oMathimaTitlos.setText(R.string.text_mathimatika_oikonomias);
            m3oMathimaTitlos.setText(R.string.text_aepp_oikonomias);
            if(mPassingData.getMathima4o() == R.id.aoth_oikonomias){
                selected4Mathima = "aoth_oikonomias";
                m4oMathimaTitlos.setText(R.string.text_aoth_oikonomias);
            } else if(mPassingData.getMathima4o() == R.id.istoria_oikonomias){
                selected4Mathima = "istoria_oikonomias";
                m4oMathimaTitlos.setText(R.string.text_istoria_thetikwn);
            } else if(mPassingData.getMathima4o() == R.id.viologia_oikonomias){
                selected4Mathima = "viologia_oikonomias";
                m4oMathimaTitlos.setText(R.string.text_viologia_oikonomias);
            }
            if(mPassingData.getMathima5o() == R.id.aoth_oikonomias2){
                selected5Mathima = "aoth_oikonomias";
                m5oMathimaTitlos.setText(R.string.text_aoth_oikonomias);
            } else if(mPassingData.getMathima5o() == R.id.istoria_oikonomias2){
                selected5Mathima = "istoria_oikonomias";
                m5oMathimaTitlos.setText(R.string.text_istoria_thetikwn);
            } else if(mPassingData.getMathima5o() == R.id.viologia_oikonomias2){
                selected5Mathima = "viologia_oikonomias";
                m5oMathimaTitlos.setText(R.string.text_viologia_oikonomias);
            }
        }

        if(!mPassingData.getselectedpemptoMathima()){
            for ( int i = 0; i < mGrammi5ouMathimatos.getChildCount();  i++ ){
                View view = mGrammi5ouMathimatos.getChildAt(i);
                view.setVisibility(View.GONE);
            }
        }
        if(!mPassingData.getSelectedEidikoMathima()){
            for ( int i = 0; i < mGrammiEidikouMathimatos.getChildCount();  i++ ){
                View view = mGrammiEidikouMathimatos.getChildAt(i);
                view.setVisibility(View.GONE);
            }
        } else {
            if(mPassingData.getsyntelestisEidikou() == R.id.syntelestis_1x){
                syntelestisEidikou = 1;
            } else {
                syntelestisEidikou = 2;
            }

        }
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                boolean flag = false;
                if((!m1oMathimaVathmos.getText().toString().isEmpty()) && (!m2oMathimaVathmos.getText().toString().isEmpty())
                        && (!m3oMathimaVathmos.getText().toString().isEmpty()) && (!m4oMathimaVathmos.getText().toString().isEmpty())){
                    flag = true;
                    if((mPassingData.getselectedpemptoMathima()) && (m5oMathimaVathmos.getText().toString().isEmpty())){
                        flag = false;
                        Toast.makeText(getActivity(),
                                "Πρέπει να εισάγετε όλους τους βαθμούς!", Toast.LENGTH_SHORT)
                                .show();
                    }
                    if((mPassingData.getSelectedEidikoMathima()) && (mEidikoMathimaVathmos.getText().toString().isEmpty())){
                        flag = false;
                        Toast.makeText(getActivity(),
                                "Πρέπει να εισάγετε όλους τους βαθμούς!", Toast.LENGTH_SHORT)
                                .show();
                    }

                    if(flag == true){
                        vathmos_1 = Double.valueOf(m1oMathimaVathmos.getText().toString());
                        vathmos_2 = Double.valueOf(m2oMathimaVathmos.getText().toString());
                        vathmos_3 = Double.valueOf(m3oMathimaVathmos.getText().toString());
                        vathmos_4 = Double.valueOf(m4oMathimaVathmos.getText().toString());

                        if(mPassingData.getselectedpemptoMathima()){
                            vathmos_5 = Double.valueOf(m5oMathimaVathmos.getText().toString());
                        }
                        if(mPassingData.getSelectedEidikoMathima()){
                            vathmos_eidikou = Double.valueOf(mEidikoMathimaVathmos.getText().toString());
                        }
                        YpologismosData mYpologismosData = new YpologismosData(selectedProsanatolismos,
                                selected4Mathima, selected5Mathima, vathmos_1,
                                vathmos_2, vathmos_3, vathmos_4, vathmos_5, vathmos_eidikou, syntelestisEidikou);
                        Intent intent = ApotelesmataActivity.newIntent(getActivity(), mYpologismosData);
                        startActivity(intent);
                    }
                } else {
                    Toast.makeText(getActivity(),
                            "Πρέπει να εισάγετε όλους τους βαθμούς!", Toast.LENGTH_SHORT)
                            .show();
                }

            }
        });
        return v;
    }
    public void checkValidVathmos(double vathmos, EditText editText){
        if((vathmos < 0) || (vathmos > 20)){
            Toast.makeText(getActivity(),
                    "Εισάγετε έγκυρο βαθμό!",
                    Toast.LENGTH_SHORT).show();
            editText.setError("Εισάγετε έγκυρο βαθμό!");
        }
    }

    public void setData(PassingData data){
        this.mPassingData = data;
    }
}
