import java.util.Date;

/**
 * Created by scott_000 on 9/29/2016.
 */
public class Person {
    public String name;
    public String phone;
    public String address;
    public String email;
    public Date dateCreated;


    //Default Constructor
    public Person(){

    }


    //Constructor
    public Person(String name, String address, String phone, String email ){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }


    @Override
    public String toString(){
        return "Person: " + this.name;
    }
}

//Student Class
class Student extends Person{
    public final String[] gradeLevel = {"Freshman", "Sophmore", "Junior", "Senior"};

    //Default Constructor
    public Student(){

    }
    //Constructor
    public Student(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }


    @Override
    public String toString(){
        return "Student: " + name;
    }


}

//Employee Class
class Employee extends Person {
    public String office;
    public String salary;
    public Date dateHired;

    //Default Constructor
    public Employee(){

    }

    //Constructor
    public Employee(String name, String office, String salary){
        this.name = name;
        this.office = office;
        this.salary = salary;
    }

    //Get Date
    public void getDateHired(){
        Date date = new Date();

    }

    @Override
    public String toString(){
        return "Employee: " + this.name;
    }
}

class Faculty extends Employee{
    String officeHours;
    String rank;

    //Default Constructor
    public Faculty(){

    }

    //Constructor
    public Faculty(String name, String officeHours, String rank){
        this.name = name;
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Faculty: " + this.name;
    }


}

class Staff extends Employee {
    public String title;

    //Default Constructor
    public Staff(){

    }

    //Constructor
    public Staff(String name, String title){
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + this.name;
    }


    public java.util.Date getDateCreated() {

        return dateCreated;
    }
}
