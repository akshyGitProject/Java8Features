package UserDefinedStream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class mainDriver {
    public static void main(String[] args) {

        List<Emp> list=new ArrayList<>();
        Emp e1=new Emp("Akshay",10000,21,"Pune","IT");
        Emp e2=new Emp("Virat",20000,24,"Mumbai","Testing");
        Emp e3=new Emp("Vijay",30000,26,"Delhi","DEV");
        Emp e4=new Emp("Sundar",40000,27,"Pune","Support");
        Emp e5=new Emp("cook",50000,20,"Gurgaon","IT");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        //System.out.println(list);
        System.out.println("---------------------------------------------------------------");

        //13.Get employee with longest Name:
        Emp emp = list.stream().max(Comparator.comparing(Emp::getName)).get();
        System.out.println(emp);


        //11,12.Employee who earning above average salary:

//        double average = list.stream()
//                .mapToDouble(emp -> emp.getSalary())
//                .average().getAsDouble();
//
//        List<Emp> collect = list.stream().filter(emp -> emp.getSalary() > average)
//                .collect(Collectors.toList());
//        System.out.println(collect);
        //10.Get Employee with highest salary

//        Optional<Emp> first = list.stream()
//                .sorted((emp1, emp2) -> ((Double) emp2.getSalary()).compareTo(emp1.getSalary()))
//                .skip(1)
//                .findFirst();
//
//        System.out.println(first);


        //9..Print Employee details from highest to Lowest value
//        List<Emp> sorted = list.stream()
//                .sorted((Emp1, Emp2) -> ((Double) (Emp2.getSalary())).compareTo(Emp1.getSalary()))
//                .collect(Collectors.toList());
//                System.out.println(sorted);


//        //8.Get a map of Emp name and there salary
//        Map<String, Double> map = list.stream()
//                .collect(Collectors.toMap(emp -> emp.getName(), Emp::getSalary));
//
//        System.out.println(map);


//        //7.Get the sum of of salaries and Average:
//        double sum = list.stream()
//                .mapToDouble(Emp::getSalary)
//                .sum();
//                System.out.println(sum);
//
//        double Average = list.stream()
//                .mapToDouble(Emp::getSalary)
//                .average()
//                .orElse(0.0);
//        System.out.println(Average);

        //6.Check all employee having salary greater than specific value:

//        boolean b = list.stream().anyMatch(emp -> emp.getSalary() > 10000);
//        System.out.println(b);


        //5.Get Total salary of employee for specific department:
//        double it = list.stream()
//                .filter(emp -> emp.getDept().equals("IT"))
//                .mapToDouble(str -> str.getSalary())
//                //.mapToDouble(Emp::getSalary())
//                .sum();
//
//        System.out.println(it);



        //4.Get first Employe Where Dept is IT or else throw exception.
//        Emp it = list.stream().filter(emp -> emp.getDept().equals("ITIS"))
//                .findFirst()
//                .orElseThrow();
//        System.out.println(it);


        //3.Print all employee name in UpperCase and Alphabetical Order
//        Function<Emp,String> fun=emp->emp.getName().toUpperCase();
//
//        List<String> collect = list.stream()
//                .map(fun)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

        //2.Find Employees having salary more than 20000
//        Predicate<Emp> pred=emp->emp.getSalary()>20000;
//
//        List<Emp> collect = list.stream().filter(pred)
//                .collect(Collectors.toList());
//        System.out.println(collect);


        //1..Find Employe from specific city and get count:
//        Predicate<Emp> pred=emp->emp.getCity().equals("Pune");
//        List<Emp> pune = list.stream().filter(pred)
//                .collect(Collectors.toList());
//        System.out.println(pune);
//
//        long count = list.stream().filter(pred)
//                .count();
//        System.out.println(count);



    }
}
