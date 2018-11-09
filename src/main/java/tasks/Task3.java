package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Damian", "Kolaczyk", 30));
        people.add(new Person("Weronika", "Surma", 25));
        people.add(new Person("Kamil", "Bednarczyk", 19));
        people.add(new Person("Filip", "Kaminski", 41));

        //sposob 1
        people.stream()
                .sorted((s,s1) -> Integer.compare(s.getAge(), s1.getAge()) * -1)
                .limit(1)
                .findAny()
                .map(s -> {
                    s.setName("Medrzec " + s.getName());
                    return s;
                })
                .ifPresent(s -> System.out.println(s));

        //sposob 2
        people.stream()
                .max((s,s1) -> Integer.compare(s.getAge(),s1.getAge()) * -1)
                .map(s -> {
                    s.setName("Medrzec "  + s.getName());
                    return s;
                })
                .ifPresent(s -> System.out.println(s));

    }
}
