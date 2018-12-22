package com.usama2.sendinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class EmployeeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSubmit;
    private EditText id, name, address, salary, job;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_data);

        btnSubmit = findViewById(R.id.btnreg);
        btnSubmit.setOnClickListener(this);

        id = findViewById(R.id.emp_id);
        name = findViewById(R.id.emp_name);
        address = findViewById(R.id.emp_address);
        salary = findViewById(R.id.emp_salary);
        job = findViewById(R.id.emp_job);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnreg){
            Intent employeePreview = new Intent(this, EmployeePreview.class);


            User user = new User(id.getText().toString(), name.getText().toString(), address.getText().toString(), salary.getText().toString(), job.getText().toString());
            employeePreview.putExtra("data_preview", user);
            startActivity(employeePreview);
        }

        }
    }

