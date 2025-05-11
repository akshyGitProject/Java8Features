package Stream3Easy;

import java.util.Arrays;
import java.util.List;

public class Startswith {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Banana","Apple","Chery","Kiwi","Guava","Orange","Cheese");

        list1.stream()
                .filter(str->!str.startsWith("C"))
                .forEach(System.out::println);
    }

}
