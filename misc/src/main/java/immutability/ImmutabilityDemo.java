package immutability;

import lombock.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutabilityDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList(){{
           add(new Person("Bob", 32));
           add(new Person("Alice", 25));
        }};


        people.get(0).setAge(33);

        people.remove(new Person("Bob", 32));

        System.out.println(people);
        people = Collections.unmodifiableList(people);

    }
}
