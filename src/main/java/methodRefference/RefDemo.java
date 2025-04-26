package methodRefference;

public class RefDemo {

    public static void main(String[] args) {
        System.out.println("Learning Refference");

        //Refer Static Method
        //ClassName::MethodName
        Runnable runnable=stuff::ThreaData;

        Thread t=new Thread(runnable);

        t.start();
    }
}
