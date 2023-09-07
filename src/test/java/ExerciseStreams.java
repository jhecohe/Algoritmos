import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class ExerciseStreams {

    @Test
    public void validationStream(){
        String sentence = "Jherson is awesome developer";

        Map<Character, Long> first= sentence.chars()
                .mapToObj( c -> (char) c)
                .collect(groupingBy(x -> x, counting()));

        Optional<Character> letter = sentence.chars()
                .mapToObj( c -> (char) c)
                .filter(c -> first.get(c) == 1)
                .findFirst();


        System.out.println(letter.isPresent() ? letter.get() : "Not found");

//        Long minfirst = sentence.chars()
//                .mapToObj( c -> (char) c)
//                .collect(groupingBy(x -> x, counting()))
//                .entrySet()
//                .stream()
//                .min(comparingByValue())
//                .get()
//                .getValue();
//
//        System.out.println(minfirst);
    }
}
