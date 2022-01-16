package com.fahim.adapter;

import com.fahim.adapter.thirdpartylibfilter.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());

//        imageView.apply(new Caramel());
        imageView.apply(new CaramelFilterAdapter(new Caramel()));
    }

}
