package unidade1;

import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;

public class TesteMap {

	public static void main(String[] args) {

		List<String> words= Arrays.asList("Java Dev Journal","Java", "Spring Boot","Java 8");

        List<Integer> wordCount = words.stream()
                        .map(String::length)
                        .collect(Collectors.toList());

        wordCount.forEach(System.out::println);

        // imprime em maiúsculo
        String s = "hello123";
        Formatter f = new Formatter();
        f.format("%S", s);
        System.out.println(f);
	}

}
