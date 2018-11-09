import lombok.val;
import lombok.var;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

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

        List<Person> people = new ArrayList<>();
        people.add(new Person("Damian", "Kolaczyk", 30));
        people.add(new Person("Weronika", "Surma", 25));
        people.add(new Person("Kamil", "Bednarczyk", 19));
        people.add(new Person("Filip", "Kaminski", 41));


//        Collections.sort(people);
//        System.out.println(people);

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
//
        Map<Integer, List<Person>>  groupedPerson = names.stream()
                .filter(s -> s.length() > 3)
                .distinct()
                .sorted()
                .map(s -> new Person(s, s, s.length() * 2))
                .collect(Collectors.groupingBy(s -> s.getAge()));

        System.out.println(groupedPerson);
    }
}
