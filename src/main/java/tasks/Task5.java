package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Damian", "Kolaczyk", 30));
        people.add(new Person("Weronika", "Surma", 25));
        people.add(new Person("Kamil", "Bednarczyk", 19));
        people.add(new Person("Filip", "Kaminski", 41));

        List<Integer> ages = people.stream()
                .map(s -> s.getAge())
                .collect(Collectors.toList());

    }
}
