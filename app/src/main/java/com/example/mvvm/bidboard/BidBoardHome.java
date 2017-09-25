package com.example.mvvm.bidboard;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.mvvm.R;
import com.example.mvvm.databinding.ActivityMainBinding;
import com.example.mvvm.bidboard.model.*;

/**
 * Created by Jon on 9/23/2017.
 */

public class BidBoardHome {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        GimmyoBidItem gimmyoBidItem = new GimmyoBidItem("asdq123asf4124", "Chevrolet", "Camaro", "2016", "image.url.com", 20000, "somewhere in gimmyo", 10, 20);
        binding.setBids(gimmyoBidItem);
    }

}


