package com.fahim.adapter;

import com.fahim.adapter.thirdpartylibfilter.Caramel;

public class CaramelFilterAdapter implements Filter {

    private Caramel caramel;

    public CaramelFilterAdapter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
