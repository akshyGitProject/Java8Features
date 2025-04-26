package ConstructorRef;

public class constrMain
{
    public static void main(String[] args) {

        System.out.println("Learning Constructor Refference ");

        Provider provider=Student::new;

        Student student = provider.getStudent();


    }
}
