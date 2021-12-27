package com.fahim.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<String> {

        BrowseHistory history;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        private int index;

        @Override
        public boolean hasNext() {
            return index < history.urls.length;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
/*
    public class ListIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }


        @Override
        public void next() {
            index++;
        }
    }
*/
}
