package palmosanalysis.android.ypologismosmoriwn;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Win10 on 23/1/2017.
 */

public class YpologismosData implements Parcelable {
    private String selectedProsanatolismos;
    private String mathima4o;
    private String mathima5o;
    private double vathmos_1;
    private double vathmos_2;
    private double vathmos_3;
    private double vathmos_4;
    private double vathmos_5;
    private double vathmos_eidiko;

    private int syntelestisEidikou;

    /**
     *
     * Constructor to use when re-constructing object
     * from a parcel
     *
     */
    public YpologismosData(String selectedProsanatolismos, String mathima4o,
                           String mathima5o, double vathmos_1, double vathmos_2,
                           double vathmos_3, double vathmos_4, double vathmos_5,
                           double vathmos_eidiko, int syntelestisEidikou) {
        this.selectedProsanatolismos = selectedProsanatolismos;
        this.mathima4o = mathima4o;
        this.mathima5o = mathima5o;
        this.vathmos_1 = vathmos_1;
        this.vathmos_2 = vathmos_2;
        this.vathmos_3 = vathmos_3;
        this.vathmos_4 = vathmos_4;
        this.vathmos_5 = vathmos_5;
        this.vathmos_eidiko = vathmos_eidiko;
        this.syntelestisEidikou = syntelestisEidikou;
    }
    public YpologismosData(Parcel in) {
        this.selectedProsanatolismos = in.readString();
        this.mathima4o = in.readString();
        this.mathima5o = in.readString();
        this.vathmos_1 = in.readDouble();
        this.vathmos_2 = in.readDouble();
        this.vathmos_3 = in.readDouble();
        this.vathmos_4 = in.readDouble();
        this.vathmos_5 = in.readDouble();
        this.vathmos_eidiko = in.readDouble();
        this.syntelestisEidikou = in.readInt();
    }
    public YpologismosData() {

    }
    public String getselectedProsanatolismos(){
        return selectedProsanatolismos;
    }
    public void setselectedProsanatolismos(String selectedProsanatolismos){
        this.selectedProsanatolismos = selectedProsanatolismos;
    }
    public String getMathima4o(){
        return mathima4o;
    }
    public void setMathima4o(String mathima4o){
        this.mathima4o = mathima4o;
    }
    public String getMathima5o(){
        return mathima5o;
    }
    public void setMathima5o(String mathima5o){
        this.mathima5o = mathima5o;
    }

    public double getVathmos_1(){
        return vathmos_1;
    }
    public void setVathmos_1(double vathmos_1){
        this.vathmos_1 = vathmos_1;
    }
    public double getVathmos_2(){
        return vathmos_2;
    }
    public void setVathmos_2(double vathmos_2){
        this.vathmos_2 = vathmos_2;
    }
    public double getVathmos_3(){
        return vathmos_3;
    }
    public void setVathmos_3(double vathmos_3){
        this.vathmos_3 = vathmos_3;
    }
    public double getVathmos_4(){ return vathmos_4; }
    public void setVathmos_4(double vathmos_4){
        this.vathmos_4 = vathmos_4;
    }
    public double getVathmos_5(){ return vathmos_5; }
    public void setVathmos_5(double vathmos_5){
        this.vathmos_5 = vathmos_5;
    }
    public double getVathmos_Eidiko(){
        return vathmos_eidiko;
    }
    public void setVathmos_Eidiko(float vathmos_eidiko){

        this.vathmos_eidiko = vathmos_eidiko;
    }
    public int getSyntelestisEidikou(){ return syntelestisEidikou; }
    public void setSyntelestisEidikou(int syntelestisEidikou){
        this.syntelestisEidikou = syntelestisEidikou;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {

        // We just need to write each field into the
        // parcel. When we read from parcel, they
        // will come back in the same order
        dest.writeString(selectedProsanatolismos);
        dest.writeString(mathima4o);
        dest.writeString(mathima5o);
        dest.writeDouble(vathmos_1);
        dest.writeDouble(vathmos_2);
        dest.writeDouble(vathmos_3);
        dest.writeDouble(vathmos_4);
        dest.writeDouble(vathmos_5);
        dest.writeDouble(vathmos_eidiko);
        dest.writeInt(syntelestisEidikou);
    }
    /**
     *
     * This field is needed for Android to be able to
     * create new objects, individually or as arrays.
     *
     * This also means that you can use use the default
     * constructor to create the object and use another
     * method to hyrdate it as necessary.
     *
     * I just find it easier to use the constructor.
     * It makes sense for the way my brain thinks ;-)
     *
     */
    public static final Parcelable.Creator<YpologismosData>
            CREATOR = new Parcelable.Creator<YpologismosData>() {

        @Override
        public YpologismosData createFromParcel(Parcel in) {
            return new YpologismosData(in);
        }

        public YpologismosData[] newArray(int size) {
            return new YpologismosData[size];
        }
    };
}
