package straeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMain {
    public static void main (String[] args) {
    int[] ids = new int[] {1, 2, 3, 4};
    Arrays.stream(ids).forEach(System.out::println);
    
    IntStream.of(new int[] {1, 2, 3}).forEach(System.out::println);
    
    IntStream.range(1, 10).forEach(System.out::println);
    
    List<String> wordList = new ArrayList<String>(){
        {
            add("AA");
            add("bb");
            add("cc");
            }
    };
    List<String> outPut = wordList.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
    System.out.println(outPut);
    }
    
}
