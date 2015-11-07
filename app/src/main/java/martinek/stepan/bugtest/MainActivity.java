package martinek.stepan.bugtest;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rlTest);
        Switch sw = (Switch) findViewById(R.id.swTest);

        Log.d("Test","Version " + Build.VERSION.SDK_INT + " switch " + (sw == null ?  "null" : "not null") + " rl " + (rl == null ?  "null" : "not null"));
    }
}
