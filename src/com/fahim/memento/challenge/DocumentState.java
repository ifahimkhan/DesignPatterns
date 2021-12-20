package com.fahim.memento.challenge;

public class DocumentState {
    private final String content;
    private final String fontName;
    private final int fontSize;
    private final int pageSize;

    public DocumentState(String content, String fontName, int fontSize, int pageSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.pageSize = pageSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public int getPageSize() {
        return pageSize;
    }
}
