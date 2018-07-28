package com.example.felix_its.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeViewholder> {

    private List<Employee> employeeList;

    // Constructor by which we are passing data from activity to the adapter
    public EmployeeAdapter(List<Employee> employeeList){
        this.employeeList = employeeList;
    }

    @NonNull
    @Override
    public EmployeeViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // Creating views and intializing viewholder

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_employee_list,null);
        return new EmployeeViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewholder holder, int position) {

        // Setting data to each row
        Employee employee = employeeList.get(position);
        holder.imgEmployee.setImageResource(employee.getImageId());
        holder.txtPhone.setText(employee.getName());
        holder.txtAddress.setText(employee.getAddress());
        holder.txtPhone.setText(employee.getPhone());

    }

    @Override
    public int getItemCount() {
        // Telling adapter about no of rows to be shown
        return employeeList.size();
    }
}
