package com.lxchild.explicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by LXChild on 13/10/2016.
 */

public final class MainActivity extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.lxchild.activity3");
                intent.setDataAndType(Uri.parse("http://abc"), "video/mpeg");
                startActivity(intent);
            }
        });
    }

}
