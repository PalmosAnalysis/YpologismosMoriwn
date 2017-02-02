package palmosanalysis.android.ypologismosmoriwn;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.UUID;

import palmosanalysis.android.ypologismosmoriwn.database.ApotelesmataBaseHelper;
import palmosanalysis.android.ypologismosmoriwn.database.ApotelesmataDbSchema;

/**
 * Created by Win10 on 31/1/2017.
 */

public class savingData {
    private static savingData sSavingData;
    private String SelectedProsanatolismos;
    private String Selected4Mathima;
    private String Selected5Mathima;
    private double Vathmos_1;
    private double Vathmos_2;
    private double Vathmos_3;
    private double Vathmos_4;
    private double Vathmos_5;
    private double Vathmos_eidikou;
    private int SyntelestisEidikou;

    private Context mContext;
    public SQLiteDatabase mDatabase;


    public savingData(YpologismosData data, Context context) {
        mContext = context.getApplicationContext();
        mDatabase = new ApotelesmataBaseHelper(mContext)
                .getWritableDatabase();

        SelectedProsanatolismos = data.getselectedProsanatolismos();
        Selected4Mathima = data.getMathima4o();
        Selected5Mathima = data.getMathima5o();
        Vathmos_1 = data.getVathmos_1();
        Vathmos_2 = data.getVathmos_2();
        Vathmos_3 = data.getVathmos_3();
        Vathmos_4 = data.getVathmos_4();
        Vathmos_5 = data.getVathmos_5();
        Vathmos_eidikou = data.getVathmos_Eidiko();
        SyntelestisEidikou = data.getSyntelestisEidikou();
    }

    public String getProsanatolismos(){
        return this.SelectedProsanatolismos;
    }
    public String get4Mathima(){
        return this.SelectedProsanatolismos;
    }
    public String get5Mathima(){
        return this.SelectedProsanatolismos;
    }
    public double getVathmos_1(){
        return this.Vathmos_1;
    }
    public double getVathmos_2(){
        return this.Vathmos_2;
    }
    public double getVathmos_3(){
        return this.Vathmos_3;
    }
    public double getVathmos_4(){
        return this.Vathmos_4;
    }
    public double getVathmos_5(){
        return this.Vathmos_5;
    }
    public double getVathmos_eidikou(){
        return this.Vathmos_eidikou;
    }
    public double getSyntelestisEidikou(){
        return this.SyntelestisEidikou;
    }

}
