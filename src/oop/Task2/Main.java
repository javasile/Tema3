package oop.Task2;

public class Main {
    public static void main(String[] args) {

        Student person = new Student();
        person.setName("Jana");
        person.setAdress("Str. Cucului, fara numar");
        person.setTypeOfStudy("Traseista la pod");
        person.setYearOfStudy(1999);
        person.setPriceOfStudy(7856.65);
        Staff on = new Staff();
        on.setSpecialization("Maturar");
        on.setSalary(1254.35);

        System.out.println(person +"\n"+ on);


    }
}
abstract class Person{

    private String name, adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return String.format("(%S ->%S)", name, adress);
//    }

}


class Student extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private double priceOfStudy;

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getPriceOfStudy() {
        return priceOfStudy;
    }

    public void setPriceOfStudy(double priceOfStudy) {
        this.priceOfStudy = priceOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", priceOfStudy=" + priceOfStudy +
                '}';
    }

}

class Staff extends Person implements Lecturer{

    private String specialization;
    private double salary;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String stud(){
        return lecture;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}

