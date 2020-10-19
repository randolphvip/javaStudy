package com.java.study.lambda;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

      boolean b=  checkAge(new Persion("张曼玉",20),o -> o.getAge()==20);
        System.out.println("---"+b);
    }
    private static boolean checkAge(Persion p, Predicate<Persion> pre){
        return pre.test(p);
    }
    private static boolean checkAge2(Persion p, Predicate<Persion> pre){
        return pre.negate().test(p);
    }

    private static boolean checkString (Persion p, Predicate<Persion> p1, Predicate<Persion> p2){

        return  p1.and(p2).test(p);

    }

}
