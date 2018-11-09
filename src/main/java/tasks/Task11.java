package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Damian", "Kolaczyk", 30));
        people.add(new Person("Weronika", "Surma", 5));
        people.add(new Person("Kamil", "Bednarczyk", 19));
        people.add(new Person("Filip", "Kaminski", 41));
        people.add(new Person("Filipek", "Kam", 41));
        people.add(new Person("Oskar", "Polak", 41));

        Map<Integer, List<Person>> listMap = people.stream()
                .collect(Collectors.groupingBy(
                        s -> s.getName().length() + s.getSurname().length()));

        System.out.println(listMap);

    }
}
