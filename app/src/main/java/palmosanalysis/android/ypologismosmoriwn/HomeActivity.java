package palmosanalysis.android.ypologismosmoriwn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {
    private ImageView mLogoButton;
    private Button mYpologismosButton;
    private Button mVaseisButton;
    private Button mTuitorButton;

    private static final String homeUrl = "http://www.tuitor.gr/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mLogoButton = (ImageView) findViewById(R.id.home_logo);
        mLogoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(homeUrl));
                startActivity(browserIntent);
            }
        });

        mYpologismosButton = (Button) findViewById(R.id.ypologismos_moriwn);
        mYpologismosButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(HomeActivity.this, YpollogismosActivity.class);
                startActivity(i);
            }
        });

        mVaseisButton = (Button) findViewById(R.id.vaseis_sxolwn);
        mVaseisButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(HomeActivity.this, VaseisActivity.class);
                startActivity(i);
            }
        });

        mTuitorButton = (Button) findViewById(R.id.about_tuitor);
        mTuitorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(homeUrl));
                startActivity(browserIntent);
            }
        });
    }
}
