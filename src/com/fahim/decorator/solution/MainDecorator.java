package com.fahim.decorator.solution;

public class MainDecorator implements AbstractArtifact {

    AbstractArtifact abstractArtifact;

    public MainDecorator(AbstractArtifact abstractArtifact) {
        this.abstractArtifact = abstractArtifact;
    }

    @Override
    public String render() {
        var main=abstractArtifact.render();
        return main+" [MAIN]";
    }
}
