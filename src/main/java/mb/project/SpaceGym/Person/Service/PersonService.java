package mb.project.SpaceGym.Person.Service;

import mb.project.SpaceGym.Person.Models.Person;
import mb.project.SpaceGym.Person.Repository.PersonRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepo repository;

    public PersonService(PersonRepo repository) {
        this.repository = repository;
    }

    public void addPerson(Person person) {
        if (person.getName() == null || person.getName().isEmpty())
            throw new IllegalStateException("Insira um nome valido!");
        repository.save(person);
    }

    public List<Person> personList() {
        return repository.findAll();
    }

    public Optional<Person> findById(long id) {
        Optional<Person> person = repository.findById(id);
        return person;
    }

    @Transactional
    public void updatePerson(Person person) {
        if (!repository.existsById(person.getPersonId()))
            throw new IllegalStateException("Usuario não encontrado");
        if (person.getName() == null || person.getName().isEmpty())
            throw new IllegalStateException("Insira um nome valido!");

        repository.save(person);
    }

    public void deletePerson(long id) {
        if (!repository.existsById(id))
            throw new IllegalStateException("Usuario não encontrado");
        repository.deleteById(id);
    }
}
