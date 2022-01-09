package com.fahim.mediator;

import java.util.List;

public class ArticleListDialogBox extends DialogBox {
    private ListBox articlesListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);


    @Override
    public void changed(UIControl control) {
        if (control == articlesListBox) {
            articleSelected();
        } else if (control == titleTextBox) {
            titleChanged();
        }
    }

    private void titleChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        saveButton.setIsEnabled(!isEmpty);
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setIsEnabled(true);
    }
    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article 1");
        System.out.println("Text box : "+titleTextBox.getContent());
        System.out.println("Button : "+saveButton.getIsEnabled());
    }
}
