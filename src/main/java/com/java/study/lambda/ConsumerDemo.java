package com.java.study.lambda;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        myConsumer("林青霞", (String s)-> System.out.println(s+"1"));
        myConsumer("林青霞", (s)-> System.out.println(s+"2"));
        myConsumer("林青霞", s-> System.out.println(s+"3"));
        myConsumer("林青霞", System.out::println);

        myConsumer("林青霞", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(""+s);
            }
        });

        myConsumer("林青霞",s-> System.out.println(new StringBuffer(s).reverse().toString()));




    }

//    default Consumer<T t>than
    private  static  void myConsumer(String str, Consumer <String> t){
        System.out.println("method "+str );
        t.accept(str);
    }
}
