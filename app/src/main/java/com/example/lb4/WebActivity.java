package com.example.lb4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class WebActivity extends Activity implements View.OnClickListener {
    Button btnWeb;
    EditText editWeb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        btnWeb = (Button) findViewById(R.id.btnWeb);
        editWeb = (EditText) findViewById(R.id.editWeb);
        btnWeb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:"+editWeb.getText().toString()));
        startActivity(intent);
    }
}

