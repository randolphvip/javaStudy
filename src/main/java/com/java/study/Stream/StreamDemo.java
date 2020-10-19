package com.java.study.Stream;

import com.java.study.lambda.Persion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Persion> list = new ArrayList<>();
        list.add(new Persion("张曼玉", 27));
        list.add(new Persion("林青霞", 23));
        list.add(new Persion("王祖贤", 23));
        list.add(new Persion("王柏芝", 29));
        list.add(new Persion("邱淑贞", 26));
        Stream<Persion> stream = list.stream();
        /*
            Filter
         */
        stream.filter(s -> s.getName().startsWith("王")).forEach(s -> System.out.println("name:" + s.getName()));

        /**
         * Limit
         */

        stream = list.stream();
        stream.limit(3).forEach(s -> System.out.println("limit3:--name:" + s.getName()));
        /**
         * skip
         */
        stream = list.stream();
        stream.skip(3).forEach(s -> System.out.println("skip3----name:" + s.getName()));


        /**
         * Concat合并流
         */
        Stream<Persion> stream1 = list.stream();
        Stream<Persion> stream2 = list.stream();
        Stream.concat(stream1, stream2).forEach(s -> System.out.println("Concat----name:" + s.getName()));

        /**
         * distinct去重复
         */
        stream1 = list.stream();
        stream2 = list.stream();
        Stream.concat(stream1, stream2).distinct().forEach(s -> System.out.println("Distinct----name:" + s.getName()));

        /**
         * sort排序
         */
        stream = list.stream();
        stream.sorted((s1, s2) -> {
            int mum= s1.getAge()- s2.getAge() ;
            int num2=mum==0?s1.getName().compareTo(s2.getName()):mum;
            return num2;
        }).forEach(s -> System.out.println("sorted----name:"+s.getAge()+"--" + s.getName()));


        stream = list.stream();
        stream.filter(new Predicate<Persion>() {
            @Override
            public boolean test(Persion o) {

                return o.getName().startsWith("王");
            }
        }).forEach((s) -> System.out.println(s));


        HashSet<String> set = new HashSet<>();
        set.stream();

        HashMap<String, String> map = new HashMap<>();
        Stream keys = map.keySet().stream();//key的流
        Stream<String> values = map.values().stream();//values
        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();//实体流


    }

    private static void check(Persion p, Predicate pp) {
        pp.test(p);
    }
}
