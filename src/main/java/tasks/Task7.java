package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Damian", "Kolaczyk", 30));
        people.add(new Person("Weronika", "Surma", 5));
        people.add(new Person("Kamil", "Bednarczyk", 19));
        people.add(new Person("Filip", "Kaminski", 41));


        people.stream()
                .sorted((s,s1) -> Integer.compare(s.getAge(), s1.getAge()) * -1)
                .forEach(s -> System.out.println(s));
    }
}
