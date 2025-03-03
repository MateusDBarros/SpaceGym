package mb.project.SpaceGym.Person.Controller;

import mb.project.SpaceGym.Person.Models.Person;
import mb.project.SpaceGym.Person.Service.PersonService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Person")
public class PersonController {

    private final PersonService services;

    public PersonController(PersonService services) {
        this.services = services;
    }

    @PostMapping
    public ResponseEntity<String> addPerson(@RequestBody Person person) {
        services.addPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(person.getName() + " adicionada com sucesso!");
    }

    @GetMapping
    public ResponseEntity<List<Person>> listAll() {
        List<Person> personList = services.personList();
        return ResponseEntity.status(HttpStatus.OK).body(personList);
    }
    @GetMapping("/id")
    public ResponseEntity<Optional<Person>> findById(@PathVariable long id) {
        Optional<Person> person = services.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(person);
    }

    @PostMapping("/id")
    public ResponseEntity<String> updatePerson(@RequestBody Person person, @PathVariable long id) {
        person.setPersonId(id);
        services.updatePerson(person);
        return ResponseEntity.status(HttpStatus.OK).body("Dados de "+person.getName()+ " atualizada(o) com sucesso!");
    }

    @DeleteMapping("/id")
    public ResponseEntity<String> deletePerson(@PathVariable long id) {
        services.deletePerson(id);
        return ResponseEntity.status(HttpStatus.OK).body("Dados excluidos com sucesso!");
    }
}
