package com.fahim.decorator.solution;

public class Artefact implements AbstractArtifact{


    private String name;
    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {

        return name;
    }

}
