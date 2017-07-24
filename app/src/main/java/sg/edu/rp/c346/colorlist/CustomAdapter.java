package sg.edu.rp.c346.colorlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16022667 on 24/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    ArrayList<Color> boxList;

    public CustomAdapter(Context context, int resource, ArrayList<Color> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    //template
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        //Step 3b bind to Ui in each row
        //TextView tvColour = (Textview) rowView.findViewById(R.id.textViewColor);
        ImageView ivBox1 = (ImageView) rowView.findViewById(R.id.imageViewBox1);
        ImageView ivBox2 = (ImageView) rowView.findViewById(R.id.imageViewBox2);

        Color currentItem = boxList.get(position);
        if (currentItem.getColour().equals("blue")) {
            ivBox1.setImageResource(R.drawable.blue_box);
            ivBox2.setImageResource(R.drawable.blue_box);

        } else if (currentItem.getColour().equals("orange")) {
            ivBox1.setImageResource(R.drawable.orange_box);
            ivBox2.setImageResource(R.drawable.orange_box);

        } else {
            ivBox1.setImageResource(R.drawable.brown_box);
            ivBox2.setImageResource(R.drawable.brown_box);

        }



        return rowView;
    }
}