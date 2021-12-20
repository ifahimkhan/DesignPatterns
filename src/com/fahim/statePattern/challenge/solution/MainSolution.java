package com.fahim.statePattern.challenge.solution;

public class MainSolution {

    public static void main(String[] args) {
        DirectionService directionService = new DirectionService();
        directionService.setTravelMode(new BicyclingMode());
//        directionService.setTravelMode(new WalkingMode());
//        directionService.setTravelMode(new TransitMode());
        directionService.getEta();
        directionService.getDirection();
    }
}
