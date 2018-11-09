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
        return surname.compareTo(o.getSurname());
    }
}
