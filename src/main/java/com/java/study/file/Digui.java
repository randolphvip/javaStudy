package com.java.study.file;

public class Digui {
    public static void main(String[] args) {
        Digui digui = new Digui();

        System.out.println(digui.f2(1,100));
        System.out.println("--"+digui.f3(100));

    }

    private int f(int n){
        if (n==1 || n==2){
            return 1;
        }
        return  f(n-1)+ f(n-2);

    }
    private int f2(int s, int n){
       if((s+1)==n){
           return  s+n;
       }
        System.out.println("S:"+s+" N"+n);
        return f2(s+1, n )+s;
    }
    private int f3(int n){
        if(n==1){
            return 1;
        }
        return n + f3(n-1);
    }

}
