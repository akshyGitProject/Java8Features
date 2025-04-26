package org.example.Lambda;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable runnable=()->{
            //Thread Body
            for(int i=0;i<5;i++){
                System.out.println("value of i : "+i);
            }
        };

        Thread t=new Thread(runnable);
        t.start();
    }
}
