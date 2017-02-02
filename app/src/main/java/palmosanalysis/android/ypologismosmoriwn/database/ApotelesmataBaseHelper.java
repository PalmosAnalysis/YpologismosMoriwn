package palmosanalysis.android.ypologismosmoriwn.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import palmosanalysis.android.ypologismosmoriwn.database.ApotelesmataDbSchema.ApotelesmataTable;

/**
 * Created by Win10 on 31/1/2017.
 */

public class ApotelesmataBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "SavedApotelesmataBase.db";
    public ApotelesmataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + ApotelesmataTable.NAME + "(" +
            " _id integer primary key autoincrement, " +
            ApotelesmataTable.Cols.UUID + ", " +
            ApotelesmataTable.Cols.PROSANATOLISMOS + ", " +
            ApotelesmataTable.Cols.MATHIMA4O + ", " +
            ApotelesmataTable.Cols.MATHIMA5O + ", " +
            ApotelesmataTable.Cols.VATHMOS1 + ", " +
            ApotelesmataTable.Cols.VATHMOS2 + ", " +
            ApotelesmataTable.Cols.VATHMOS3 + ", " +
            ApotelesmataTable.Cols.VATHMOS4 + ", " +
            ApotelesmataTable.Cols.VATHMOS5 + ", " +
            ApotelesmataTable.Cols.VATHMOSEIDIKOU + ", " +
            ApotelesmataTable.Cols.SYNTELESTISEIDIKOU + ")"
        );
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}