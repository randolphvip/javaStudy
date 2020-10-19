package com.java.study.classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c = Class.forName("com.java.study.classloader.Student");
        Constructor<?> constructor = c.getConstructor(String.class);
        Student s = (Student) constructor.newInstance("林青霞");
        System.out.println(s.getName());

        Field address = c.getField("address");
        address.set(s , "xian");
        System.out.println(s.getAddress()+"------");

        Method[] methods = c.getMethods();
        for (Method m:methods){
            System.out.println(m);
        }


        Method[] methods2 = c.getDeclaredMethods();
        for (Method m:methods2){
            System.out.println(m);
        }
        Method method = c.getMethod("getAddress");

    }
}
