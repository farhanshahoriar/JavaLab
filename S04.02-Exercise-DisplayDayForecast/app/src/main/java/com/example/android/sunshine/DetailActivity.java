package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    TextView viewData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        viewData=(TextView)findViewById(R.id.tv_deatils_data);
        Intent weatherintent= getIntent();
        if(weatherintent.hasExtra("weather")){
            String weatherData=weatherintent.getDataString();
            //weatherData="Dummy data";
            viewData.setText(weatherData);
        }

        // TODO (2) Display the weather forecast that was passed from MainActivity
    }
}