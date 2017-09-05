package com.app.bottomsheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.app.bottomsheet.widget.BottomSheetBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bottomSheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomSheetBuilder();
            }
        });
    }

    public void showBottomSheetBuilder() {
        BottomSheetBuilder builder = new BottomSheetBuilder(this);
        builder.setContentView(LayoutInflater.from(this).inflate(R.layout.custom_bottomsheet, null));
        builder.show();
    }
}
