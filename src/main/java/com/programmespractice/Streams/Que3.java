package com.programmespractice.Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Que3 {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(new Product(1, "CD", 20000),
                                new Product(1, "Monitor", 3000),
                                new Product(3, "CPU", 3000));
                        
                                System.out.println(list.get(0).getProductname());
        //convert from list to set by using stream

        // Set<Product> setlist = list.stream().filter(x->x.getPrice()>=3000).collect(Collectors.toSet());
        // System.out.println(setlist);

        
        // );


        //convert to list to map manually
        Map<String,Integer> map = new HashMap<>();
        for (Product product : list) {
            map.put(product.getProductname(),product.getId());
        }
        for (Map.Entry<String,Integer> mEntry : map.entrySet()) {
            System.out.println(mEntry.getKey()+" :"+mEntry.getValue());
        }


        //by using stream















    }



        
        

    }

