package com.example.inclassassignment08_xuel;


import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android. support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class QuestionViewHolder extends RecyclerView.ViewHolder{
    public ImageView countryImage;
    public CardView cardView;
    public TextView questionCountry;
    public TextView countryQuestion;
    public boolean isTrue;



    public QuestionViewHolder (View itemView, final Context context){
    super(itemView);
    cardView=(CardView) itemView. findViewById(R.id.card_view);
    countryImage=(ImageView)itemView.findViewById(R.id.country_image);
    questionCountry=(TextView)itemView.findViewById(R.id.question_country);
    countryQuestion=(TextView)itemView.findViewById(R.id.country_question);


    cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Toast.makeText(context,String.valueOf(isTrue) ,Toast.LENGTH_SHORT).show();
        }
    });
}

}
