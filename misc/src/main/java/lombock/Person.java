package lombock;

@lombok.Getter
@lombok.Setter
//@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
//@lombok.EqualsAndHashCode(of = "name")
//@lombok.EqualsAndHashCode(of = "age")
@lombok.EqualsAndHashCode(of = {"name", "age"})
//@lombok.EqualsAndHashCode
//@lombok.ToString(exclude = {"name"})
@lombok.ToString()
public class Person {

    private String name;
    private int age;

    public void sayHello() {
        name = "";
    }
}
