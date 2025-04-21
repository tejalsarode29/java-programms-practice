package com.programmespractice.ArrayProgrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteAnElementFromArray {
    public static void main(String[] args) {
        String[] lang = {"Java","C","C++"};

        List list = new ArrayList(Arrays.asList(lang)); // converting array to list
        list.remove(1);

        System.out.println(list);
        
    }
}

//Why it does not take int[] type array instead of the string??
