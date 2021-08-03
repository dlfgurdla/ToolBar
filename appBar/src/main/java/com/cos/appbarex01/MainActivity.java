package com.cos.appbarex01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.cos.appbarex01.helper.CustomAppBarActivity;

public class MainActivity extends CustomAppBarActivity {

    private static final String TAG = "CustomAppBarActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        onAppBarSetting(false);

        Button btnMove = findViewById(R.id.btnMove);
        btnMove.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    SubActivity.class
            );
            startActivity(intent);
        });
    }

}