package one;

import java.util.List;

public class OneExecutor {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> persons = personReader.loadPersons();
        for(Person person : persons){
            System.out.println(person);
        }
    }
}
