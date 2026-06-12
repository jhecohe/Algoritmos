package InterfaceFunctional;

import java.util.function.Predicate;

public class BaseFunctions {
    
    
    public static void main(String[] args) {
        
        // Predicate
        Predicate<Integer> esPar = num -> num % 2 == 0;
        System.out.println(esPar.test(4));

    }
    
    
}
