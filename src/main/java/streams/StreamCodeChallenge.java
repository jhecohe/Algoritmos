package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCodeChallenge {

    //Merge two sorted lists into a single sorted list using Java streams

//    public static List<String> mergeLists(List<String> aList, List<String>  bList) {
//        return Stream.of(aList, bList)
//                .flatMap(Collection::stream)
//                .toList();
//    }

    //inet solution
//    public static List<String> mergeLists(List<String> aList, List<String>  bList) {
//        return Stream.concat(aList.stream(), bList.stream()).toList();
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(mergeLists(Arrays.asList("toga", "toogaa"), Arrays.asList("tooogaa", "DOSMIIILL")));
//    }
/*
    // Check if a list of integers contains a prime number using Java streams

//    public static boolean findPrimeNumber(int[] numArray) {
//
//        //my solution
//        return Arrays.stream(numArray) //using Arrays.stream lets me generate a Stream of ints
//                .mapToObj(n -> {
//                    if(n <= 1) {
//                        return false;
//                    }
//
//                    for(int i = 2; i < n; i++) {
//                        if(n % i == 0) {
//                            return false;
//                        }
//                    }
//
//                    return true;
//                })
//                .filter(n -> n) //n (now boolean) equals true
//                .findAny()
//                .orElse(false);
//    }

    //inet solution
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean findPrimeNumber(int[] numArray) {
        return Arrays.stream(numArray).anyMatch(StreamCodeChallenge::isPrime);
    }


    public static void main(String[] args) {
        System.out.println(findPrimeNumber(new int[]{1, 4, 6, 11}));
    }

*/


/*

        //Find the longest string in a list of strings using Java streams

    public static Optional<String> findLongestString(String[] stringArray) {
        //my solution
        return Stream.of(stringArray)
                .max(String::compareTo);


        //inet solution
        //return Stream.of(stringArray)
        //        .max(Comparator.comparingInt(String::length));
}

public static void main(String[] args) {
    System.out.println(findLongestString(new String[]{"desconchinflo", "supercalifragilisticoespialidoso", "chango"}));
}
*/

    //Calculate the average age of a list of Person objects using Java streams

    /*
        public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static double getAgePersonAvg(Person[] persons) {
        //my solution
        //return (double) Stream.of(persons)
        //        .map(Person::getAge)
        //        .reduce(Integer::sum)
        //        .orElse(0)/persons.length;

        //inet solution (mapToInt enables all Integer functionalities, such as average())
        return Stream.of(persons)
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

    }

    public static void main(String[] args) {
        System.out.println(getAgePersonAvg(new Person[]{
                new Person("Erney", 30),
                new Person("Alfredo", 25),
                new Person("Schneider", 31),
                new Person("Boomer", 22)
        }));
    }
     */
}
