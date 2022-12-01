package OOPExampleTheory;

import java.time.LocalDate;

public class PersonTestDemo {
    public static void main(String[] args) {
        LocalDate trenutnovrijeme=LocalDate.now();
        LocalDate birthday=LocalDate.of(1987,9,8);
        PersonTwo osoba1=new PersonTwo(birthday);
        System.out.println(osoba1.getAge());
        Student brucos1=new Student(LocalDate.of(2000,1,5));
        System.out.println(brucos1.getAge());
    }
}
