package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Damian", "Kolaczyk", 30));
        people.add(new Person("Weronika", "Surma", 25));
        people.add(new Person("Kamil", "Bednarczyk", 19));
        people.add(new Person("Filip", "Kaminski", 41));


        people.stream()
                .peek(s -> {
                    s.setName(s.getName().substring(0, 1));
                    s.setSurname(s.getSurname().substring(s.getSurname().length() - 1));
                })
                .reduce((s, s1) -> {
                    s.setName(s.getName() + s1.getName());
                    s.setSurname(s.getSurname() + s1.getSurname());
                    s.setAge(s.getAge() + s1.getAge());
                    return s;
                })
                .ifPresent(s -> System.out.println(s));
    }
}
