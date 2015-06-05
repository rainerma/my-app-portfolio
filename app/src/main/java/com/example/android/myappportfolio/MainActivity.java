package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button b_streamer;
    Button b_scores;
    Button b_library;
    Button b_build;
    Button b_reader;
    Button b_capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_streamer =  (Button) findViewById(R.id.button_streamer);
        b_scores =  (Button) findViewById(R.id.button_scores);
        b_library=  (Button) findViewById(R.id.button_library);
        b_build =  (Button) findViewById(R.id.button_build);
        b_reader =  (Button) findViewById(R.id.button_reader);
        b_capstone =  (Button) findViewById(R.id.button_capstone);

        View.OnClickListener oc_button = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_streamer:
                        Toast.makeText(getBaseContext(),"This button will launch the streamer app!",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.button_scores:
                        Toast.makeText(getBaseContext(),"This button will launch the scores app!",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.button_library:
                        Toast.makeText(getBaseContext(), "This button will launch the library app!", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.button_build:
                        Toast.makeText(getBaseContext(),"This button will launch the builder app!",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.button_reader:
                        Toast.makeText(getBaseContext(),"This button will launch the reader app!",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.button_capstone:
                        Toast.makeText(getBaseContext(),"This button will launch my capstone app!",Toast.LENGTH_LONG).show();
                        break;
                }
            }
        };

        b_streamer.setOnClickListener(oc_button);
        b_scores.setOnClickListener(oc_button);
        b_library.setOnClickListener(oc_button);
        b_build.setOnClickListener(oc_button);
        b_reader.setOnClickListener(oc_button);
        b_capstone.setOnClickListener(oc_button);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
