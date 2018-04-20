package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v4.content.ContextCompat;
import java.util.ArrayList;

/**
 * Created by alek on 22/03/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;
    private MediaPlayer mediaPlayer;

    public WordAdapter (Activity context, ArrayList<Word> numbers, int colorResourceId) {
        super(context, 0, numbers);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        final Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwak);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        englishTextView.setText(currentWord.getDefaultTranslation());


        if (currentWord.getHasImage() == true) {
            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
            iconView.setVisibility(View.VISIBLE);
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            iconView.setImageResource(currentWord.getMiwokImage());
        }

        if (currentWord.getHasImage() == false) {
            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
            iconView.setVisibility(View.GONE);
        }

        View layout = listItemView.findViewById(R.id.linear_layout_list_item);
        int colour = ContextCompat.getColor(getContext(), mColorResourceId);
        layout.setBackgroundColor(colour);

        return listItemView;

    }

}
