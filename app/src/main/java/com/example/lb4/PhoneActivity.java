package com.example.lb4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class PhoneActivity extends Activity implements View.OnClickListener {
    Button btnPhone;
    EditText editPhone;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone);

        btnPhone = (Button) findViewById(R.id.btnPhon);
        editPhone = (EditText) findViewById(R.id.editPhone);
        btnPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+editPhone.getText().toString()));
        startActivity(intent);
    }
}