package com.fahim.iteratorpattern.challenge.solution;

public class Main {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();
        Iterator<Product> iterator = collection.createIterator();
        Product product = new Product(1, "Fahim");
        Product product1 = new Product(2, "Khan");
        collection.add(product);
        collection.add(product1);
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrent());
            iterator.next();
        }
    }
}
