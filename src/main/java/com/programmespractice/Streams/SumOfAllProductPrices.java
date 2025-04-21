package com.programmespractice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class SumOfAllProductPrices {

    public static int getSumOfPrices(List<Product> products){
        int sum =0;
        for (int i = 0; i < products.size(); i++) {
            sum = sum + products.get(i).getPrice();
        }
        return sum;
    }
   //-----------------------------------------------------------------------------------------------------------------
    //sum of all product prices
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(new Product(1, "CPU", 20000),new Product(2, "CDD",50000));
        int sum = SumOfAllProductPrices.getSumOfPrices(list);
        System.out.println(sum);
     //----------------------------------------------------------------------------------------------------------------


    //reduce method takes the sequence of input elements and combines them into a single summary result by repeated result
    //using reduce methof we can perform min max sum string concatination and avg 
     System.out.println("Sum of prices : " +list.stream().map(Product::getPrice).reduce(Integer::sum).get());
     Integer integer = list.stream().map(Product::getPrice).reduce( Integer::min).get();
     System.out.println("Min price : "+integer);

    //  -----------------------------------------------------------------------------------------------------------------

     //sum of all productprice using collectors method
     //summarizingLong() it takes the method referance and gives longsummarystatistics object and gives count , min , max , sum ,avg
     LongSummaryStatistics total = list.stream().collect(Collectors.summarizingLong(Product::getPrice));
     System.out.println(total);

     //--------------------------------------------------------------------------------------------------------------

     //find max and min product usning max method it gives whole product reduce method returns Interger
     Product product = list.stream().max((productp1 , productp2)-> productp1.getPrice()>productp2.getPrice() ? 1 : -1).get();
     System.out.println(product);

     Product product2 = list.stream().min((Productp1,productp2)->Productp1.getPrice()<productp2.getPrice()?1 :-1).get();
     System.out.println(product);

     


    }

     
}
