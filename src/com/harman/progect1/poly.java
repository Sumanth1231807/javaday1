package com.harman.progect1;

public class poly {
    public int addnumbers(int a,int b){
        return a+b;

    }
    public int addnumbers(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        poly p=new poly();
        int result1=p.addnumbers(23,55);
        int result2=p.addnumbers(66,99);
        System.out.println(result1);
        System.out.println(result2);

    }



    }

