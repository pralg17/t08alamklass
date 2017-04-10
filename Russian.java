package homework_8_inheritance;

/**
 * Created by User on 06-Apr-17.
 */
public class Russian  extends Person implements ICountry{

    public Russian(String name, String nationality) {
        super(name, nationality);
    }

    @Override
    public String Greeting() {
        return "Привет! Меня зовут " + name +". Я "+nationality + "\nУ нас "+money();
    }

    @Override
    public String money() {
        return "\u20bd";
    }
}
