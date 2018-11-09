package tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Damian", "Kolaczyk", 30));
        people.add(new Person("Weronika", "Surma", 5));
        people.add(new Person("Kamil", "Bednarczyk", 19));
        people.add(new Person("Filip", "Kaminski", 41));
        people.add(new Person("Filip", "Kaminski", 41));

        people.stream()
                .peek(s -> s.setAge(s.getAge() * 6  - 2))
                .filter(s -> s.getAge() > 50)
                .forEach(s -> System.out.println(s));
    }
}
