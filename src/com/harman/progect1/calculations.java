package com.harman.progect1;

import java.util.Scanner;

public class calculations extends mycalculator {
    public static void main(String[] args) {
        calculations calc=new calculations();
        Scanner input=new Scanner(System.in);
        int x,y,addresult,subresult;
        System.out.println("enter num1");
        x=input.nextInt();
        System.out.println("enter num2");
        y=input.nextInt();
        addresult=calc.add2numbers(x,y);
        subresult=calc.sub2numbers(x,y);
        System.out.println(addresult);
        System.out.println(subresult);


    }
}
