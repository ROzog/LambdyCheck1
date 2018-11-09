package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Damian", "Kolaczyk", 30));
        people.add(new Person("Weronika", "Surma", 5));
        people.add(new Person("Kamil", "Bednarczyk", 19));
        people.add(new Person("Filip", "Kaminski", 41));


        people.stream()
                .filter(s -> checkAgeWithName(s))
                .forEach(s -> System.out.println(s));

    }

    private static boolean checkAgeWithName(Person s) {
        int actualAge = s.getAge();
        int sum = 0;
        while (actualAge != 0){
            sum += s.getAge() % 10;
            actualAge = actualAge / 10;
        }

        return sum == s.getName().length();
    }
}
