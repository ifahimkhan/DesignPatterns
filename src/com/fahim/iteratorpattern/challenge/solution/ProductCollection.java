package com.fahim.iteratorpattern.challenge.solution;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator<Product> createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<Product> {

        private int index;
        private ProductCollection collection;

        public ListIterator(ProductCollection productCollection) {
            this.collection = productCollection;
        }

        @Override
        public boolean hasNext() {
            return index < collection.products.size();
        }

        @Override
        public Product getCurrent() {
            return collection.products.get(index);
        }


        @Override
        public void next() {
            index++;
        }
    }

}
