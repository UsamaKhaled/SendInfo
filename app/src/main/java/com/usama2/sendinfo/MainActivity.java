package com.usama2.sendinfo;

import android.content.Intent;
import android.os.UserHandle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnEmp;
    private Button btnDept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmp = findViewById(R.id.btn_Emplyee);
        btnDept = findViewById(R.id.btn_department);

        btnEmp.setOnClickListener(this);
        btnDept.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_Emplyee){

            Intent employeeActivity = new Intent(this, EmployeeActivity.class);
            startActivity(employeeActivity);
        }else if(v.getId() == R.id.btn_department){
            Intent departmentActivity = new Intent(this, DepartmentActivity.class);
            startActivity(departmentActivity);


        }
    }
}
