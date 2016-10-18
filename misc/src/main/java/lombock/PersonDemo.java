package lombock;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PersonDemo {

    public static void main(String[] args) {
        Person bob = new Person("Bob", 24);
        System.out.println(bob.getName());
        System.out.println(bob.getAge());
//        System.out.println(bob.equals(new Person("Bob", 24)));
//        System.out.println(bob.equals(new Person("Alice", 24)));
//        System.out.println(bob.equals(new Person("Bob", 22)));

        Set<Person> people = new HashSet<Person>(){{
            add(new Person("Steve", 32));
            add(new Person("John", 24));
            add(new Person("Bob", 35));
            add(new Person("Bob", 24));
            add(new Person("Alice", 35));
        }};

        System.out.println(people.contains(bob));


        System.out.println(bob);


    }
}