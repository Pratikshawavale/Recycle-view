package com.example.pratiksha.recycleviewstudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewClickListner{

    RecyclerView rvStudent;
    List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvStudent = findViewById(R.id.rvStudent);
        rvStudent.setLayoutManager(new LinearLayoutManager(this));

        studentList = new ArrayList<>();
        studentList.add(new Student(R.drawable.ic_launcher_background,"Pratiksha","MIT","BE","Computer","Pune"));
        studentList.add(new Student(R.drawable.img1,"Priya","MIT","BE","Computer","Pune"));
        studentList.add(new Student(R.drawable.img2,"Anuja","MIT","BE","Computer","Pune"));
        studentList.add(new Student(R.drawable.img1,"Aniket","MIT","BE","Computer","Pune"));

        StudentAdapter studentAdapter = new StudentAdapter(studentList,this);
        rvStudent.setAdapter(studentAdapter);

    }

    @Override
    public void onClick(View view, int position) {

        Student student = studentList.get(position);
        Toast.makeText(this,student.getName(),Toast.LENGTH_SHORT).show();


    }
}
