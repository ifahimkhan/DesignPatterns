package com.fahim.decorator.solution;


public class Editor {
    public void openProject(String path) {
        AbstractArtifact[] artefacts = {
                new Artefact("Demo"),
                new Artefact("Main"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };
        // We can apply multiple decorators
        artefacts[0] = new ErrorDecorator(new MainDecorator(artefacts[0]));
        artefacts[2] = new ErrorDecorator(artefacts[2]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
