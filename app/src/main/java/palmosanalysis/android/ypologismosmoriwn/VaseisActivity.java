package palmosanalysis.android.ypologismosmoriwn;

/**
 * Created by Win10 on 1/2/2017.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import com.opencsv.CSVReader;

import static android.R.attr.value;
import static palmosanalysis.android.ypologismosmoriwn.R.raw.vaseis2016;

public class VaseisActivity extends ListActivity {
    ArrayList<HashMap<String, String>> csvdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Mytask().execute();

    }

    class Mytask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            CSVReaderCustom csvreader = new CSVReaderCustom(VaseisActivity.this,
                    "vaseis2016.csv");

            try {
                csvdata = csvreader.ReadCSV();

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            // keys of hashmap
            String[] from = {"row[0]","row[1]","row[2]"};

            // view id’s to which data to be binded
            int[] to = {R.id.txtid, R.id.txtname, R.id.txtvaseis};

            // Creating Adapter
            ListAdapter adapter = new SimpleAdapter(VaseisActivity.this, csvdata,
                    R.layout.listrow, from, to);

            // Setting Adapter to ListView
            setListAdapter(adapter);

        }
    }
}


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.vaseis_activity);
//
//        List<String> VaseisList = readCsv(this);
//        ListAdapter  adapter=new SimpleAdapter(VaseisActivity.this, VaseisList, R.layout.listrow);
//        ListView listView=(ListView)findViewById(R.id.listview);
//        listView.setAdapter(adapter);
//    }
//
//    private class CSVFile {
//        InputStream inputStream;
//
//        public CSVFile(InputStream inputStream){
//            this.inputStream = inputStream;
//        }
//
//        public List<String[]> read(){
//            //
//            List<String[]> resultList = new ArrayList<String[]>();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//            try {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] row = line.split(",");
//                    resultList.add(row);
//                }
//            }
//            catch (IOException e) {
//                Log.e("Main",e.getMessage());
//            }
//            finally {
//                try {
//                    inputStream.close();
//                }
//                catch (IOException e) {
//                    Log.e("Main",e.getMessage());
//                }
//            }
//            return resultList;
//        }
//    }
