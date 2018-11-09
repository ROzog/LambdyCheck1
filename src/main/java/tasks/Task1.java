package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Damian", "Kolaczyk", 30));
        people.add(new Person("Weronika", "Surma", 25));
        people.add(new Person("Kamil", "Bednarczyk", 19));
        people.add(new Person("Filip", "Kaminski", 41));


        people.stream()
                .collect(Collectors.groupingBy(s -> s.getSurname()))
                .values()
                .stream()
                .max((s, s1) -> Integer.compare(s.size(), s1.size()))
                .orElse(new ArrayList<>())
                .stream()
                .findAny()
                .ifPresent(s -> System.out.println(s.getSurname()));
    }
}
