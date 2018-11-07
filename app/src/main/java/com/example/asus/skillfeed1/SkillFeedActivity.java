package com.example.asus.skillfeed1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SkillFeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill_feed);
        RecyclerView skillRecycler=findViewById(R.id.skillRecycler);
        skillRecycler.setLayoutManager(new LinearLayoutManager(this));

        //Dummy arrays for skill feed

        String skillname[]={"welding","tailoring","driving","sales","plumbing","cooking"};
        String centername[]={"Rourkela","Cuttuck","Bhubaneswar","Koenjhar","Sundergarh","Angul"};
        String time[]={"01:00","02:00","03:00","04:00","05:00","06:00"};
        String description[]={"welding","tailoring","driving","sales","plumbing","cooking"};
        String trainername[]={"Haris","Ankit","Nitish","Baidhyanath","Aditya","Rahul"};


        ProgrammingAdapter PA= new ProgrammingAdapter(this,skillname,trainername,centername,time,description);
        skillRecycler.setAdapter(PA);
    }
}
