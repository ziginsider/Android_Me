package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by zigin on 25.02.2018.
 */

public class BodyPartFragment extends Fragment {
    public BodyPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        //get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        //set the image resource to the display
        imageView.setImageResource(AndroidImageAssets.getBodies().get(0));

        return rootView;
    }
}
