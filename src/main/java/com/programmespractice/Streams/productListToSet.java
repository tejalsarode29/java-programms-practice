package com.programmespractice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class productListToSet {
    public static void main(String[] args) {
        
    
        //convert from list to set by filtering product
        List<Product> list = Arrays.asList(new Product(1, "CD", 3000),
                                new Product(1, "Monitor", 3000),
                                new Product(3, "CPU", 500000));
        Set<Integer> set = list.stream().filter(x->x.getPrice()>2000).map(Product::getPrice).collect(Collectors.toSet());
        System.out.println(set);

        
}
}