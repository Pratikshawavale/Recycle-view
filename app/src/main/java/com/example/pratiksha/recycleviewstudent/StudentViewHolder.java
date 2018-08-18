package com.example.pratiksha.recycleviewstudent;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ImageView imgStudent;
    TextView valName,valCollage,valCourse,valBarnch,valAddress;
    RecyclerViewClickListner listner;

    public StudentViewHolder(View itemView,RecyclerViewClickListner listner) {
        super(itemView);
        this.listner =listner;

        imgStudent = itemView.findViewById(R.id.imgStudent);
        valName = itemView.findViewById(R.id.valName);
        valCollage = itemView.findViewById(R.id.valCollage);
        valCourse = itemView.findViewById(R.id.valCourse);
        valBarnch = itemView.findViewById(R.id.valBranch);
        valAddress = itemView.findViewById(R.id.valAddress);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        listner.onClick(view,getAdapterPosition());

    }
}
