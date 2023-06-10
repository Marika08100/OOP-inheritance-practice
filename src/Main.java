// Importáljuk a package-ekbe rendezett classokat

import data.Person;
import data.Staff;
import data.Student;

public class Main {
    public static void main(String[] args) {
        // Ezt nyugodtan módosítsd!
        Person person = new Person("Aurelia Montague" , "123 Main St, NY, USA");
        Staff staff = new Staff("Aurelia Montague", "123 Main St, NY, USA", "Avalon Academy", 1750);
        Student student = new Student("MArika", "Csik", "Progmatic", 2023, 115);

        System.out.println(person.toString());
        System.out.println(staff.toString());
        System.out.println(student.toString());
    }
}
