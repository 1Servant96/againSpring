package peaksoft.entity;

import org.springframework.stereotype.Component;
import peaksoft.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Nursultan", 19, "zhumataev@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Azat", 18, "azat@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Aibek", 18, "aiba@gmail.com"));

    }
    public List<Person> index(){
        return people;
    }
    public Person show(int id){
      return people.stream().filter(x->x.getId() == id).findAny().orElse(null);
    }
    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
    public void update(int id, Person updatedPerson){
     Person personToBeUpdated = show(id);
     personToBeUpdated.setName(updatedPerson.getName());
     personToBeUpdated.setAge(updatedPerson.getAge());
     personToBeUpdated.setEmail(updatedPerson.getEmail());
    }
    public void delete(int id){
        people.removeIf(p -> p.getId() == id);

    }


}
