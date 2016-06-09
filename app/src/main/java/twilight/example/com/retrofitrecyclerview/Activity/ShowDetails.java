package twilight.example.com.retrofitrecyclerview.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import twilight.example.com.retrofitrecyclerview.R;

public class ShowDetails extends AppCompatActivity {

    //Defining views
    private TextView textViewVer;
    private TextView textViewName;
    private TextView textViewApi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);

        //Initializing Views
        textViewVer = (TextView) findViewById(R.id.textViewVer);
        textViewName = (TextView) findViewById(R.id.textViewName);
        textViewApi = (TextView) findViewById(R.id.textViewApi);

        //Getting intent
        Intent intent = getIntent();

        //Displaying values by fetching from intent

        textViewName.setText(intent.getStringExtra("name"));
        textViewVer.setText(intent.getStringExtra("ver"));
        textViewApi.setText(intent.getStringExtra("api"));

    }
}
