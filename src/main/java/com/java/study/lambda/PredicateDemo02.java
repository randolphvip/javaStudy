package com.java.study.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo02 {

    public static void main(String[] args) {
        Persion[] persions = {
                new Persion("张曼玉", 20),
                new Persion("林青霞", 23),
                new Persion("王祖贤", 25),
                new Persion("王柏芝", 29),
                new Persion("邱淑贞", 26)
        };
       List<Persion> startList= myFiler(persions, p->p.getAge()>24, p1->p1.getName().startsWith("王"));
        for(Persion p: startList){
            System.out.println("Name:"+p.getName()+"           "+"Age:"+p.getAge());
        }
    }

    private static ArrayList<Persion> myFiler(Persion[] persions, Predicate<Persion> p1, Predicate<Persion> p2) {
        ArrayList<Persion> list = new ArrayList<>();

        for (Persion str : persions) {
            if (p1.and(p2).test(str)) {
                list.add(str);
            }
        }
        return list;

    }
}
