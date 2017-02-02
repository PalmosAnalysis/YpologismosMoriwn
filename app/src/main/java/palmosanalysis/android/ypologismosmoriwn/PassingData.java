package palmosanalysis.android.ypologismosmoriwn;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Win10 on 12/1/2017.
 */

public class PassingData implements Parcelable {
    private int selectedProsanatolismos;
    private int mathima4o;
    private int mathima5o;
    private boolean selectedpemptoMathima;
    private boolean selectedEidikoMathima;
    private int syntelestisEidikou;

    /**
     *
     * Constructor to use when re-constructing object
     * from a parcel
     *
     */
    public PassingData(int selectedProsanatolismos, int mathima4o, int mathima5o,
                       boolean selectedpemptoMathima, boolean selectedEidikoMathima,
                       int syntelestisEidikou) {
        this.selectedProsanatolismos = selectedProsanatolismos;
        this.mathima4o = mathima4o;
        this.mathima5o = mathima5o;
        this.selectedpemptoMathima = selectedpemptoMathima;
        this.selectedEidikoMathima = selectedEidikoMathima;
        this.syntelestisEidikou = syntelestisEidikou;
    }
    public PassingData(Parcel in) {
        this.selectedProsanatolismos = in.readInt();
        this.mathima4o = in.readInt();
        this.mathima5o = in.readInt();
        this.selectedpemptoMathima = (in.readInt() != 0);
        this.selectedEidikoMathima = (in.readInt() != 0);
        this.syntelestisEidikou = in.readInt();
    }
    public PassingData() {

    }
    public int getselectedProsanatolismos(){
        return selectedProsanatolismos;
    }
    public void setselectedProsanatolismos(int selectedProsanatolismos){
        this.selectedProsanatolismos = selectedProsanatolismos;
    }
    public int getMathima4o(){
        return mathima4o;
    }
    public void setMathima4o(int mathima4o){
        this.mathima4o = mathima4o;
    }
    public int getMathima5o(){
        return mathima5o;
    }
    public void setMathima5o(int mathima5o){
        this.mathima5o = mathima5o;
    }
    public boolean getselectedpemptoMathima(){
        return selectedpemptoMathima;
    }
    public void setselectedpemptoMathima(boolean selectedpemptoMathima){
        this.selectedpemptoMathima = selectedpemptoMathima;
    }
    public boolean getSelectedEidikoMathima(){
        return selectedEidikoMathima;
    }
    public void setSelectedEidikoMathima(boolean selectedEidikoMathima){
        this.selectedEidikoMathima = selectedEidikoMathima;
    }
    public int getsyntelestisEidikou(){
        return syntelestisEidikou;
    }
    public void setsyntelestisEidikou(int syntelestisEidikou){
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
        dest.writeInt(selectedProsanatolismos);
        dest.writeInt(mathima4o);
        dest.writeInt(mathima5o);
        dest.writeInt(selectedpemptoMathima ? 1 : 0);
        dest.writeInt(selectedEidikoMathima ? 1 : 0);
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
    public static final Parcelable.Creator<PassingData>
            CREATOR = new Parcelable.Creator<PassingData>() {

        @Override
        public PassingData createFromParcel(Parcel in) {
            return new PassingData(in);
        }

        public PassingData[] newArray(int size) {
            return new PassingData[size];
        }
    };
}
