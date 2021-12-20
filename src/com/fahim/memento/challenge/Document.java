package com.fahim.memento.challenge;

import com.fahim.memento.EditorState;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;
    private int pageSize;

    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize, pageSize);
    }

    public void restoreState(DocumentState state) {
        this.content = state.getContent();
        this.fontName = state.getFontName();
        this.fontSize = state.getFontSize();
        this.pageSize = state.getPageSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
