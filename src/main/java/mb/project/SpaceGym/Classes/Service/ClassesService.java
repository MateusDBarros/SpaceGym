package mb.project.SpaceGym.Classes.Service;

import mb.project.SpaceGym.Classes.Models.Classes;
import mb.project.SpaceGym.Classes.Repository.ClassesRepository;
import mb.project.SpaceGym.Person.Repository.PersonRepo;
import mb.project.SpaceGym.Person.Service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class ClassesService {

    private final ClassesRepository repository;
    private final PersonRepo personRepo;

    public ClassesService(ClassesRepository repository, PersonRepo personRepo) {
        this.repository = repository;
        this.personRepo = personRepo;
    }

    public void createClass(Classes classes) {
        if (classes.getName() == null || classes.getName().isEmpty())
            throw new IllegalStateException("Insira um nome valida para a classe!");

    }



}
