package mb.project.SpaceGym.Person.Controller;

import mb.project.SpaceGym.Person.Service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Person")
public class PersonController {

    private final PersonService services;

    public PersonController(PersonService services) {
        this.services = services;
    }

    @PostMapping
    public ResponseEntity<String>


    @GetMapping

    @GetMapping("/id")


    @PostMapping("/id")

    @DeleteMapping("/id")
}
