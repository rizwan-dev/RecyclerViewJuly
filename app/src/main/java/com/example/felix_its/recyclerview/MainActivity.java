package com.example.felix_its.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Declared recyclerview
    RecyclerView rvEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialized recyclerview
        rvEmployee = findViewById(R.id.rvEmployee);

        // Applied orientation
        rvEmployee.setLayoutManager(new LinearLayoutManager(this));

        // Created List
        List<Employee> employeeList = new ArrayList<>();

        // Adding data to list
        employeeList.add(new Employee(R.drawable.ic_launcher_background,
                "Rizwan", "Kharadi", "8798789999"));
        employeeList.add(new Employee(R.drawable.ic_launcher_background,
                "Chaitali", "Baner", "8798789999"));

        // Creating Adapter
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(employeeList);

        // Setting adapter to recyclerview
        rvEmployee.setAdapter(employeeAdapter);



    }
}
