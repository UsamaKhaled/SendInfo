package com.usama2.sendinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class EmployeePreview extends AppCompatActivity {

    private TextView id, name, address, salary, job;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_preview);

        id = findViewById(R.id.idTV);
        name = findViewById(R.id.nameTV);
        address = findViewById(R.id.addressTV);
        salary = findViewById(R.id.salaryTV);
        job = findViewById(R.id.jobTV);

        Intent i = getIntent();
        User userx = (User) i.getSerializableExtra("data_preview");

        id.setText(userx.getIdET());
        name.setText(userx.getNameET());
        address.setText(userx.getAddressET());
        salary.setText(userx.getSalaryET());
        job.setText(userx.getJobET());


    }
}
