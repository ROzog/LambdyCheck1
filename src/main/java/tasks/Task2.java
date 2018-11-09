package tasks;

import java.util.ArrayList;
import java.util.List;


public class Task2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Damian", "Kolaczyk", 30));
        people.add(new Person("Weronika", "Surma", 25));
        people.add(new Person("Kamil", "Bednarczyk", 19));
        people.add(new Person("Filip", "Kaminski", 41));


        people.stream()
                .mapToInt(s -> s.getAge())
                .average()
                .ifPresent(s -> System.out.println(s));

//
//        double value =  people.stream()
//                .mapToInt(s -> s.getAge())
//                .average()
//                .orElse(0);


    }
}
