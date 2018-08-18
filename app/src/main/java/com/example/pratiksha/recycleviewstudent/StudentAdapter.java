package com.example.pratiksha.recycleviewstudent;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    RecyclerViewClickListner listner;

    private List<Student> studentList;
    public StudentAdapter(List<Student> studentList,RecyclerViewClickListner listner){
        this.studentList = studentList;
        this.listner = listner;
    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student_list,null);
        return new StudentViewHolder(view,listner);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

        Student student = studentList.get(position);
        holder.imgStudent.setImageResource(student.getImageId());
        holder.valName.setText(student.getName());
        holder.valCollage.setText(student.getCollage());
        holder.valCourse.setText(student.getCourse());
        holder.valBarnch.setText(student.getBranch());
        holder.valAddress.setText(student.getAddress());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
