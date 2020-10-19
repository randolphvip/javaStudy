package com.java.study.lambda;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convert("32",Integer::parseInt);
    }
    private  static  void convert (String s, Function<String,Integer> fun){
        System.out.println("input content is "+s);
       Integer i= fun.apply(s);
        System.out.println(i.getClass());

    }
}
