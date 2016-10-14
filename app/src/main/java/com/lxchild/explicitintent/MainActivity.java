package com.lxchild.explicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by LXChild on 13/10/2016.
 */

public final class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ss", "aà");
                Log.e("ss", "aà");
                Log.i("ss", "aà");
                Log.v("ss", "aà");
                Log.w("ss", "aà");
                Intent intent = new Intent("com.lxchild.activity3");
                intent.setDataAndType(Uri.parse("http://abc"), "video/mpeg");
                startActivity(intent);
            }
        });
        Log.d(TAG, "onCreate: >>>>>>>>>>>>>>.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: >>>>>>>>>>>>>");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: >>>>>>>>>>>>>>>>>");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: >>>>>>>>>>>>>>>");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: >>>>>>>>>>>>>>>>>>");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: >>>>>>>>>>>>>>>>>");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: >>>>>>>>>>>>>>>>");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(TAG, "onSaveInstanceState: >>>>>>>>>>>>>>");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: >>>>>>>>>>>>>>>>>>>>>>>");
    }

    private void getnum() {
    }

}
