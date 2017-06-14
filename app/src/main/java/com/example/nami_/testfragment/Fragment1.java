package com.example.nami_.testfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class Fragment1 extends Fragment {


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        getActivity().setTitle(R.string.fragment_1);
        ImageView imageView = (ImageView) getActivity().findViewById(R.id.img_chuck);
        Picasso.with(getActivity())
                .load("https://unsplash.it/200/300/?random")
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);
    }
}
