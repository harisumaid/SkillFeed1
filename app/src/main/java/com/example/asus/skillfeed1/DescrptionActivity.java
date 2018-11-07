package com.example.asus.skillfeed1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DescrptionActivity extends AppCompatActivity{
    String skillname,centername,time,description,trainername;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skill_clicked);
        TextView clickInstitution,clickskillName,clickcenter,clicktime,clicktrainerName,clickdescription;
        clickInstitution=findViewById(R.id.clickInstitution);

        //institution field was kept empty so just entered that sentence

        clickInstitution.setText("i will think about it");
        clickskillName=findViewById(R.id.clickskillName);
        clickcenter=findViewById(R.id.clickcenter);
        clicktime=findViewById(R.id.clicktime);
        clicktrainerName=findViewById(R.id.clicktrainerName);
        clickdescription=findViewById(R.id.clickdescription);

        setIncomingIntent();

        //entering details in all the views in this layout

        clickdescription.setText(description);
        clicktime.setText(time);
        clicktrainerName.setText(trainername);
        clickcenter.setText(centername);
        clickskillName.setText(skillname);
    }
    public void setIncomingIntent()
    {
        //getting all the values from the previous intent

        if (getIntent().hasExtra("skillname")&&getIntent().hasExtra("centername")&&getIntent().hasExtra("trainername")&&getIntent().hasExtra("time")&&getIntent().hasExtra("description")){
            skillname=getIntent().getStringExtra("skillname");
            centername=getIntent().getStringExtra("centername");
            time=getIntent().getStringExtra("time");
            description=getIntent().getStringExtra("description");
            trainername=getIntent().getStringExtra("trainername");
        }
    }
}
