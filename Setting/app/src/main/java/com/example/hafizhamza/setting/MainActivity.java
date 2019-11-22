package com.example.hafizhamza.setting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
Toast toast;
    public void Copy(View view)
    {
        toast=Toast.makeText(this,"Copy",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void Review(View view)
    {
        toast=Toast.makeText(this,"review",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void Share(View view)
    {
        toast=Toast.makeText(this,"Share",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void Tutorial(View view)
    {
        toast=Toast.makeText(this,"Tutorial",Toast.LENGTH_SHORT);
        toast.show();
    }
}
