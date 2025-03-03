package mb.project.SpaceGym.Person.Repository;

import mb.project.SpaceGym.Person.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
    @Override
    Optional<Person> findById(Long aLong);
}
