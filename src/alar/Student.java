package alar;

import java.util.Arrays;
import java.util.jar.JarEntry;

/**
 * Created by AASA on 10.04.2017.
 */
class Student extends Person {
    private String school;
    private String program;
    private Double avgGrade;
    private Double[] grades;

    public void setGrades(Double[] grades){
        this.grades = grades;
        setAvgGrade(grades);
    }

    public Double[] getGrades() {
        return grades;
    }

    private void setAvgGrade(Double[] grades){
        Double sum = 0.0;
        for (Double item: grades){
            sum += item;
        }
        this.avgGrade = sum/grades.length;
    }

    public Double getAvgGrade() {
        return avgGrade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }


    @Override
    public String toString() {
        return "Name: " + getName() + "\nAge: " + getAge() + "\nGender: " + getGender() + "\nSchool: " + school +
                "\nProgram: " + program + "\nAverage Grade: " + avgGrade + "\nGrades: " + Arrays.toString(grades)+ "\n";

    }
}
