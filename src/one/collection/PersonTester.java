package one.collection;

import one.Person;
import one.PersonReader;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PersonTester {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        //Iterable, Collection, List, ArrayList
        List<Person> personList = personReader.loadPersons();
        Iterator<Person> personIterator = personList.iterator();
        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            if (person.getName().equals("Nedim")) {
                personIterator.remove();
            }
        }
//        for (Person person : personList) {
//            if(person.getName().equals("Nedim")){
//                personList.remove(person);
//            }
//        }

        for (Person person : personList) {
            System.out.println(person);
        }
        //Consumer -> funkcionalni interfejs -> jednu apstraktnu metodu
        // ->  ja ću definirati blok koda te apstraktne metode
        Consumer<Person> personConsumer = (person) ->  {
            print(person);
        };
        //        personConsumer.accept(new Person());
//        personConsumer.accept(new Person("Nedim", "Žiga", LocalDate.of(1990, 1, 1)));

        PersonPrinter personPrinter = new PersonPrinter();

        System.out.println("Referenciranje na statičku metodu:");
        personList.forEach(PersonTester::print);
        System.out.println("METHOD referencing");
        personList.forEach(personPrinter::print);
        Box<String> kutijaSaStringovima = new Box<>();
        Box<Integer> kutijaBroj = new Box<>();
        Box<Double> kutijaBroj2 = new Box<>();
        BrojevnaKutija<Integer> brojevnaKutija = new BrojevnaKutija<>();
        BrojevnaKutija<Float> brojevnaKutija1 = new BrojevnaKutija<>();
        BrojevnaKutija<IntegralniBroj> brojevnaKutija2 = new BrojevnaKutija<IntegralniBroj>();


        Supplier<LinkedHashSet<Person>> listSupplier = LinkedHashSet::new;
        HashSet<Person> personHashSet = transferElements(personList, HashSet::new);
        personHashSet.add(new Person("Nedima", "Žiga", LocalDate.now()));
        personHashSet.forEach(System.out::println);
    }

    private static void print(Person p){
        System.out.println(p);
    }

    /**
     *
     *   transferElements(SOURCE, DESTINATION)
     *  SOURCE
     *  DESTINATION
     */
    static <S extends Collection<Person>, D extends Collection<Person>> D transferElements(S source, Supplier<D> destinationCollection){
        D result = destinationCollection.get();
        for(Person p: source){
            result.add(p);
        }
        return result;
    }
}
