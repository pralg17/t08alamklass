package alar;

/**
 * Created by AASA on 10.04.2017.
 */
class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Character gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nAge: " + age + "\nGender: " + gender + "\n";
    }
}
