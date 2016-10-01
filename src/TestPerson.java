/**
 * Created by scott_000 on 9/30/2016.
 */
public class TestPerson {
    public static void main(String[] args) {
        String name = "Livia";
        String address = "1234 S. Newberry St.";
        String phone = "123-456-7890";
        String email = "livia@msn.com";

        //Create Person
        Person person1 = new Person(name, address, phone, email);

        System.out.println(person1.toString());

        //Create Student
        Student student1 = new Student(name, address, phone, email);
        System.out.println(student1.toString());

        //Create Faculty
        String officeHours = "8am - 9am";
        String rank = "Senior";
        Faculty faculty1 = new Faculty(name, officeHours, rank);

        System.out.println(faculty1.toString());

        //Create Staff
        String title = "Administrative Assistant";
        Staff staff1 = new Staff(name, title);
        System.out.println(staff1.toString());

        //Create Employee
        String office = "123";
        String salary = "30000";
        Employee employee1 = new Employee(name, office, salary);
        System.out.println(employee1.toString());
    }




}
