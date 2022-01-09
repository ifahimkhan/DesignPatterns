package com.fahim.mediator.observerimpl;


public class ArticleListDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticleListDialogBox() {
        articlesListBox.attach(this::articleSelected);
        titleTextBox.attach(this::titleChanged);
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

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        articlesListBox.setSelection("");
        System.out.println("Textbox : " + titleTextBox.getContent());
        System.out.println("Button : " + saveButton.getIsEnabled());
    }
}
