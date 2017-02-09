package com.saranr689.multifragmentsample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by lakeba01 on 9/2/17.
 */

public class FragmentButton extends Fragment {

    Button fragment_button;
    IFragmentButtonClick iFragmentButtonClick;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_button_layout,container,false);
       fragment_button = (Button) rootview.findViewById(R.id.fragment_button);
        fragment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iFragmentButtonClick.fragmentButtonClickListner();
            }
        });
        return  rootview;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        iFragmentButtonClick = (IFragmentButtonClick)context;
    }
}

