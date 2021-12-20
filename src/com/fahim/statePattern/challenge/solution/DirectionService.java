package com.fahim.statePattern.challenge.solution;


public class DirectionService {

    private TravelMode travelMode;

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
    public void getEta(){
        travelMode.getEta();
    }
    public void getDirection(){
        travelMode.getDirection();
    }
}

