package com.java.study.classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            Class<?> c= Class.forName("com.java.study.classloader.Student");
        Constructor<?>[] constructors = c.getConstructors();//只能拿到共有的构造方法
        for (Constructor cons:constructors){
            System.out.println(cons);
        }

        Constructor<?>[] constructors1 =  c.getDeclaredConstructors();

        for (Constructor cons:constructors1){
            System.out.println(cons);
        }


       Constructor cons= c.getConstructor();
       Student student=(Student)  cons.newInstance();
        student.setAddress("---------");
        System.out.println(student+"3333");
    }

    private  static void  getClass2() throws ClassNotFoundException {
        Class<Student> c1 = Student.class;
        System.out.println(c1);
        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);
        System.out.println("-----");


        Student s1 = new Student();
        Class<? extends Student> s2 = s1.getClass();
        System.out.println(c1 == s2);
        System.out.println("-----");

        Class<?> c4= Class.forName("com.java.study.classloader.Student");

        System.out.println("-----");
        System.out.println(c1==c4);


    }
}
