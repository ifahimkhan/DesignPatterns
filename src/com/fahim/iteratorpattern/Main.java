package com.fahim.iteratorpattern;

public class Main {
    public static void main(String[] args) {
        BrowseHistory history=new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        Iterator<String> iterator= history.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }

    }
}
