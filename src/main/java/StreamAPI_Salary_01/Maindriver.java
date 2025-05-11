package StreamAPI_Salary_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Maindriver {
    public static void main(String[] args) {

        List<Emp> employees=new ArrayList<>();

        Emp e1=new Emp("akshay",21,10000);
        Emp e2=new Emp("akki",22,20000);
        Emp e3=new Emp("manoj",23,30000);
        Emp e4=new Emp("monali",26,40000);
        Emp e5=new Emp("aopq",27,50000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        System.out.println("Employee data before Increment : ");
        System.out.println(employees);

//        employees.stream().map(e->{
//            if(e.getAge()>25){
//                e.setSalary(e.getSalary()*1.1);
//            }
//            return e;
//        }).collect(Collectors.toList());

        //Problem 2:one a should present
//        List<Double> collect = employees.stream().filter(e -> e.getAge() % 2 != 0)
//                .filter(e -> e.getName().toLowerCase().chars()
//                        .filter(ch -> ch == 'a').count() == 1).map(Emp::getSalary)
//                .collect(Collectors.toList());

        //Problem3: no limitaion on numbers of a in name
        List<Double> collect = employees.stream()
                .filter(e -> e.getAge() % 2 != 0) // age is odd
                .filter(e -> e.getName().toLowerCase().contains("a")) // name contains 'a' at least once
                .map(Emp::getSalary)
                .collect(Collectors.toList());


        System.out.println("After Filtering : ");
        System.out.println(collect);


    }
}
