package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 17010265 on 07/24/2018.
 */

public class moviedetailsactivity extends AppCompatActivity {

    ImageView ivRated;
    TextView tvTitle, tvYear, tvGenre, tvDescrip, tvWatch, tvTheatre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);0
        setContentView(R.layout.moviedetails);

        ivRated=findViewById(R.id.ivRating);
        tvTitle=findViewById(R.id.tvTitle);
        tvYear=findViewById(R.id.tvYear);
        tvGenre=findViewById(R.id.tvGenre);
        tvDescrip=findViewById(R.id.tvDescription);
        tvWatch=findViewById(R.id.tvWatchOn);
        tvTheatre=findViewById(R.id.tvTheatre);

        Intent intentReceived = getIntent();

        String title = intentReceived.getStringExtra("title");
        String year = intentReceived.getStringExtra("year");
        String genre = intentReceived.getStringExtra("genre");
        String description = intentReceived.getStringExtra("desc");
        String watch = intentReceived.getStringExtra("watchDate");
        String theatre = intentReceived.getStringExtra("theatre");
        String rated = intentReceived.getStringExtra("rated");

        tvTitle.setText(title);
        tvYear.setText(year+"-");
        tvGenre.setText(genre);

        tvDescrip.setText("\n"+description+"\n");
        tvWatch.setText("Watch on: "+watch);
        tvTheatre.setText("In Theatre: "+theatre+"\n");

        if(rated.equalsIgnoreCase("g")){
            ivRated.setImageResource(R.drawable.rating_g);

        }else if(rated.equalsIgnoreCase("pg")) {
            ivRated.setImageResource(R.drawable.rating_pg);

        }else if(rated.equalsIgnoreCase("pg13")) {
            ivRated.setImageResource(R.drawable.rating_pg13);

        }else if(rated.equalsIgnoreCase("nc16")) {
            ivRated.setImageResource(R.drawable.rating_nc16);

        }else if(rated.equalsIgnoreCase("m18")) {
            ivRated.setImageResource(R.drawable.rating_m18);

        }else{
            ivRated.setImageResource(R.drawable.rating_r21);
        }

    }
}
