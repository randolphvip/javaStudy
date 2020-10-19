package com.java.study.lambda;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        System.out.println(getString(()->  {return "具体的方法实现和返回的内容。这里是返回字符串。";}));   ;

    }
//    定义一个方法，返回一个字符串数据
    private static String getString (Supplier t){
        System.out.println("33333");
        return (String)t.get();
    }

}
