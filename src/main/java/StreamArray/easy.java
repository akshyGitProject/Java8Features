package StreamArray;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class easy {
    public static void main(String[] args) {

        //List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9,10);

        //1.Odd/Even
//        List<Integer> collect = list.stream().filter(str -> str % 2 != 0).collect(Collectors.toList());
//        System.out.println(collect);

//        int[] arr=new int[]{2,5,4,3,6,7,12,9,10};
//        Arrays.stream(arr)//convert (IntStream is a stream of primitive int values.)
//                .mapToObj(Integer::valueOf)//Converts (maps) each primitive int in the stream to its corresponding Integer object.
//                .filter(str->str%2==0)
//                .forEach(i->System.out.print(i+" "));


        //2.Odd/Even between range:
//        IntStream.range(10,100)
//                .filter(str->str%2==0)
//                .forEach(System.out::println);

        //3.Sort list in asc/Dec order:
//        List<Integer> list= Arrays.asList(2,5,4,3,6,7,12,9,10);
//        List<Integer> collect = list.stream()
//                .sorted(Comparator.comparing(Integer::valueOf))
//                .collect(Collectors.toList());
//        System.out.println(collect);
//
//        int[] arr=new int[]{2,5,4,3,6,7,12,9,10};
//         Arrays.stream(arr)//convert (IntStream is a stream of primitive int values.)
//                .mapToObj(Integer::valueOf)//Converts (maps) each primitive int in the stream to its corresponding Integer object.
//                 .sorted()
//                .forEach(i->System.out.print(i+" "));


        //4.Calculate sum and avg of element present in Array and list of number:
      //  List<Integer> list= Arrays.asList(2,5,4,3,6,7,12,9,10);
//        int sum = list.stream()
//                .mapToInt(Integer::intValue)
//                .sum();
//
//        System.out.println(sum);

//        Optional<Integer> reduce = list.stream().reduce((x, y) -> (x + y)/2);
//
//        reduce.ifPresent(str->System.out.println(str));
//
//        int[] arr=new int[]{2,5,4,3,6,7,12,9,10};


        //5.Max/Min number:
//        List<Integer> list= Arrays.asList(2,5,4,3,6,7,12,9,10);
//        Optional<Integer> max1 = list.stream().max(Comparator.comparing(Integer::valueOf));
//        max1.ifPresent(str->System.out.println(str));
//
//        int[] arr=new int[]{2,5,4,3,66,7,12,9,10};
//        OptionalInt max = Arrays.stream(arr).max();
//        max.ifPresent(str->System.out.println(str));


        //Intermediate:
        //6.Remove Duplicate from list and Array:
//        List<Integer> list= Arrays.asList(2,2,2,2,2,2,5,4,3,5,6,6,7,12,9,10);
//        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);
//
//        int[] arr=new int[]{2,5,5,5,5,5,4,4,3,66,7,12,9,10};
//        Arrays.stream(arr).mapToObj(Integer::valueOf)
//                .distinct()
//                .forEach(str-> System.out.print(str+" "));


        //7.Square of elements:
//        List<Integer> list= Arrays.asList(2,3,4,5,6);
//
//        List<Integer> collect = list.stream()
//                .map(str->str*str).collect(Collectors.toList());
//        System.out.println(collect);
//
//        //reduce.ifPresent(str->System.out.println(str));
//
//        System.out.println("-----------------------");
//
//        int[] arr=new int[]{2,3,4,5,6};
//        Arrays.stream(arr)
//                .map(str->str*str)
//                .forEach(str->System.out.print(str+" "));

        //8.Sum of Squares:
//        List<Integer> list= Arrays.asList(2,3,4,5,6);
//        int collect = list.stream()
//                .map(str->str*str)
//                .reduce(0,(x,y)->x+y);
//        System.out.println(collect);
//
//        System.out.println("-----------------------");
//
//        int[] arr=new int[]{2,3,4,5,6};
//        int reduce = Arrays.stream(arr)
//                .map(str -> str * str)
//                .reduce(0, (x, y) -> x + y);
//        System.out.println(reduce);

        //9.Second largest and smallest
//        List<Integer> list= Arrays.asList(2,3,4,5,6);
//        int collect = list.stream()
//                .sorted((a,b)->b-a)
//                .skip(1)
//                .findFirst().get();
//        System.out.println(collect);
//
//        System.out.println("-----------------------");
//
//        int[] arr=new int[]{2,3,4,5,6};
//        int SecMax = Arrays.stream(arr)
//                .mapToObj(Integer::valueOf)
//                        .sorted((a,b)->b-a).skip(1)
//                                .findFirst().get();
//        System.out.println(SecMax);

        //10.First number greate than 50:
        List<Integer> list= Arrays.asList(2,3,4,51,52,53,54,6);
        int collect = list.stream()
                .filter(num->num>50)
                .findFirst().get();
        System.out.println(collect);

        System.out.println("-----------------------");

        int[] arr=new int[]{2,3,4,51,52,53,54,55,56,57,6};
        int SecMax = Arrays.stream(arr)
                .mapToObj(Integer::valueOf)
                .filter(num->num>50)
                .findFirst().get();
        System.out.println(SecMax);

    }
}

