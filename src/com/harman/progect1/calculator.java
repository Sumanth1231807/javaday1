package com.harman.progect1;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        addition addobj=new addition();
        substraction subobj = new substraction();
        multiplication mulobj = new multiplication();
        division divobj = new division();
        module modobj = new module();

        Integer x,y,addResult,subResult,mulResult,divResult,modResult;
        Scanner input=new Scanner((System.in));
        System.out.println("enter num1");
        x=input.nextInt();
        System.out.println("enter num2");
        y=input.nextInt();
        addResult=addobj.addnum(x,y);
        System.out.println(addResult);
        subResult=subobj.subnum(x,y);
        System.out.println(subResult);
        mulResult=mulobj.mulnum(x,y);
        System.out.println(mulResult);
        divResult=divobj.divnum(x,y);
        System.out.println(divResult);
        modResult=modobj.modnum(x,y);
        System.out.println(modResult);

    }


}
