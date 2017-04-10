package homework_8_inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Created by User on 06-Apr-17.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<>();

        listOfPersons.add(new American("Teddy", "american"));
        listOfPersons.add(new Estonian("Juhan", "eestlane"));
        listOfPersons.add(new Russian("Александр", "русский"));

        for (Person person : listOfPersons
                ) {
            System.out.println(person.Greeting() + "\n");
        }


        /*
        Hello! My name is Teddy. I'm american
        We have $

        Tere! Ma olen eestlane
        Meil on €

        Привет! Меня зовут Александр. Я русский
        У нас ₽
        */


    }
}
