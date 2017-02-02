package palmosanalysis.android.ypologismosmoriwn;

/**
 * Created by Win10 on 1/2/2017.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;

public class CSVReaderCustom {

    Context context;

    String file_name;

    ArrayList<HashMap<String, String>> CSVData;

    public CSVReaderCustom(Context context, String file_name) {
        this.context = context;

        this.file_name = file_name;

    }

    public ArrayList<HashMap<String, String>> ReadCSV() throws IOException {

        InputStream is = context.getAssets().open(file_name);

        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader br = new BufferedReader(isr);

        String line;

        String cvsSplitBy = "\\t";

        br.readLine();

        CSVData = new ArrayList<HashMap<String, String>>();

        while ((line = br.readLine()) != null) {

            String[] row = line.split(cvsSplitBy);

            HashMap<String, String> hm = new HashMap<String, String>();

            for (int i = 0; i < row.length; i++) {

                hm.put("row[" + i + "]", row[i]);

            }
            CSVData.add(hm);
        }
        return CSVData;

    }

}