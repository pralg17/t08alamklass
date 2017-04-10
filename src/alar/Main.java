package alar;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Heikki");
        person.setLastName("Aasa");
        person.setGender('m');
        person.setAge(39);

        Student student = new Student();
        student.setFirstName("Alar");
        student.setLastName("Aasa");
        student.setGender('m');
        student.setAge(21);
        student.setSchool("Tallinn University");
        student.setProgram("Computer Science");
        student.setGrades(new Double[] {5.0, 4.0, 3.5, 4.0, 2.5, 6.5});

        System.out.println(person.toString());
        System.out.println(student.toString());


        /* RESULTS
        Name: Heikki Aasa
        Age: 39
        Gender: m

        Name: Alar Aasa
        Age: 21
        Gender: m
        School: Tallinn University
        Program: Computer Science
        Average Grade: 4.25
         */
    }
}
