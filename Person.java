package homework_8_inheritance;

/**
 * Created by User on 06-Apr-17.
 */
public abstract class Person{

    String name;
    String nationality;

    public Person(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public abstract String Greeting();

}
