package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010265 on 07/24/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<movie> movieArrayList;

    public CustomAdapter(@NonNull Context context, int resource,+
                         @NonNull ArrayList<movie> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieArrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater
                = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent, false);

        //For all new project, modify here
        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvYear = rowView.findViewById(R.id.tvYear);
        TextView tvGenre = rowView.findViewById(R.id.tvGenre);
        ImageView ivRating = rowView.findViewById(R.id.ivRating);

        Movie currentItem = movieArrayList.get(position);

        tvTitle.setText(currentItem.getTitle());
        tvYear.setText(currentItem.getYear());
        tvGenre.setText(currentItem.getGenre());

        if(currentItem.getRated().equals("g")) {
            ivRating.setImageResource(R.drawable.rating_g);
        } else if(currentItem.getRated().equals("pg")) {
            ivRating.setImageResource(R.drawable.rating_pg);
        } else if(currentItem.getRated().equals("pg13")) {
            ivRating.setImageResource(R.drawable.rating_pg13);
        } else if(currentItem.getRated().equals("nc16")) {
            ivRating.setImageResource(R.drawable.rating_nc16);
        } else if(currentItem.getRated().equals("m18")) {
            ivRating.setImageResource(R.drawable.rating_m18);
        } else if(currentItem.getRated().equals("r21")) {
            ivRating.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }

}

