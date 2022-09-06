package com.example.ci1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView textView = new TextView(this);
//        textView.setText(getString(R.string.hello));
//        setContentView(textView);
    }

    /**
     * min function
     * @param a first param
     * @param b second param
     * @return minimum of two
     */
    public int min(int a, int b) {
        return a <= b ? a : b;
    }

    /**
     * max function
     * @param a first param
     * @param b second param
     * @return maximum of two
     */
    public int max(int a, int b) {
        return a >= b ? a : b;
    }
}