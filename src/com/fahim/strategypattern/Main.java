package com.fahim.strategypattern;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage=new ImageStorage(new JpegCompressor(),new BlackAndWhiteFilter());
        imageStorage.store("A");
        imageStorage=new ImageStorage(new JpegCompressor(),new BlackAndWhiteFilter());
        imageStorage.store("A");

    }
}
