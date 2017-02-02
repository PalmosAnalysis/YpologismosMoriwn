//package palmosanalysis.android.ypologismosmoriwn;
//
//import android.app.Activity;
//import android.content.Context;
//import android.content.res.AssetManager;
//import android.widget.ListView;
//
//import com.opencsv.CSVReader;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Win10 on 31/1/2017.
// */
//
//public class Vaseis extends Activity{
//    private ListView mListView;
//
//    @Override
//    protected void onStart()
//    {
//        super.onStart();
//
//        // Add the project titles to display in a list for the listview adapter.
//        List<String> listViewValues = readCsv(getBaseContext());
//        for (Project currentProject : mProjects) {
//            listViewValues.add(currentProject.getName());
//        }
//
//        // Initialise a listview adapter with the project titles and use it
//        // in the listview to show the list of project.
//        mListView = (ListView) findViewById(R.id.vaseis_list);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, android.R.id.text1,
//                listViewValues.toArray(new String[listViewValues.size()]));
//        mListView.setAdapter(adapter);
//    }
//
//    public final List<String[]> readCsv(Context context) {
//        List<String[]> vaseisList = new ArrayList<String[]>();
//        AssetManager assetManager = context.getAssets();
//
//        try {
//            InputStream csvStream = assetManager.open("vaseis-2016.csv");
//            InputStreamReader csvStreamReader = new InputStreamReader(csvStream);
//            CSVReader csvReader = new CSVReader(csvStreamReader);
//            String[] line;
//
//            // throw away the header
//            csvReader.readNext();
//
//            while ((line = csvReader.readNext()) != null) {
//                vaseisList.add(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return vaseisList;
//    }
//}
