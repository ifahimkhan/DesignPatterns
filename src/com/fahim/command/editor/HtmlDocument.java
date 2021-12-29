package com.fahim.command.editor;

public class HtmlDocument {

    private String content;

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }
    public void makeItalic() {
        content = "<i>" + content + "</i>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
