package stream3Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class sortLength {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Banana","Apple","Chery","Kiwi","Guava","Orange","Kiwi","Apple");

        //3.8 Sorting based on length
//        list1.stream()
//                .sorted(Comparator.comparing(String::length))
//                .forEach(System.out::println);

        //3.9 Find Longest length element:
//        Optional<String> max = list1.stream()
//                .max(Comparator.comparing(String::length));
//
//       max.ifPresent(Str->System.out.println(Str));


        //3.10: Find the list of String having vowels:
      //  List<String> words=Arrays.asList("Apple","sky","try","cry","sad","food","kiwi");

//        words.stream()
//                .filter(str->str.matches(".*[aeiou].*"))
//                .forEach(System.out::println);


        //3.11: Join all String as single word seprated by ,:
//        List<String> words=Arrays.asList("Apple","sky","try","cry","sad","food","kiwi");
//
//        String collect = words.stream()
//                .collect(Collectors.joining(","));
//
//        System.out.print(collect);

        //3.12: reverse each
//        List<String> words=Arrays.asList("Apple","sky","try","cry","sad","food","kiwi");
//        words.stream().
//                map(str->new StringBuilder(str).reverse())
//                .forEach(System.out::println);

        //3.13: remove null and empty:
        List<String> words=Arrays.asList("Apple","","sky","","try","cry","sad",null,"food","kiwi");
        words.stream()
                .filter(str->str!=null && !(str).isEmpty())
                .forEach(System.out::println);
    }
}
