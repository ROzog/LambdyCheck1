import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("hejo!");
        //==
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hejo!");
            }
        };

        Callable<Integer> callable = ()  -> 4;
        Callable<String> callable1 = ()  -> {
          return  "Hejo!";
        };


        IntBinaryOperator add = (int number1, int number2) -> number1 + number2;
        IntBinaryOperator remove = (number1, number2) -> number1 - number2;

//        System.out.println(add.applyAsInt(5, 5));
//        System.out.println(remove.applyAsInt(5, 5));

        List<String> names = new ArrayList<>();
        names.add("Wojtek");
        names.add("Damian");
        names.add("Weronika");
        names.add("Konrad");
        names.add("Konrad");
        names.add("Justyna");
        names.add("Oskar");


//
//        names.removeIf(oneElement -> oneElement.equals("Wojtek"));
//        names.forEach(s -> System.out.println(s));
//
//
//
//        String nullString = "asd";
//        Optional<String> optional = Optional.ofNullable(nullString);
//
//        if(optional.isPresent()){
//            System.out.println("nie jestem null");
//            System.out.println(optional.get());
//        }
//
//        optional.ifPresent(s -> System.out.println(s));

        names.stream()
                .filter(s -> s.length() > 3)
                .distinct()
                .sorted((s, s1) -> s.compareTo(s1) * -1)
                .skip(2)
                .forEach(s -> System.out.println(s));

    }
}
