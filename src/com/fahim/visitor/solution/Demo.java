package com.fahim.visitor.solution;

public class Demo {
    public static void main(String[] args) {
        var wavFile = WavFile.read("myfile.wav");
        wavFile.applyFilter(new NoiseReductionFilter());
        wavFile.applyFilter(new ReverbFilter());
        wavFile.applyFilter(new NormalizeFilter());
    }
}
