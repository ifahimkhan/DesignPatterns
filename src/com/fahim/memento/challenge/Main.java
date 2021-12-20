package com.fahim.memento.challenge;

import javax.print.Doc;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Document document=new Document();
        History history= new History();
        document.setContent("a");
        history.push(document.createState());
        document.setFontSize(1);
        history.push(document.createState());
        document.setPageSize(100);
        history.push(document.createState());
        document.setFontName("A");
        history.push(document.createState());

        System.out.println(document);

        document.restoreState(history.pop());
        System.out.println(document);
        document.restoreState(history.pop());
        document.restoreState(history.pop());
        document.restoreState(history.pop());
        document.restoreState(history.pop());
        System.out.println(document);

    }
}
