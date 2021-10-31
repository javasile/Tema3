package oop.Task2.rezolvare;

public class Main {
    public static void main(String[] args) {

        Person student = new Student("Ghita", "Bc. 43", "Linbagiu", 1999, 3254.34f);
        Person staff = new Staff("Caraus ", 4500f);

        System.out.println(student +"\n"+ staff);


    }
}
class Person{

    protected String name, adress;

    public Person(){

    }

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

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

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", adress='" + adress + '\'' +
//                '}';
//    }
        @Override
    public String toString() {
        return String.format("%s->%s", name, adress);
    }
}


class Student extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private float priceOfStudy;

    public Student(String name, String adress, String typeOfStudy, int yearOfStudy, float priceOfStudy) {
        super(name, adress);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.priceOfStudy = priceOfStudy;
    }

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

    public float getPriceOfStudy() {
        return priceOfStudy;
    }

    public void setPriceOfStudy(float priceOfStudy) {
        this.priceOfStudy = priceOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\''+
                "adress='" + adress + '\''+
                "typeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", priceOfStudy=" + priceOfStudy +
                '}';
    }
}

class Staff extends Person {

    private String specialization;
    private float salary;

    public Staff(String specialization, float salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\''+
                "adress='" + adress + '\''+
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}

