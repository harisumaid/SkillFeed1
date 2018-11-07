package com.example.asus.skillfeed1;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder>{

    String skillname[],centername[],time[],description[],trainername[];
    Context context;

    public ProgrammingAdapter(Context context,String skillname[],String trainername[],String centername[],String time[],String description[])
    {
        this.skillname=skillname;
        this.centername=centername;
        this.time=time;
        this.description=description;
        this.trainername=trainername;
        this.context=context;
    }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflator= LayoutInflater.from(viewGroup.getContext());
        View view=inflator.inflate(R.layout.skill_card,viewGroup,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProgrammingViewHolder programmingViewHolder, int i) {
        programmingViewHolder.skillName.setText(skillname[i]);
        programmingViewHolder.center.setText(centername[i]);
        programmingViewHolder.trainerName.setText(trainername[i]);
        programmingViewHolder.time.setText(time[i]);
        programmingViewHolder.description.setText(description[i]);
 programmingViewHolder.defaultCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(context,DescrptionActivity.class);

                //ll means LinearLayout
                //ll0 for base linear layout ll1 for linear layout inside ll0 and inside ll1 all textviews are their

                LinearLayout ll0= (LinearLayout) ((CardView)programmingViewHolder.defaultCard).getChildAt(0);
                LinearLayout ll1= (LinearLayout) (ll0).getChildAt(1);

                //Sending item to next intent according to their index

                one.putExtra("skillname",(String) ((TextView)(ll1).getChildAt(0)).getText());
                one.putExtra("centername",(String) ((TextView)(ll1).getChildAt(1)).getText());
                one.putExtra("trainername",(String) ((TextView)(ll1).getChildAt(2)).getText());
                one.putExtra("time",(String) ((TextView)(ll1).getChildAt(3)).getText());
                one.putExtra("description",(String) ((TextView)(ll1).getChildAt(4)).getText());

              context.startActivity(one);

            }
        });
    }

    @Override
    public int getItemCount() {
        return skillname.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView skillName,center,trainerName,time,description;
        CardView defaultCard;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            defaultCard=itemView.findViewById(R.id.defaultCard);
            skillName=itemView.findViewById(R.id.skillName);
            center=itemView.findViewById(R.id.center);
            trainerName=itemView.findViewById(R.id.trainerName);
            time=itemView.findViewById(R.id.time);
            description=itemView.findViewById(R.id.description);
        }
    }
}
