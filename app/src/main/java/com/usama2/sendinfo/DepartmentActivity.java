package com.usama2.sendinfo;

import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DepartmentActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_layout);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnSubmit){
            Intent departmentPreview = new Intent(this, DepartmentPreview.class);


            startActivity(departmentPreview);
    }
}
}
