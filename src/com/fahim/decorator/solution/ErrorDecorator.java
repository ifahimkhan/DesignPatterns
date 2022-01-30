package com.fahim.decorator.solution;

public class ErrorDecorator implements AbstractArtifact {
    AbstractArtifact artifact;

    public ErrorDecorator(AbstractArtifact artifact) {
        this.artifact = artifact;
    }

    @Override
    public String render() {
        var mainArtifact=artifact.render();
        return mainArtifact+" [Error] ";
    }
}
