package OOPExampleTheory;

import java.time.LocalDate;
import java.time.Period;

public class PersonTwo {
    private String name;
private String surname;
private final LocalDate birthday;
public PersonTwo(LocalDate birthday) {
this.birthday=birthday;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private int age()  {
    LocalDate trenutno=LocalDate.now();
        Period periodVremena=birthday.until(trenutno);
        int age=periodVremena.getYears();
        return age;
    }
    public int getAge() {
        return age();
    }
}
