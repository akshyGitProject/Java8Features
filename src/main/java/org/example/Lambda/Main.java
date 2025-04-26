package org.example.Lambda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //MyInter
        MyInter i=()-> System.out.println("This is Lambda");

        i.sayHello();

        //SumInter

//        SumInter sumInter=(int a,int b)->{
//            return a+b;
//        };

        SumInter sumInter=(a,b)->a+b;

        System.out.println(sumInter.sum(5,9));

        //StrLenInter

        StrLenInter strLenInter=(str)->str.length();

        System.out.println(strLenInter.getLenth("Akshay Takale"));


    }
}