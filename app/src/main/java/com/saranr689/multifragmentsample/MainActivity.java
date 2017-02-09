package com.saranr689.multifragmentsample;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IFragmentButtonClick {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framelayout_container1, new Fragment1(), "fragment1");
        fragmentTransaction.replace(R.id.framelayout_container2,new Fragment2(),"fragment2");
        fragmentTransaction.replace(R.id.framelayout_button_container,new FragmentButton(),"fragmentbutton");
        fragmentTransaction.commit();
    }

    @Override
    public void fragmentButtonClickListner() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framelayout_container1,new Fragment2(),"fragment2");
        fragmentTransaction.replace(R.id.framelayout_container2,new Fragment1(),"fragment1");
        fragmentTransaction.commit();
    }
}
