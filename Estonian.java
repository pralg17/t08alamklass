package homework_8_inheritance;

/**
 * Created by User on 06-Apr-17.
 */
public class Estonian extends  Person implements ICountry {

    public Estonian(String name, String nationality) {
        super(name, nationality);
    }

    @Override
    public String Greeting() {
        return "Tere! Ma olen " + nationality + "\nMeil on "+ money();
    }

    @Override
    public String money() {
        return "\u20ac";
    }
}
