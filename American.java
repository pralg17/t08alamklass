package homework_8_inheritance;

/**
 * Created by User on 06-Apr-17.
 */
public class American extends Person implements ICountry {


    public American(String name,String nationality) {
        super(name,nationality );
    }

    @Override
    public String Greeting() {
        return "Hello! My name is "+ name +  ". I'm " + nationality + "\nWe have " + money();
    }

    @Override
    public String money() {
        return "\u0024";
    }
}
