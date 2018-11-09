package tasks;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;

    @Override
    public int compareTo(Person o) {
        return age < o.getAge() ? 1 : (age == o.getAge() ? 0 : -1);
    }
}
