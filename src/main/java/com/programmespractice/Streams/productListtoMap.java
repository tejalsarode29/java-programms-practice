package com.programmespractice.Streams;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// this is my change 
public class productListtoMap {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(new Product(1, "CD", 3000),
                                new Product(1, "Monitor", 3000),
                                new Product(3, "CPU", 500000));
                               
        Map<String , Integer> littoMap = list.stream().filter(x->x.getPrice()>3000).collect(Collectors.toMap(Product::getProductname, Product::getPrice));
        System.out.println("Conversion List To Map : "+littoMap);


        Map<Integer,String> maplist = new HashMap<>();
        maplist.put(1, "Tejal");
        maplist.put(2,"Kajal");
        maplist.put(3, "Prathmaaa");
        
        for(Map.Entry<Integer,String> entry : maplist.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        //using stream

        
    }
}
