package one;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class PersonReader {

    //PersonReader pr = new PersonReader();
    //pr.loadPersons();
    public List<Person> loadPersons() {
        //Iterable, Collection, List, ArrayList
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Nedim", "Žiga", LocalDate.of(1989, 4, 25));
        personList.add(p1);
        personList.add(new Person("Ajla", "Reiz", LocalDate.of(1999, 1, 25)));
        personList.add(new Person("Neila", "Hasanović", LocalDate.of(2009, 9, 1)));
        personList.add(new Person("Selma", "Fatić", LocalDate.of(2012, 1, 23)));
        personList.add(new Person("Berin", "Hubijar", LocalDate.of(1995, 4, 25)));
        personList.add(new Person("Ismar", "Kozica", LocalDate.of(1997, 6, 12)));
        return personList;
    }

}
